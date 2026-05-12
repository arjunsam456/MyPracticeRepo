package com.practices;

//13. Inheritance (Multilevel)
//Create three classes:
//Device → method start()
//Mobile extends Device → method calling()
//SmartPhone extends Mobile → method internet()
//Create object of SmartPhone and call all methods.

class Device
{
	void start()
	{
		System.out.println("Process started");
	}
}
class Mobile extends Device
{
	void calling()
	{
		System.out.println("Call initaited");
	}
}
class Smartphones extends Mobile
{
	void internet()
	{
		System.out.println("Internet used");
	}
}

public class Q13 {

	public static void main(String[] args) {
		Smartphones obj = new Smartphones();
		obj.start();
		obj.calling();
		obj.internet();

	}

}
