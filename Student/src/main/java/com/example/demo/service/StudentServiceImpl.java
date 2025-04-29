package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sr;

    private List<Student> studentList = new ArrayList<>();
	
	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void delete(Integer roll) {
		// TODO Auto-generated method stub
		sr.deleteById(roll);
	}

	@Override
	public void update(Student s, Integer roll) {
		// TODO Auto-generated method stub
		s.setRoll(roll);
		sr.save(s);
		
	}

	@Override
	public Student maxMarks() {
		// TODO Auto-generated method stub
		 List<Student> students = sr.findAll();
		    if (students.isEmpty()) {
		        return null;
		    }

		    Student maxStudent = students.get(0); 
		    for (Student student : students) {
		        if (student.getMarks() > maxStudent.getMarks()) {
		            maxStudent = student;
		        }
		    }
		    return maxStudent;
	}

	@Override
	public List<Student> searchByName(String name) {
		// TODO Auto-generated method stub
		 List<Student> result = new ArrayList<>();
		    for (Student s : sr.findAll()) {
		        if (s.getName().equalsIgnoreCase(name)) {
		            result.add(s);
		        }
		    }
		    return result;
	}

	@Override
	public List<Student> searchByGrade(String grade) {
		// TODO Auto-generated method stub
		 List<Student> result = new ArrayList<>();
		    for (Student s : sr.findAll()) {
		        if (s.getGrade().equalsIgnoreCase(grade)) {
		            result.add(s);
		        }
		    }
		    return result;
	}

	@Override
	public List<Student> searchByDivision(String division) {
		 List<Student> result = new ArrayList<>();
		    for (Student s : sr.findAll()) {
		        if (s.getDivision().equalsIgnoreCase(division)) {
		            result.add(s);
		        }
		    }
		    return result;
	}

	@Override
	public List<Student> searchByResult(String result) {
		 List<Student> output = new ArrayList<>();
		    for (Student s : sr.findAll()) {
		        if (s.getResult().equalsIgnoreCase(result)) {
		            output.add(s);
		        }
		    }
		    return output;
	}

	
}
