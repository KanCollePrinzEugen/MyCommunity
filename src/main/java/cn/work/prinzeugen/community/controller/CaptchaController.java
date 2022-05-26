package cn.work.prinzeugen.community.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ShearCaptcha;
import cn.work.prinzeugen.community.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.time.Duration;
import java.util.UUID;

/**
 * @author prinzeugen
 */
@RestController
@RequestMapping
public class CaptchaController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @GetMapping("captcha")
    public R getCaptcha(HttpServletRequest request) {
        R r = new R();
        ShearCaptcha captcha = CaptchaUtil.createShearCaptcha(100, 40);
        String code = captcha.getCode();
        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
        String key = UUID.randomUUID().toString();
        valueOperations.set(key, code, Duration.ofSeconds(300));
//        HttpSession session = request.getSession();
//        session.setAttribute("code", code);
        r.setData(captcha.getImageBase64());
        return r;
    }
}
