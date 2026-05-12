package com.practices;

//Create a Class named Shape with length as instance variable  , create three methods as square , rectangle , circle 
//and find out their respective areas 
//Create a object in main method and call these different methods with the instance of object 

class Shapes
{
	int length ;
	Shapes(int length)
	{
		this.length =length;
	}
	int Square()
	{
		return length*length;
	}
	int rectangle(int breadth)
	{
		return length*breadth;
	}
	double circle()
	{
		return 3.14*length*length;
	}
	
}
public class Q22 {

	public static void main(String[] args) {
		Shapes obj = new Shapes(6);
		System.out.println(obj.Square());
		System.out.println(obj.rectangle(4));
		System.out.println(obj.circle());
		

	}

}
