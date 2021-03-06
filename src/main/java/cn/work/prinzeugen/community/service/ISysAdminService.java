package cn.work.prinzeugen.community.service;

import cn.work.prinzeugen.community.entity.SysAdmin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 管理员表 服务类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
public interface ISysAdminService extends IService<SysAdmin> {
    /**
     *
     * @param loginName
     * @param loginPwd
     * @return
     */
    SysAdmin validateAdmin(String loginName, String loginPwd);

    /**
     *
     * @param loginName
     * @param loginPwd
     * @param tel
     * @param email
     * @return
     */
    int registerAdmin(String loginName, String loginPwd, String tel, String email);
}
