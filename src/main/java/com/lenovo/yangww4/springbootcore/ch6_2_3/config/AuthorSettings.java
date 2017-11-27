package com.lenovo.yangww4.springbootcore.ch6_2_3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 基于类型安全的配置方式
 * <p>
 * 通过 @ConfigurationProperties 将 properties属性和一个Bean及其属性关联, 从而实现类型安全的配置
 * <p>
 * 其中 prefix属性, 用来指定 具体配置的前缀(相当于组的概念)
 * 
 * @author yangww
 *
 */
@Component
@ConfigurationProperties(prefix = "author") // 通过@ConfigurationProperties 加载 properties文件内的配置, 通过prefix属性指定properties的配置的前缀,
											// 通过Location指定properties文件的位置
public class AuthorSettings {
	private String name;
	private Long age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}
}
