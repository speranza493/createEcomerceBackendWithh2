package com.example.demo;

import com.example.demo.Entity.Courses;
import com.example.demo.Repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	private CoursesRepository coursesRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	private void postInit(){
		System.out.println("All available courses are: "+ coursesRepository.findAll());
		coursesRepository.deleteById(1L);
		System.out.println("All available courses are: "+ coursesRepository.findAll());
	}

}
