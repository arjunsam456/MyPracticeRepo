package com.practices;

//9.Final Keyword
//Create a class Bank with a final variable IFSC and final method showIFSC().
//Try creating a subclass HDFCBank and attempt overriding the final method (should show compile-time restriction).
//Create a main method to demonstrate usage.

class Bank
{
	final int IFSC = 12345;
	final void show()
	{
		System.out.println("IFSC code is "+IFSC);
	}
	
}
class HDFCBank extends Bank
{

	void display()
	{
		System.out.println("IFSC code");
	}
}

public class Q9 {

	public static void main(String[] args) {
		 HDFCBank obj = new HDFCBank();
		 obj.show();
		 obj.display();

	}

}
