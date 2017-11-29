package com.lenovo.yangww4.springbootcore.ch6_2_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lenovo.yangww4.springbootcore.ch6_2_3.config.AuthorSettings;

/**
 * 通过Autowired直接注入properties的配置
 * 
 * @author yangww
 *
 */
@RestController
@SpringBootApplication
public class Ch623Application {
	@Autowired
	private AuthorSettings authorSettings; // 可以用Autowired直接注入properties的配置

	@RequestMapping("/ch623")
	public String index() {
		return "作者名字是" + authorSettings.getName() + "\n,作者年龄是" + authorSettings.getAge();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ch623Application.class, args);
	}
}
