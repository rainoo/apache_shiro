package com.gittoy.apacheshiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = {"com.gittoy.apacheshiro.mapper"})
public class ApacheshiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheshiroApplication.class, args);
	}
}

/** ------------------------------------------------------------------------------------

 Apache Shiro

 优点：
 1）提供了一套框架，而且这个框架可用，且易于使用；
 2）更灵活，应对需求能力强，Web能力强；
 3）可以与很多框架和应用进行集成；

 缺点：
 1）学习资料少一些；
 2）除了自己实现RBAC外，操作的界面也需要自己实现；

 ------------------------------------------------------------------------------------*/