package com.nosql.mongodbapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nosql.mongodbapp.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
