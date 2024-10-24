package com.example.marksSystem.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.marksSystem.entities.Marks;
import com.example.marksSystem.repository.MarksRepository;

@Service
public class MarksService {
	
	@Autowired
	private MarksRepository marksRepo;
	
	public Marks addSemMarks(Marks marks) {
		return marksRepo.save(marks);
	}
	
}
