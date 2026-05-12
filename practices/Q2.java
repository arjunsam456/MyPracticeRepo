package com.practices;

//2.Inheritance + Method Overriding
//Create a base class Vehicle with a method fuelType() which prints "Runs on fuel".
//Create a child class ElectricCar and override the fuelType() method to print "Runs on electricity".
//Create objects of both classes and call their respective methods.

class Vehicle
{
	void fuelType()
	{
		System.out.println("Runs on fuel");
	}
}

class ElectricCar extends Vehicle
{
	void fuelType()
	{
		System.out.println("Runs on electricity");
	}
}
public class Q2 {

	public static void main(String[] args) {
		
		Vehicle obj = new Vehicle();
		obj.fuelType();
		ElectricCar obj1 = new ElectricCar();
		obj1.fuelType();

	}

}
