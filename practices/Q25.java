package com.practices;

//16. WAP in Java to create a class named school 
//create name, address,strength as their instance variables 
//Create two constructor one with two variables and one with all the three variables 
//Create a method that will display all the three parameters 
//create two object of this class and call the respective methods 

class schools
{
	String name;
	String address;
	int strength;
	
	schools(String name, String address)
	{
		this.name=name;
		this.address=address;
	}
	schools(String name, String address,int strength)
	{
		this(name,address);
		this.strength=strength;
	}
	void display()
	{
		System.out.println("Name of school is "+name);
		System.out.println("Address of school is "+address);
		System.out.println("Total strength is "+strength);
	}
}
public class Q25 {

	public static void main(String[] args) {
		schools obj = new schools("NLCIL","Chennai");
		obj.display();
		schools obj2 = new schools("NLCIL","Chennai",1000);
		obj2.display();
	}

}
