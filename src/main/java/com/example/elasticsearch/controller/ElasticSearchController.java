package com.example.elasticsearch.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.elasticsearch.dao.Employee;
import com.example.elasticsearch.service.ElasticSearchService;

@RestController
public class ElasticSearchController {
	
	@Autowired
	private ElasticSearchService elasticSearchService;

	@GetMapping("/getall")
	public List<Employee> getAllEmployees() {
		return elasticSearchService.getAllEmployees();
	}
	
	@GetMapping("/getbyid/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return elasticSearchService.getEmployeeById(id);
	}
	
	@PostMapping("/save")
	public void saveEmployee(@RequestBody List<Employee> employeeList) {
		elasticSearchService.saveEmployeeList(employeeList);
	}
}
