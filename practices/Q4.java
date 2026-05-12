package com.practices;

//4. Method Overloading
//Create a class Calculator with overloaded methods add():
//add(int a, int b)
//add(double a, double b)
//Call both methods inside the main method and print results.

class Calculator
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public double add(double a, double b)
	{
		return a+b;
	}
}

public class Q4 {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		System.out.println(obj.add(3, 4));
		System.out.println(obj.add(22.2, 23.8));
		

	}

}
