package cn.work.prinzeugen.community.utils;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServerOutputResponse {
    public static void printR(HttpServletResponse response, int code, String message, Object data) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        R r = new R(code, message, data);
        PrintWriter out = response.getWriter();
        out.write(JSON.toJSONString(r));
        out.flush();
        out.close();
    }

    public static void printR(HttpServletResponse response, int code, String message) throws IOException {
        printR(response, code, message, null);
    }
}
