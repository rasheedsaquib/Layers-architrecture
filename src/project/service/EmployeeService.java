package project.service;

import project.entity.EmployeeEntity;

public interface EmployeeService {

	void addEmployee(EmployeeEntity employee);

	void updateEmployee(EmployeeEntity employee);

	void deleteEmployee(EmployeeEntity employee);

	EmployeeEntity findEmployeeById(int id);

}
