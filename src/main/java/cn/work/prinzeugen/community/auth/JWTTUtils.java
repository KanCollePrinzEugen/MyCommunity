package cn.work.prinzeugen.community.auth;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JWTTUtils {
    //token过期时间
    public static final long EXPIRE = 1000 * 60 * 60 *24;
    public static final String TOKEN_NAME = "UserToken";
    //token的密钥
    public static final String APP_SECRET = "1145141919810";
    public static String getJwtToken(String id, String account){
        String JwtToken = Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                .setSubject("comm-user")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .claim("id", id)
                .claim("account", account)
                .signWith(SignatureAlgorithm.HS256, APP_SECRET)
                .compact();
        return JwtToken;
    }
}
