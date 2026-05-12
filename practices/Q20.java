package com.practices;

//21.Static Concepts
//Create a class University with:
//static variable country = "India"
//instance variable universityName
//Print values using different objects to show static effect.

class University
{
	static String country = "India";
	String universityName;
	void display()
	{
		System.out.println("University name is "+universityName+" and Country name is "+country);
	}
}

public class Q20 {

	public static void main(String[] args) {
		University obj = new University();
		obj.universityName = "VPN";
		University obj1 = new University();
		obj1.universityName = "VPM";
		obj.display();
		obj1.display();

	}

}
