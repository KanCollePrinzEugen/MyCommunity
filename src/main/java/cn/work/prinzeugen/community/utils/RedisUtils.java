package cn.work.prinzeugen.community.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.time.Duration;
import java.util.UUID;

public class RedisUtils {
    @Autowired
    private static StringRedisTemplate stringRedisTemplate;

    public static String hget(String prefix, String token){
        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
        String key = prefix + token;
        return valueOperations.get(key);
    }
}
