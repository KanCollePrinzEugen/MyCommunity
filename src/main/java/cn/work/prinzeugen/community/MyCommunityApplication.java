package cn.work.prinzeugen.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author prinzeugen
 */
@SpringBootApplication
@MapperScan("cn.work.prinzeugen.community.mapper")
public class MyCommunityApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyCommunityApplication.class, args);
    }
}
