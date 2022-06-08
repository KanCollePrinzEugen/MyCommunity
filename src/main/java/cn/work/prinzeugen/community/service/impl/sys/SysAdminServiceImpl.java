package cn.work.prinzeugen.community.service.impl.sys;

import cn.hutool.crypto.digest.MD5;
import cn.work.prinzeugen.community.entity.Admin;
import cn.work.prinzeugen.community.entity.sys.SysAdmin;
import cn.work.prinzeugen.community.entity.sys.SysRole;
import cn.work.prinzeugen.community.mapper.sys.SysAdminMapper;
import cn.work.prinzeugen.community.mapper.sys.SysRoleMapper;
import cn.work.prinzeugen.community.service.sys.ISysAdminService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Service
public class SysAdminServiceImpl extends ServiceImpl<SysAdminMapper, SysAdmin> implements ISysAdminService {
    @Autowired
    private SysAdminMapper sysAdminMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public SysAdmin validateAdmin(String loginName, String loginPwd) {
        loginPwd = MD5.create().digestHex16(loginPwd);
        QueryWrapper<SysAdmin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("login_name", loginName);
        queryWrapper.eq("password", loginPwd);
        return sysAdminMapper.selectOne(queryWrapper);
    }

    @Override
    public int registerAdmin(String loginName, String loginPwd, String tel, String email) {
        SysAdmin sysAdmin = new SysAdmin(loginName, loginPwd, tel, email);
        return sysAdminMapper.insert(sysAdmin);
    }
}
