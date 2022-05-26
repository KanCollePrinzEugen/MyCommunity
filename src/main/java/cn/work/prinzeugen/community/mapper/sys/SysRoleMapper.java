package cn.work.prinzeugen.community.mapper.sys;

import cn.work.prinzeugen.community.entity.sys.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
    /**
     * findUserRole
     *
     * @param userId
     * @return
     */
    List<SysRole> findUserRole(Integer userId);
}
