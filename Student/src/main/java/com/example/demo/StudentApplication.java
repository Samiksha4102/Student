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

		StudentService ss=context.getBean(StudentServiceImpl.class);

		String data;
		float marks;
		int roll = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("""
					1.Add
					2.Display
					3.Update
					4.Delete
					5.Search By Name
					6.Search By Grade
					7.Search By Division
					8.Search By Result
					9.Maximum Marks
					10.Exit
					Enter the choice
					""");
			int ch=sc.nextInt();

			switch (ch) {
			case 1 ->{
				System.out.println("Enter Student Details : ");

				System.out.println("Name : ");
				String name=sc.next();
				System.out.println("Division : ");
				String division =sc.next();
				System.out.println("Marks: ");
				marks=sc.nextFloat();
				System.out.println("Grade : ");
				String grade =sc.next();
				System.out.println("Result : ");
				String result =sc.next();

//				ss.add(new Student(roll, name, division, marks, grade, result));

			}
			case 2 ->{
				for (Student x : ss.display()) {
					System.out.println(x);
				}
			}
			case 3 ->{
				System.out.println("Enter Student Details to Update : ");
				System.out.println("Roll No: ");
				roll=sc.nextInt();
				System.out.println("Name : ");
				String name=sc.next();
				System.out.println("Division : ");
				String division =sc.next();
				System.out.println("Marks: ");
				marks=sc.nextFloat();
				System.out.println("Grade : ");
				String grade =sc.next();
				System.out.println("Result : ");
				String result =sc.next();

//				ss.update(new Student(roll, name, division, marks, grade, result), roll);

			}
			case 4 ->{
				System.out.println("Enter the Roll Number : ");
				roll=sc.nextInt();
				ss.delete(roll);
			}
			case 5 ->{
				System.out.println("Enter Name to search: ");
				String name = sc.next();
				for (Student s : ss.searchByName(name)) {
					System.out.println(s);
				}
			}
			case 6 ->{
				System.out.println("Enter Grade to search: ");
				String grade = sc.next();
				for (Student s : ss.searchByGrade(grade)) {
					System.out.println(s);
				}

			}
			case 7 ->{
				System.out.println("Enter Division to search: ");
				String division = sc.next();
				for (Student s : ss.searchByDivision(division)) {
					System.out.println(s);
				}

			}
			case 8 ->{
				System.out.println("Enter Result to search: ");
				String result = sc.next();
				for (Student s : ss.searchByResult(result)) {
					System.out.println(s);
				}

			}
			case 9->{
				Student maxStudent = ss.maxMarks();

				System.out.println("Student with maximum marks: " + maxStudent);
			}
			case 10 ->{
				System.exit(0);
			}
			default ->{
				System.out.println("invalid choice");
			}
			}



		}
	}
}
