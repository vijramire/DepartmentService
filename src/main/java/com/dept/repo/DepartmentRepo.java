package com.dept.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dept.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{
   
}
