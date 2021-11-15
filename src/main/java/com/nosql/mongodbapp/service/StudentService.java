package com.nosql.mongodbapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nosql.mongodbapp.model.Student;
import com.nosql.mongodbapp.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	public Student getStudentById(String id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	public Student getUpdateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	public String getDeleteById(String id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		return "deleted successfully";
	}
}
