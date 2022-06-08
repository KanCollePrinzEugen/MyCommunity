package cn.work.prinzeugen.community.service.sys;

import cn.work.prinzeugen.community.entity.sys.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色表 服务类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
public interface ISysRoleService extends IService<SysRole> {
    List<SysRole> getAdminRoles(Integer adminId);
}
