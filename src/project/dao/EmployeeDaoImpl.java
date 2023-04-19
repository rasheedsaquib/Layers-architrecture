package project.dao;

import javax.persistence.EntityManager;

import project.entity.EmployeeEntity;

public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager entityManager;

	public EmployeeDaoImpl() {
		entityManager = JpaUtil.getEntityManager();
	}

	@Override
	public EmployeeEntity getEmployeeById(int id) {
		EmployeeEntity employee = entityManager.find(EmployeeEntity.class, id);
		return employee;
	}

	@Override
	public void addEmployee(EmployeeEntity employee) {
		entityManager.persist(employee);
	}

	@Override
	public void updateEmployee(EmployeeEntity employee) {
		entityManager.merge(employee);
	}

	@Override
	public void deleteEmployee(EmployeeEntity employee) {
		entityManager.remove(employee);

	}

	@Override
	public void commitTrasanction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTrasanction() {
		entityManager.getTransaction().begin();
	}

}
