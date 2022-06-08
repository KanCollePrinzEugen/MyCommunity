package cn.work.prinzeugen.community.service.impl.sys;

import cn.work.prinzeugen.community.entity.sys.SysRole;
import cn.work.prinzeugen.community.mapper.sys.SysRoleMapper;
import cn.work.prinzeugen.community.service.sys.ISysRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> getAdminRoles(Integer adminId) {
        return sysRoleMapper.findUserRole(adminId);
    }
}
