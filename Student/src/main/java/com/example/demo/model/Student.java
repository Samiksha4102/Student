package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int roll;
	private String name;
	private String division;
	private float marks;
	private String grade;
	private String result;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Student(int roll, String name, String division, float marks, String grade, String result) {
		super();
		this.roll = roll;
		this.name = name;
		this.division = division;
		this.marks = marks;
		this.grade = grade;
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", division=" + division + ", marks=" + marks + ", grade="
				+ grade + ", result=" + result + "]";
	}

}
