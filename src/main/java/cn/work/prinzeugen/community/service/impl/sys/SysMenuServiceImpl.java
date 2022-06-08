package cn.work.prinzeugen.community.service.impl.sys;

import cn.work.prinzeugen.community.entity.sys.SysAd;
import cn.work.prinzeugen.community.entity.sys.SysMenu;
import cn.work.prinzeugen.community.mapper.sys.SysAdMapper;
import cn.work.prinzeugen.community.mapper.sys.SysMenuMapper;
import cn.work.prinzeugen.community.service.sys.ISysAdService;
import cn.work.prinzeugen.community.service.sys.ISysMenuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author PrinzEugen
 * @since 2022-04-15
 */
@Service
@CacheConfig(cacheNames = "menus_cache")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Override
    @Cacheable(key = "#root.methodName")
    public List<SysMenu> getAllMenu(Byte state){
        QueryWrapper<SysMenu> queryWrapper = null;
        if (state != null) {
            queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("state", state);
        }
        return sysMenuMapper.selectList(queryWrapper);
    }

    @Override
    public List<SysMenu> getMenuByUserId(Integer userId) {
        return sysMenuMapper.getMenusByUserId(userId);
    }
}
