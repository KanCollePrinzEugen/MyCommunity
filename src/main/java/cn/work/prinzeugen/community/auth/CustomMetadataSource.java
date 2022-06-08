package cn.work.prinzeugen.community.auth;

import cn.work.prinzeugen.community.entity.sys.SysMenu;
import cn.work.prinzeugen.community.entity.sys.SysRole;
import cn.work.prinzeugen.community.service.sys.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * 通过访问的URL地址获取地址范围所需要的角色
 */
@Component
public class CustomMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    private ISysMenuService sysMenuService;

    AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String reqUrl = ((FilterInvocation)object).getRequestUrl();
        List<SysMenu> menus = sysMenuService.getAllMenu((byte)1);
        for (SysMenu menu : menus) {
            if (antPathMatcher.match(menu.getPattern(), reqUrl) && menu.getRoles().size() > 0){
                List<SysRole> roles = menu.getRoles();
                String[] value = new String[roles.size()];
                for (int i = 0; i < roles.size(); i++){
                    value[i] = roles.get(i).getDesction();
                }
                return SecurityConfig.createList(value);
            }
        }
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}
