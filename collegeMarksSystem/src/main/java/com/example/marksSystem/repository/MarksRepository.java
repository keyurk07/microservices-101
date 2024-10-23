package com.example.marksSystem.repository;
  import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository; 
  import org.springframework.stereotype.Repository;
  
  import com.example.marksSystem.entities.Marks;
  
  @Repository public interface MarksRepository extends JpaRepository<Marks, Long> {
  
  }
 