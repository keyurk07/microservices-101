package com.example.marksSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marksSystem.entities.Students;
import com.example.marksSystem.repository.StudentsRepository;

@Service
public class StudentsService {
	
	@Autowired
	private StudentsRepository studentRepo;
	
	public List<Students> getAllStudents(){
		return studentRepo.findAll();
	}
	
	public Students addStudent(Students students) {
		return studentRepo.save(students);
	}
	
	public Optional<Students> getStudentById(int sid) {
		return studentRepo.findById(sid);
	}
	
	public void removeByStudentId(int sid){
		 studentRepo.deleteById(sid);
	}

}
