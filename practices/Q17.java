package com.practices;

//17.Abstract Class + Real Usage
//Create an abstract class Employee with:
//abstract method: calculateSalary()
//concrete method: employeeDetails()
//Subclass FullTimeEmployee and PartTimeEmployee implementing salary calculation logic differently.

abstract class Employees
{
	int id;
	String name;
	
	Employees(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	abstract int calculateSalary();
	void employeeDetails()
	{
		System.out.println("Name of employee is "+name);
		System.out.println("Id of employee is "+id);
	}
}
	
class FullTimeEmployee extends Employees
{
	int salary;
	FullTimeEmployee(int id, String name, int salary)
	{
		super(id, name);
		this.salary = salary;
	}
	int calculateSalary()
	{
		return salary;
	}
}
class PartTimeEmployee extends Employees
{
	int days;
	int rate;
	
	PartTimeEmployee(int id, String name,int days, int rate)
	{
		super(id,name);
		this.days=days;
		this.rate = rate;
	}
	int calculateSalary()
	{
		return days*rate;
	}
}
public class Q17 {

	public static void main(String[] args) {
		
		FullTimeEmployee obj = new FullTimeEmployee(3457,"Arjun", 42000);
		obj.employeeDetails();
		System.out.println("Salary of a full time Employee is "+obj.calculateSalary());
		PartTimeEmployee obj1 = new PartTimeEmployee(22823,"Raja", 18, 100);
		obj1.employeeDetails();
		System.out.println("Salary of a Part time Employee is "+obj1.calculateSalary());
		
		
		
		
	}

}
