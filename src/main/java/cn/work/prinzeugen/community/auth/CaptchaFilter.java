package cn.work.prinzeugen.community.auth;

import cn.work.prinzeugen.community.utils.Constant;
import cn.work.prinzeugen.community.utils.RedisUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CaptchaFilter extends OncePerRequestFilter {
    private final String loginUrl = "/login";
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String url = request.getRequestURI();
        if(loginUrl.equals(url) && request.getMethod().equals("POST")){
            String code = request.getParameter("code");
            String token = request.getParameter("token");
            if (StringUtils.isBlank(code) || StringUtils.isBlank(token)) {
                throw new CaptchaException("验证码错误！");
            }
            if (!code.equals(RedisUtils.hget(Constant.CAPTCHA_KEY, token))){
                throw new CaptchaException("验证码错误！");
            }
        }
        filterChain.doFilter(request, response);
    }
}
