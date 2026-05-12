package com.practices;

//18.  Interface with Multiple Implementations
//Create an interface Transport with method booking().
//Implement it in Bus and Flight classes.
//Call using interface reference.

interface Transport
{
	void booking();
}
class Bus implements Transport
{
	public void booking()
	{
		System.out.println("book tickets on Spotify");
	}
}
class Flight implements Transport
{
	public void booking()
	{
		System.out.println("book flight tickets on Makemytrip");
	}
}
public class Q18 {

	public static void main(String[] args) {
		Transport ref = new Bus();
		ref.booking();
		Transport ref1 = new Flight();
		ref1.booking();

	}

}
