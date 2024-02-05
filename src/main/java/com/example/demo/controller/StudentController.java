package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {
	
	private StudentService studentService;
	
	@PostMapping("/save")
	Student insertStudent(@RequestBody Student student) {
		return studentService.insertStudent(student);
	}
	@GetMapping("/")
	List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
}
