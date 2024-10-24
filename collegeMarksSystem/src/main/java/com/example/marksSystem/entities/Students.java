package com.example.marksSystem.entities;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id; 
import jakarta.persistence.ManyToOne; 
import jakarta.persistence.OneToMany; 
import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor;


@Entity  
@Data
@NoArgsConstructor  
@AllArgsConstructor 
public class Students {
  
  @Id 
  private int sid; 
  private String studentName;
  
  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true) 
  @JsonManagedReference
  private List<Marks> marks;
  
  
  }
 