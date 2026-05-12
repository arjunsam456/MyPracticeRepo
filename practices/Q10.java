package com.practices;

//10.  Static Keyword
//Create a class Student having static variable collegeName and instance variables name and rollNo.
//Write a method to print both static and instance data.
//Create multiple objects to show static value remains constant.

class Students
{
	static String collegeName = "VPN";
	int rollNo;
	
	Students(int rollNo)
	{
		this.rollNo = rollNo;
	}
	void display()
	{
		System.out.println(collegeName +" "+rollNo);
	}
}

public class Q10 {

	public static void main(String[] args) {
		
		Students obj = new Students(123);
		obj.display();
		Students obj1 = new Students(1234);
		obj1.display();
		Students obj2 = new Students(12345);
		obj2.display();
		
		

	}

}
