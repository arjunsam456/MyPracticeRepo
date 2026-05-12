package com.practices;

//5.  Abstraction using Abstract Class
//Create an abstract class Animal with an abstract method sound().
//Create two subclasses Dog and Cat and provide implementation for sound() method.
//Create objects and call sound() for each.

abstract class Animal
{
	abstract void sound();
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Bark");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("meows");
	}
}

public class Q5 {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.sound();
		Cat obj1 = new Cat();
		obj1.sound();
		
	}

}
