package com.lenovo.yangww4.springbootcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Ch522Application {
	
	/**
	 * 通过注解的方式, 读取配置文件application.properties的内容
	 */
	@Value("${book.author}")
	private String bookAuthor;
	
	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/ch522")
	String index() {
		return "Hello , Spring Boooooooooooooooooooooooooooooooooooooooooooot!!!!!!!!<br>" + "bookName is: [" + bookName + "],<br/> author is: [" + bookAuthor + "]";
	}

	public static void main(String[] args) {
		// 1.1
		org.springframework.boot.SpringApplication.run(Ch522Application.class, args);

		// 1.2
		// SpringApplication app = new SpringApplication(Ch522Application.class);
		// app.setBannerMode(org.springframework.boot.Banner.Mode.LOG);
		// app.run(args);

		// 1.3
//		new org.springframework.boot.builder.SpringApplicationBuilder(Ch522Application.class).bannerMode(org.springframework.boot.Banner.Mode.OFF).run(args);
	}
}
