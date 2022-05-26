package cn.work.prinzeugen.community.controller;

import cn.work.prinzeugen.community.service.sys.ISysAdminService;
import cn.work.prinzeugen.community.utils.R;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author prinzeugen
 */
@RestController
@RequestMapping
public class RegisterController {

    @Autowired
    private ISysAdminService sysAdminService;

    @PostMapping("/doRegister")
    public R doRegister(@RequestParam JSONObject json, HttpSession session) {
        R r = new R();
        int result;
        String code = json.getString("validCode");
        String name = json.getString("loginName");
        String pwd = json.getString("loginPwd");
        String tel = json.getString("loginTel");
        String email = json.getString("loginEmail");
        String conformPwd = json.getString("loginConformPwd");
        String saveCode = (String) session.getAttribute("code");
        if (saveCode != null && saveCode.equals(code)){
            if (name != null && !"".equals(name) && pwd != null && !"".equals(pwd) && pwd.equals(conformPwd)){
                result = sysAdminService.registerAdmin(name, pwd, tel, email);
                if (result > 0){
                    r.setMsg("注册成功");
                }else{
                    r.setCode(2);
                    r.setMsg("注册失败");
                }
            }else {
                r.setCode(3);
                r.setMsg("请输入用户名或密码");
            }
        }else {
            r.setCode(4);
            r.setMsg("验证码错误");
        }
        return r;
    }
}
