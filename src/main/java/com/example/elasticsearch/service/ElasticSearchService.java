package com.example.elasticsearch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elasticsearch.dao.Employee;
import com.example.elasticsearch.repository.ElasticSearchRepo;

@Service
public class ElasticSearchService {

	@Autowired
	private ElasticSearchRepo elasticSearchRepo;
	
	public List<Employee> getAllEmployees() {
		return (List<Employee>) elasticSearchRepo.findAll();
	}
	
	public Optional<Employee> getEmployeeById(int id) {
		return elasticSearchRepo.findById(id);
	}
	
	public void saveEmployeeList(List<Employee> employeeList) {
		elasticSearchRepo.saveAll(employeeList);
	}
	
}
