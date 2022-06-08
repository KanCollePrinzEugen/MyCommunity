package cn.work.prinzeugen.community.auth;

import cn.work.prinzeugen.community.entity.sys.SysMenu;
import cn.work.prinzeugen.community.service.sys.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserPermissionEvaluator implements PermissionEvaluator {
    @Autowired
    ISysMenuService sysMenuService;
    /**
     *
     * @param authentication 用户身份
     * @param targetDomainObject 请求的路径
     * @param permission 请求路径的权限
     * @return 是否通过
     */
    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        UserModel userModel = (UserModel) authentication.getPrincipal();
        List<SysMenu> menus = sysMenuService.getMenuByUserId(userModel.getId());
        List<String> rolePermissions = new ArrayList<>();
        for (SysMenu menu : menus) {
            rolePermissions.add(menu.getPattern());
        }
        //对比用户可访问的地址中是否包含当前地址
        return rolePermissions.contains(permission.toString());
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        return false;
    }
}
