package com.example.AngularCrud.sericeimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AngularCrud.Model.Employee;
import com.example.AngularCrud.daoimpl.EmployeeRepo;
import com.example.AngularCrud.serviceInterface.EmployeeInterface;


@Service
public class EmployeeImpl implements EmployeeInterface{

	@Autowired
	private EmployeeRepo employeeRepo;
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list=(List<Employee>) employeeRepo.findAll();
		return list;
	}
	

}

