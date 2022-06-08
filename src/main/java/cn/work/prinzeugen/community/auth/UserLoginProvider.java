package cn.work.prinzeugen.community.auth;

import cn.work.prinzeugen.community.entity.sys.SysAdmin;
import cn.work.prinzeugen.community.entity.sys.SysRole;
import cn.work.prinzeugen.community.service.sys.ISysAdminService;
import cn.work.prinzeugen.community.service.sys.ISysRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class UserLoginProvider implements AuthenticationProvider {
    final ISysAdminService sysAdminService;
    final ISysRoleService sysRoleService;

    public UserLoginProvider(ISysAdminService sysAdminService, ISysRoleService sysRoleService) {
        this.sysAdminService = sysAdminService;
        this.sysRoleService = sysRoleService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //获取请求数据中的用户名
        String loginName = (String) authentication.getPrincipal();
        //获取登录密码
        String password = (String) authentication.getCredentials();
        QueryWrapper<SysAdmin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("login_name", loginName);
        SysAdmin sysAdmin = sysAdminService.getOne(queryWrapper);
        //判断账户是否存在
        if (sysAdmin == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        //判断密码是否正确
        if(new BCryptPasswordEncoder().matches(password, sysAdmin.getPassword())){
            throw new BadCredentialsException("密码错误");
        }
        //判断用户是否被冻结
        if (sysAdmin.getState() <= 0) {
            throw new LockedException("该用户已被冻结，请和管理员联系");
        }
        //角色集合
        Set<GrantedAuthority> authoritySet = new HashSet<>();
        //查询用户角色
        List<SysRole> roles = sysRoleService.getAdminRoles(sysAdmin.getId());
        //添加用户角色信息
        for (SysRole role : roles) {
            authoritySet.add(new SimpleGrantedAuthority(role.getDesction()));
        }
        UserModel userModel = new UserModel();
        userModel.setId(sysAdmin.getId());
        userModel.setUsername(sysAdmin.getUsername());
        userModel.setPassword(sysAdmin.getPassword());
        userModel.setAuthorities(authoritySet);
        //进行登录
        return new UsernamePasswordAuthenticationToken(userModel, password, authoritySet);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
