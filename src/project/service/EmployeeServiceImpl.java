package project.service;

import project.dao.EmployeeDao;
import project.dao.EmployeeDaoImpl;
import project.entity.EmployeeEntity;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(EmployeeEntity employee) {
		dao.beginTrasanction();
		dao.addEmployee(employee);
		dao.commitTrasanction();
	}

	@Override
	public void updateEmployee(EmployeeEntity employee) {
		dao.beginTrasanction();
		dao.updateEmployee(employee);
		dao.commitTrasanction();
	}

	@Override
	public void deleteEmployee(EmployeeEntity employee) {
		dao.beginTrasanction();
		dao.deleteEmployee(employee);
		dao.commitTrasanction();
	}

	@Override
	public EmployeeEntity findEmployeeById(int id) {
		EmployeeEntity employee = dao.getEmployeeById(id);
		return employee;
	}

}
