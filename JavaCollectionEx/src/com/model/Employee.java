package com.model;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	
	public Employee(int id,String name) {
		this.empId=id;
		this.empName=name;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public int compareTo(Employee empObj) {
		// ASC
		return this.empId-empObj.getEmpId();
		
		//DESC
		//return empObj.getEmpId()-this.empId;
		
	}
	
	public static Comparator<Employee> empNameComp=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			String name1=o1.getEmpName().toUpperCase();
			String name2=o2.getEmpName().toUpperCase();
			return name1.compareTo(name2);
		}
	};
	
	
}
