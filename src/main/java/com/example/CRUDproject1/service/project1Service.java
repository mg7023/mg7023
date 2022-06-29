package com.example.CRUDproject1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUDproject1.domain.Student;
import com.example.CRUDproject1.repository.project1Repository;

@Service
public class project1Service {
	@Autowired
    private project1Repository repo;
public List<Student> listAll() {
        return repo.findAll();
    }
    
    public void save(Student std) {
        repo.save(std);
    }
    
    public Student get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }

}
