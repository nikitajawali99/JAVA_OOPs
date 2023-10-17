package com.oops.encapsulation;

public class Employee {

	private Long empId;
	private String empName;
	private String empLocation;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	// constructor with parameterized
	public Employee(Long empId, String empName, String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLocation = empLocation;
	}

	// constructor without parameterized / super constructor
	public Employee() {
	}

	public void show() {
		System.out.println("Employee id :" + getEmpId());
		System.out.println("Employee name :" + getEmpName());
		System.out.println("Employee location :" + getEmpLocation());
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmpId(123L);
		e.setEmpLocation("Mumbai");
		e.setEmpName("Nikiii");
		e.show();
		System.out.println("_____________________________");
		Employee e1 = new Employee();
		e1.setEmpId(1245L);
		e1.setEmpLocation("Pune");
		e1.setEmpName("Nishiii");
		e1.show();
		System.out.println("_____________________________");
		// setting values in the parameterized constructor 
		Employee e3 = new Employee(253L, "Krishna", "Chennai");
		e3.show();

	}

}
