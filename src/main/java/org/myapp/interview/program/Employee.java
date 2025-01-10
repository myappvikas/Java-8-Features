package org.myapp.interview.program;

public class Employee{

	private Integer empId;
	private String empName;
	private Integer deptId;
	private String deptName;
	private String status;
	private Double salary;
	
	public Employee(Integer empId, String empName, Integer deptId, String deptName, String status, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.deptName = deptName;
		this.status = status;
		this.salary = salary;
	}
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", deptName=" + deptName
				+ ", status=" + status + ", salary=" + salary + "]";
	}
}
