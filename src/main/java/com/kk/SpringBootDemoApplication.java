package com.kk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
* @Description: 打包成war包时extends SpringBootServletInitializer,并重写configure方法,pom中引入spring-boot-starter-tomcat
* @Author: wangyikai
* @Date: 2018/5/22 15:12
* @Version: 1.0
**/
@SpringBootApplication
public class SpringBootDemoApplication  {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(SpringBootDemoApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
