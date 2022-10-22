package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.example.demo.entity.Student;
@RepositoryRestResource(path="stu")
@CrossOrigin("http://localhost:4200/")
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	List<Student> findBySnameIgnoreCase(String sname);
}
