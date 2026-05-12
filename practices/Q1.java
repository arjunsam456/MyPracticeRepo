package com.practices;

//1.Encapsulation + Getter/Setter
//WAP in Java
//Create a class named Employee with private instance variables empId, empName, and salary.
//Provide public getters and setters for all variables.
//Create a method displayDetails() to print employee details.
//Create an object in the main method and assign values using setters then display them.

class Employee
{
	private int empId;
	private  String empName;
	private double Salary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpNmae(String empNmae) {
		this.empName = empNmae;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	void displayDetails()
	{
		System.out.println(getEmpId());
		System.out.println(getEmpName());
		System.out.println(getSalary());
	}
	
	
}

public class Q1 {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.setEmpId(2282);
		obj.setEmpNmae("Arjun");
		obj.setSalary(90000);
		obj.displayDetails();

	}

}
