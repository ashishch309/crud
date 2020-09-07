package com.example.AngularCrud.daoimpl;

import org.springframework.data.repository.CrudRepository;

import com.example.AngularCrud.Model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	
	public Employee findById(int id);
	
}