package com.cg;

public class EmployeeTest {
	
	public static void main(String args[]) {
		Employee empOne = new Employee("James");
		Employee empTwo = new Employee("Mary");
		
		empOne.empAge(26);
		empOne.empDesignation("analyst");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("analyst");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}

}
