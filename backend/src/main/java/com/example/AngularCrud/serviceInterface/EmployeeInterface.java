package com.example.AngularCrud.serviceInterface;

import java.util.List;

import com.example.AngularCrud.Model.Employee;

public interface EmployeeInterface {
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public  void deleteEmployee(int id);
	public List<Employee> getAllEmployee();
}