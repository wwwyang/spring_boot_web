package com.lenovo.yangww4.springbootcore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lenovo.yangww4.springbootweb.Person;

@Controller
@SpringBootApplication
public class Ch72Application {

	@RequestMapping("/")
	public String index(Model model) {
		Person single = new Person("yww", 22);

		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("xx", 11);
		Person p2 = new Person("yy", 22);
		Person p3 = new Person("zz", 33);
		people.add(p1);
		people.add(p2);
		people.add(p3);

		model.addAttribute("singlePerson", single);
		
		return "index";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ch72Application.class, args);
	}
}
