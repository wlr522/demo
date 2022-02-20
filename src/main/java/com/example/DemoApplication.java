package com.example;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*使用 @EnableWebMvc 注解，需要以编程的方式指定视图文件相关配置；
    使用 @EnableAutoConfiguration 注解，会读取 application.properties 或 application.yml 文件中的配置。
    */
@SpringBootApplication
@EnableScheduling
@EnableSwagger2
@EnableWebMvc
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
