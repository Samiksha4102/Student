package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	public void add(Student s);
	public List<Student> display();
	public void delete(Integer roll);
	public void update(Student s,Integer roll);
	public Student maxMarks();
	
	public List<Student> searchByName(String name);
	public List<Student> searchByGrade(String grade);
	public List<Student> searchByDivision(String division);
	public List<Student> searchByResult(String result);
	
	
}
