  package com.example.marksSystem.repository;
  
  import org.springframework.data.jpa.repository.JpaRepository; 
  import org.springframework.stereotype.Repository;
  
  import com.example.marksSystem.entities.Students;
  
  @Repository public interface StudentsRepository extends JpaRepository<Students, Integer> {
  
  }
 