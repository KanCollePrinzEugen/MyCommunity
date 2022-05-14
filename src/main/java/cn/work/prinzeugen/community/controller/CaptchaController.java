package cn.work.prinzeugen.community.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ShearCaptcha;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

/**
 * @author prinzeugen
 */
@RestController
@RequestMapping
public class CaptchaController {
    @GetMapping("captcha")
    public String getCaptcha(HttpServletRequest request) {
        ShearCaptcha captcha = CaptchaUtil.createShearCaptcha(100, 40);
        String code = captcha.getCode();
        HttpSession session = request.getSession();
        session.setAttribute("code", code);
        return captcha.getImageBase64();
    }
}
