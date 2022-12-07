package com.dept.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dept.entity.Department;
import com.dept.repo.DepartmentRepo;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo deptRepo;
    
	public Department addDepartment(Department department) {
		return deptRepo.save(department);
	}
	public List<Department> fetchDepartments() {
		return deptRepo.findAll();
	}
	
	public Optional<Department> findById(Integer id) {
		return deptRepo.findById(id);

	}

}
