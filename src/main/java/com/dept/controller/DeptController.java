package com.dept.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dept.entity.Department;
import com.dept.service.DepartmentService;

@RestController
@RequestMapping("dept")
public class DeptController {
		
	@Autowired
	private DepartmentService deptService;
	
	@PostMapping("/addDept")
	public Department addDepartment(@RequestBody Department department) {
		return deptService.addDepartment(department);
	}
	@GetMapping("/fetchDepts")
	public List<Department> fetchDepartments() {
		return deptService.fetchDepartments();
	}
	@GetMapping("/{id}")
	public Optional<Department> findById(@PathVariable("id") Integer id) {
		return deptService.findById(id);

	}
	@GetMapping("/message")
	public String getMessage() {
		return "Dockerize the DeptApplication";
	}
}
