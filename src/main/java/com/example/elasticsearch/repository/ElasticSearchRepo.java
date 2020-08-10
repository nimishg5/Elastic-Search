package com.example.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.elasticsearch.dao.Employee;

@Repository
public interface ElasticSearchRepo extends ElasticsearchCrudRepository<Employee, Integer>{

}
