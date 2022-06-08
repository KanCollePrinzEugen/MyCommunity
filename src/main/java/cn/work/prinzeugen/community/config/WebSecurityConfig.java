package cn.work.prinzeugen.community.config;

import cn.work.prinzeugen.community.auth.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;

/**
 * @author prinz
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    static String[] EXCLUDE_PATHS = {"/captcha", "/v2/api-docs", "/doRegister"};

    @Autowired
    private UserNotLoginHandler userNotLoginHandler;
    @Autowired
    private UserLoginSuccessHandler userLoginSuccessHandler;
    @Autowired
    private UserLoginFailureHandler userLoginFailureHandler;
    @Autowired
    private UserLogoutSuccessHandler userLogoutSuccessHandler;
    @Autowired
    private UserAccessDeniedHandler userAccessDeniedHandler;
    @Autowired
    private UserLoginProvider userLoginProvider;

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DefaultWebSecurityExpressionHandler userSecurityExpressionHandler() {
        DefaultWebSecurityExpressionHandler handler = new DefaultWebSecurityExpressionHandler();
        handler.setPermissionEvaluator(new UserPermissionEvaluator());
        return handler;
    }

    /**
     * 配置登录验证逻辑
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //启动自定义登录逻辑
        auth.authenticationProvider(userLoginProvider);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/index.html","/static/**","/captcha","/login");
        web.ignoring().antMatchers("/index.html","/static/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //配置放行地址
                .antMatchers(EXCLUDE_PATHS).permitAll()
                .anyRequest().authenticated()
                .and()
                //配置为登录自定义类
                .httpBasic().authenticationEntryPoint(userNotLoginHandler)
                //配置登录地址
                .and()
                .formLogin().loginProcessingUrl("/login")
                //登录成功后自定义处理类
                .successHandler(userLoginSuccessHandler)
                .failureHandler(userLoginFailureHandler)
                .and()
                //配置登出地址
                .logout().logoutUrl("/logout")
                .logoutSuccessHandler(userLogoutSuccessHandler)
                .deleteCookies("JSESSIONID")
                .and()
                //配置没有权限时的处理类
                .exceptionHandling().accessDeniedHandler(userAccessDeniedHandler)
                //开启跨域
                .and()
                .cors()
                //取消跨站请求伪造防护
                .and()
                .csrf().disable();
//                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
//                    @Override
//                    public <O extends FilterSecurityInterceptor> O postProcess(O object) {
//                        object.setSecurityMetadataSource(metadataSource);
//                        object.setAccessDecisionManager(customAccessDecisionManager);
//                        return object;
//                    }
//                }).and()
//                .formLogin().loginPage("/login_p").loginProcessingUrl("/login")
//                .usernameParameter("username").passwordParameter("password")
//                .failureHandler(new AuthenticationFailureHandler() {
//                            @Override
//                            public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
//                                response.setContentType("application/json;charset=utf-8");
//                                PrintWriter out = response.getWriter();
//                                String msg = "登录失败";
//                                if (exception instanceof LockedException) {
//                                    msg = "账户被锁定！";
//                                } else if (exception instanceof BadCredentialsException) {
//                                    msg = "账号或密码错误！";
//                                } else if (exception instanceof DisabledException) {
//                                    msg = "账户被禁用！";
//                                } else if (exception instanceof AccountExpiredException) {
//                                    msg = "账户已过期！";
//                                } else if (exception instanceof CredentialsExpiredException) {
//                                    msg = "密码已过期！";
//                                }
//                                R r = new R(1, msg);
//                                out.write(JSON.toJSONString(r));
//                                out.flush();
//                                out.close();
//                            }
//                        })
//                .successHandler(new AuthenticationSuccessHandler() {@Override
//                public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//                    Object principal = authentication.getPrincipal();
//                    response.setContentType("application/json;charset=utf-8");
//                    PrintWriter out = response.getWriter();
//                    R r = new R(0, "认证成功", principal);
//                    out.write(JSON.toJSONString(r));
//                    out.flush();
//                    out.close();
//                }})
//                .permitAll()
//                .and()
//                .logout().permitAll()
//                .and()
//                .csrf().disable()
//                .exceptionHandling().accessDeniedHandler(deniedHandler);
    }
}
