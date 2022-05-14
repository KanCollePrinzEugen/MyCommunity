package cn.work.prinzeugen.community.controller;

import cn.work.prinzeugen.community.entity.SysAdmin;
import cn.work.prinzeugen.community.entity.SysUser;
import cn.work.prinzeugen.community.service.ISysAdminService;
import cn.work.prinzeugen.community.service.ISysUserService;
import cn.work.prinzeugen.community.service.impl.SysUserServiceImpl;
import cn.work.prinzeugen.community.utils.R;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author prinzeugen
 */
@RestController
@RequestMapping
public class LoginController {
    @Autowired
    private ISysAdminService sysAdminService;

    @PostMapping("/doLogin")
    public R doLogin(@RequestParam JSONObject json, HttpSession session){
        R r = new R();
        String code = json.getString("validCode");
        String name = json.getString("loginName");
        String pwd = json.getString("loginPwd");
        String saveCode = (String) session.getAttribute("code");
        if (saveCode != null && saveCode.equals(code)){
            if (name != null && !name.equals("") && pwd != null && !pwd.equals("")){
                SysAdmin sysAdmin = sysAdminService.validateAdmin(name, pwd);
                if (sysAdmin != null){
                    r.setData(sysAdmin);
                }else{
                    r.setCode(2);
                    r.setMsg("用户名或密码错误");
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
