package project.dao;

import project.entity.EmployeeEntity;

public interface EmployeeDao {
	
	EmployeeEntity getEmployeeById(int id);
	
	void addEmployee(EmployeeEntity employee);

	void updateEmployee(EmployeeEntity employee);

	void deleteEmployee(EmployeeEntity employee);
	
	void commitTrasanction();
	
	void beginTrasanction();



}
