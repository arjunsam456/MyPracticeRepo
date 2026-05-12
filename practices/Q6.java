package com.practices;

//6.  Interface Implementation
//Create an interface Payment with a method makePayment().
//Create two classes UPI and CreditCard implementing this interface and define their own payment messages.
//Call the method through interface reference.

interface Payment
{
	void makePayment();
}
class UPI implements Payment
{
	public void makePayment()
	{
		System.out.println("Make a payment using UPI");
	}
}
class CreditCard implements Payment
{
	public void makePayment()
	{
		System.out.println("Make a payment using Credit card");
	}
	
}

public class Q6 {

	public static void main(String[] args) {
		
		Payment ref = new UPI();
		ref.makePayment();
		Payment ref1 = new CreditCard();
		ref1.makePayment();

	}

}
