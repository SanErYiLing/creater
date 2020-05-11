package org.creater.core;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
//@MapperScan("org.dubbo.*.dao")
public class CoreApplication {

    public static void main( String[] args )
    {
    	SpringApplication app = new SpringApplication(CoreApplication.class);
//    	app.setWebApplicationType(WebApplicationType.NONE);
    	app.run(args);
    }
}
