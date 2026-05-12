package com.practices;

//14. Hierarchical Inheritance
//Create a class Course with a method courseInfo().
//Create subclasses Science, Commerce, and Arts each with their own method.
//Create objects of each and call methods to show hierarchy.

class Course
{
	void courseInfo()
	{
		System.out.println("Subjects for different Courses");
	}
}
class Science extends Course
{
	void scienecesubjects()
	{
		System.out.println("Biology, Physics, Chemsitry");
	}
}
class Commerece extends Course
{
	void commercesubjects()
	{
		System.out.println("Accounts, Economics");
	}
}
class Arts extends Course
{
	void Artssubjects()
	{
		System.out.println("History, Biology");
	}
}

public class Q14 {

	public static void main(String[] args) {
		
		Science obj = new Science();
		obj.courseInfo();
		obj.scienecesubjects();
		Commerece obj1 = new Commerece();
		obj1.commercesubjects();
		Arts obj2 = new Arts();
		obj2.Artssubjects();;
		

	}

}
