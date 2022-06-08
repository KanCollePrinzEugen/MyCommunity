package cn.work.prinzeugen.community.mapper.sys;

import cn.work.prinzeugen.community.entity.sys.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysMenuMapper extends BaseMapper<cn.work.prinzeugen.community.entity.sys.SysMenu> {
    List<SysMenu> getMenusByUserId(Integer userId);
}
