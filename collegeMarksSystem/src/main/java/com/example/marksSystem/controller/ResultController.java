package com.example.marksSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.marksSystem.entities.Marks;
import com.example.marksSystem.entities.Students;
import com.example.marksSystem.services.MarksService;
import com.example.marksSystem.services.StudentsService;

@RestController
@RequestMapping("/results")
public class ResultController {
	
	@Autowired
	private MarksService marksService;
	
	@Autowired
	private StudentsService studentsService;
	
//	@Autowired
//	private Marks marks
	
//	@GetMapping("/test")
//	public String Result() {
//		return "Results page is up";
//	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Students>> getAllStudents(){
		List<Students> list = studentsService.getAllStudents();
		return ResponseEntity.ok().body(list);	
	}
	
	@GetMapping("/students/{sid}")
	public ResponseEntity<Students> getStudentById(@PathVariable int sid){
		Optional<Students> student = studentsService.getStudentById(sid);
		if(student.isPresent()) {
			return ResponseEntity.ok().body(student.get());
		}
		else {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping("/students")
	public ResponseEntity<Students> addNewStudent(@RequestBody Students students){
		Students student = studentsService.addStudent(students);
		return ResponseEntity.ok().body(student);
	}
	
	@PostMapping("/marks/{sid}")
	public ResponseEntity<Marks> addMarksToStudentById(@PathVariable int sid, @RequestBody Marks marks){
		Optional<Students> student = studentsService.getStudentById(sid);
		if(student.isPresent()) {
			marks.setStudent(student.get());
			Marks semmarks = marksService.addSemMarks(marks);
			return ResponseEntity.ok().body(semmarks);
		}
		else {
			return ResponseEntity.noContent().build();
		}
	}
	
//	@PutMapping("/students/{sid}")
//	public ResponseEntity<Student>
	
	@DeleteMapping("/students/{sid}")
	public String removeStudent(@PathVariable int sid){
		Optional<Students> student = studentsService.getStudentById(sid);
		if(student.isPresent()) {
			studentsService.removeByStudentId(sid);
			return "Deleted.....";
		}
		else {
			return "Not found";
		}
	}
	
//	GET ALL STUDENTS / GET STUDENT BY ID / POST STUDENT / POST MARKS BUY STUDENT ID / GET RESULTS / PUT STUDENTS / PUT MARKS BY STUDENT ID

}
