package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.StudentServiceImpl;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StudentApplication.class, args);

	}
}
