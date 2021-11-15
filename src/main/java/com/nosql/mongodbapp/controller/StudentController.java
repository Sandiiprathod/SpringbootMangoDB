package com.nosql.mongodbapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nosql.mongodbapp.model.Student;
import com.nosql.mongodbapp.service.StudentService;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/create")
	private ResponseEntity<Student> persistStudent(@RequestBody Student student) {

		return new ResponseEntity<Student>(studentService.createStudent(student), HttpStatus.OK);
	}

	@GetMapping("/fetchAll")
	private ResponseEntity<List<Student>> getAllStudents() {
		return new ResponseEntity<List<Student>>(studentService.getAllStudents(), HttpStatus.OK);

	}

	@GetMapping("/fetchById/{id}")
	private ResponseEntity<Student> getStudentById(@PathVariable String id) {
		return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);

	}

	@PutMapping("/update")
	private ResponseEntity<Student> getUpdateStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.getUpdateStudent(student), HttpStatus.OK);

	}
	@DeleteMapping("/delete/{id}")
	private ResponseEntity<String> getDeleteById(@PathVariable String id) {
		return new ResponseEntity<String>(studentService.getDeleteById(id), HttpStatus.OK);

	}

}
