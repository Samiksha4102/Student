package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {


	@Autowired
	private StudentService ss;

	@PostMapping("/add")
	public void add(@RequestBody Student student) {
		ss.add(student);
	}



	@GetMapping("/display")
	public List<Student>display(){
		return ss.display();
	}


	@PutMapping("/update/{roll}")
	public void update(@RequestBody Student student,@PathVariable int roll) {
		ss.update(student, roll);
	}

	@DeleteMapping("/delete/{roll}")
	public void delete(@PathVariable int roll) {
		ss.delete(roll);
	}

	@GetMapping("/searchByName/{name}")
	public List<Student> searchByName(@PathVariable String name) {
		return ss.searchByName(name);
	}

	@GetMapping("/searchByGrade/{grade}")
	public List<Student> searchByGrade(@PathVariable String grade) {
		return ss.searchByGrade(grade);
	}


	@GetMapping("/searchByDivision/{division}")
	public List<Student> searchByDivision(@PathVariable String division) {
		return ss.searchByDivision(division);
	}

	@GetMapping("/searchByResult/{result}")
	public List<Student> searchByResult(@PathVariable String result) {
		return ss.searchByResult(result);
	}

	@GetMapping("/maxMarks")
	public Student maxMarks() {
		return ss.maxMarks();
	}



}
