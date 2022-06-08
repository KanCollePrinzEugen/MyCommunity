package cn.work.prinzeugen.community.auth;

import cn.work.prinzeugen.community.utils.R;
import cn.work.prinzeugen.community.utils.ServerOutputResponse;
import com.alibaba.fastjson.JSON;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class UserLoginSuccessHandler implements AuthenticationSuccessHandler {
    /**
     * 登录成功返回结果
     * @param request
     * @param response
     * @param authentication
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        UserModel userModel = (UserModel) authentication.getPrincipal();
        String jwt = JWTTUtils.getJwtToken(String.valueOf(userModel.getId()), userModel.getUsername());
        response.setHeader(JWTTUtils.TOKEN_NAME, jwt);
        userModel.setPassword(null);
        ServerOutputResponse.printR(response, 0, "登录成功", userModel);
    }
}
