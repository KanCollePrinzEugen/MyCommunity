package cn.work.prinzeugen.community.mapper;

import cn.work.prinzeugen.community.entity.SysAdmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 管理员表 Mapper 接口
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Mapper
public interface SysAdminMapper extends BaseMapper<SysAdmin> {
    /**
     * 在数据库中添加新用户的信息
     * @param instance
     * @return
     */
    int insertData(SysAdmin instance);
}
