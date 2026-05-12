package com.practices;

//12.  Encapsulation + Validation Logic
//Create a class Account with private variables accountHolderName and balance.
//Provide setters and getters, where:
//setBalance() should not accept negative values (print a warning).
//Create an object and update values through setters only.

class Account
{
	private String accountHolderName;
	private double balance;
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance<0)
		{
				System.out.println("Warning : out of balance");
		}
		else
		{
			this.balance = balance;
		}
		
	}
}	
public class Q12 {

	public static void main(String[] args) {
		
		Account obj = new Account();
		obj.setAccountHolderName("Arjun");
		obj.setBalance(-9876);		
		System.out.println(obj.getAccountHolderName());
		System.out.println(obj.getBalance());
		

	}

}
