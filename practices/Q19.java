package com.practices;

//19. Polymorphism (Runtime + Upcasting)
//Create a class Camera with a method capture().
//Create a subclass DSLCamera that overrides the method.
//Use parent reference to call child object method (dynamic polymorphism).

class Camera
{
	void capture()
	{
		System.out.println("Capturing photo of low quality");
	}
}
class DSLCamera extends Camera
{
	void capture()
	{
		System.out.println("Capturing photo of HD quality");
	}
}

public class Q19 {

	public static void main(String[] args) {
		Camera ref = new DSLCamera();
		ref.capture();
	}

}
