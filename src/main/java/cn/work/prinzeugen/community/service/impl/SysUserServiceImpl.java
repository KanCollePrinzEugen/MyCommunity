package cn.work.prinzeugen.community.service.impl;

import cn.work.prinzeugen.community.entity.SysUser;
import cn.work.prinzeugen.community.mapper.SysUserMapper;
import cn.work.prinzeugen.community.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
//import sun.security.provider.MD5;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    @Override
    public SysUser doLogin(String loginName, String loginPwd) {
//        loginPwd = MD5.create().digestHex(loginPwd);
        return null;
    }
}
