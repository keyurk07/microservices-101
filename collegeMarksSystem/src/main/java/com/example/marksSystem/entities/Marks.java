package com.example.marksSystem.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mid;
	private int sem;
	private long subject1;
	private long subject2;
	private long subject3;
	private long subject4;
	private long pratical1;
	private long practical2;
	
	@ManyToOne
	@JoinColumn(name = "sid")
	@JsonBackReference
	private Students student;
}
