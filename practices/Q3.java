package com.practices;

//3. Constructor Overloading
//Create a class Product having instance variables productId, productName, and price.
//Implement: A default constructor that prints "Product Created".
//A parameterized constructor that initializes the product details.
//Write a method displayProduct() to print product details.
//Create both types of objects in the main method.

class Product
{
	int ProductId;
	String ProductName;
	double Price;
	
Product()
{
	System.out.println("Product Created");
}
Product(int ProductId , String ProductName , double Price)
{
	this.ProductId=ProductId;
	this.ProductName=ProductName;
	this.Price=Price;
}
void displayProduct()
{
	System.out.println("Product Id is :"+ProductId);
	System.out.println("Product Name is :"+ProductName);
	System.out.println("Product Price is :"+Price);
	
}
}


public class Q3 {

	public static void main(String[] args) {
		
		Product obj = new Product();
		obj.displayProduct();
		
		Product obj1 = new Product(2282, "Arjun", 99000);
		obj1.displayProduct();
		
		
	}

}
