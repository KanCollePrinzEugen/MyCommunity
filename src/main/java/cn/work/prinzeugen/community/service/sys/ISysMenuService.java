package cn.work.prinzeugen.community.service.sys;

import cn.work.prinzeugen.community.entity.sys.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
public interface ISysMenuService extends IService<SysMenu> {
    List<SysMenu> getAllMenu(Byte state);
    List<SysMenu> getMenuByUserId(Integer adminId);
}
