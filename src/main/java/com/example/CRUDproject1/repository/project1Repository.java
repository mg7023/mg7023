package com.example.CRUDproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CRUDproject1.domain.Student;

@Repository
public interface project1Repository extends JpaRepository<Student, Long>{

}
