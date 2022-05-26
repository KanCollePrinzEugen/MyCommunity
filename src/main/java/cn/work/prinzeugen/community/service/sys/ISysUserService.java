package cn.work.prinzeugen.community.service.sys;

import cn.work.prinzeugen.community.entity.sys.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
public interface ISysUserService extends IService<SysUser> {
    SysUser doLogin(String loginName, String loginPwd);
}
