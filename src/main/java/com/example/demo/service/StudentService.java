package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository sr;
	
	public StudentEntity saveinfo(StudentEntity s) {
		return sr.save(s);
	}
	
	public List<StudentEntity> showinfo(){
		return sr.findAll();
	}
}
	