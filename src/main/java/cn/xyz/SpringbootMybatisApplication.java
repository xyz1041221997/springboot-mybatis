package cn.xyz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value="cn.xyz.dao")
@SpringBootApplication
public class SpringbootMybatisApplication {
//@MapperScan(value = "com.atguigu.springboot.mapper")
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }
}
