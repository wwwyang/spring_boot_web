package com.lenovo.yangww4.springbootcore.ch6_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 验证配置文件分环境: 生产环境 80端口 和开发环境 8888端口
 * application.properties中配置spring.profiles.active=dev/prod
 * <p>
 * 可以调用到
 * application-dev.properties
 * <p>
 * application-prod.properties 的内容
 * 
 * @author yangww
 *
 */
@RestController
@SpringBootApplication
public class Ch64Application {

	@RequestMapping("/")
	public String index() {
		return "测试不同环境下, 配置不通的配置文件";
	}

	public static void main(String[] args) {
		SpringApplication.run(Ch64Application.class, args);
	}
}
