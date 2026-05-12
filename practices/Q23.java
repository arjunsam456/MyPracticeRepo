package com.practices;

//23.  Constructor Chaining
//Create a class Mall with:
//Default constructor printing "Welcome to the Mall"
//Parameterized constructor calling default constructor using this()
//Demonstrate constructor chaining in main.

class Mall
{
	Mall()
	{
		System.out.println("Welcome to the Mall");
	}
	Mall(String msg)
	{
		this();
		System.out.println("Enjoy your Movie");
	}
}

public class Q23 {

	public static void main(String[] args) {
		Mall obj = new Mall("Sale sale sale");
		
		

	}

}
