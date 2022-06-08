package cn.work.prinzeugen.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author prinzeugen
 */
@SpringBootApplication
@MapperScan({"cn.work.prinzeugen.community.mapper"})
@EnableCaching
public class MyCommunityApplication {
    public static void main(String[] args) {
//        try{
            SpringApplication.run(MyCommunityApplication.class, args);
//        } catch (Exception e){
//            System.out.println(e.fillInStackTrace());
//        }
    }
}
