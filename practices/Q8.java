package com.practices;

//8.  Polymorphism (Dynamic Binding)
//Create a parent class Shape with a method area().
//Create subclasses Rectangle and Circle and override the area() method.
//Create a reference of Shape and assign objects of both subclasses one by one, calling area() each time.

class Shape
{
	void area()
	{
		System.out.println("Print area");
	}
}
class Rectangle extends Shape
{
	
	void area()
	{
		System.out.println("Print area of Rectangle");
	}
}
class Circle extends Shape
{
	void area()
	{
		System.out.println("Print area of Circle");
	}
}
public class Q8 {

	public static void main(String[] args) {
		Shape ref = new Rectangle();
		ref.area();
		Shape ref1 = new Circle();
		ref1.area();
		

	}

}
