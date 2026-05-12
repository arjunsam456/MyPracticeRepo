package com.practices;

//11.  Class + Object + Method
//Create a class Library with an instance variable libraryName.
//Create a default constructor to print "Welcome to the Library!".
//Create a method showLocation() which prints "This library is located in Mumbai".
//Create an object in main() and call both.

class Library
{
	String LibraryName;
	
Library()
{
	System.out.println("Welcome to the Library!");
}
void showLocation() 
{
	System.out.println("This library is located in Mumbai");
}
}
public class Q11 {
	public static void main(String[] args) {
		Library obj = new Library();
		obj.showLocation();
		
	}

}
