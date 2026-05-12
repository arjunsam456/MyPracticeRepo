package com.practices;

//16.  Method Overriding with super
//Create a base class Hospital with a method emergencyService().
//Create a subclass CityHospital that overrides the method and calls parent method using super.emergencyService().
//Demonstrate overriding in main.

class Hospital
{
	void emergencyService()
	{
		System.out.println("Emergency services not provided in Hospital");
	}
}
class CityHospital extends Hospital
{   
	
	void emergencyService()
	{
		super.emergencyService();
		System.out.println("Emergency services will be provided in city Hospital");
		
	}
	
}

public class Q16 {

	public static void main(String[] args) {
		CityHospital obj = new CityHospital();
		obj.emergencyService();
		
		
		
	}

}
