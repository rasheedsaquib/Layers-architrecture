package project.ui;

import project.entity.EmployeeEntity;
import project.service.EmployeeService;
import project.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeServiceImpl();

		EmployeeEntity employee = new EmployeeEntity(001, "Abdul", 40000, "hyd");

		service.addEmployee(employee);
	}

}
