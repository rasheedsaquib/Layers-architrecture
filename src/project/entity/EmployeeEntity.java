package project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "example")
public class EmployeeEntity {

	@Id
	@Column(name = "e_id")
	private int empid;
	@Column(name = "e_name", length = 20)
	private String empname;
	@Column(name = "e_sal", length = 20)
	private int empsal;
	@Column(name = "e_add", length = 50)
	private String empadd;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	public String getEmpadd() {
		return empadd;
	}

	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}

	public EmployeeEntity() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(int empid, String empname, int empsal, String empadd) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empadd = empadd;
	}

	@Override
	public String toString() {
		return "EmployeeDaoImpl [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empadd=" + empadd
				+ "]";
	}

}
