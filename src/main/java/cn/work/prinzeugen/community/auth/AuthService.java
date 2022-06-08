package cn.work.prinzeugen.community.auth;

import cn.work.prinzeugen.community.entity.Admin;
import cn.work.prinzeugen.community.entity.sys.SysAdmin;
import cn.work.prinzeugen.community.mapper.sys.SysAdminMapper;
import cn.work.prinzeugen.community.mapper.sys.SysRoleMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {
    @Autowired
    private SysAdminMapper sysAdminMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<SysAdmin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("login_name", username);
        SysAdmin sysAdmin = sysAdminMapper.selectOne(queryWrapper);
        if (sysAdmin == null) {
            throw new UsernameNotFoundException("账号不存在");
        }
        Admin admin = new Admin(sysAdmin);
        admin.setUsername(username);
        admin.setRoles(sysRoleMapper.findUserRole(sysAdmin.getId()));
        return admin;
    }
}
