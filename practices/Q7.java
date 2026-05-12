package com.practices;

//7. Use of super keyword
//Create a class Person with a constructor that prints "Person Created".
//Create a subclass Student that calls the parent constructor using super() and prints "Student Created".
//Create an object and observe the order of execution.

class Person
{
Person()
{
	System.out.println("Person Created");
}
}
class Student extends Person
{
Student()
{
	super();
	System.out.println("Student Created");
}
}

public class Q7 {

	public static void main(String[] args) {
		Student obj = new Student();
		

	}

}
