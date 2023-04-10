package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping
	public List<Student> hello(){
		return List.of(new Student(1L, "Aiden", "aiden.ten30@gmail.com", 17, LocalDate.of(2005, Month.DECEMBER, 5)));
	}
}
