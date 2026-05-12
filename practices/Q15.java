package com.practices;

//15.  Method Overloading (Bank Scenario)
//Create a class LoanCalculator with two overloaded methods:
//calculateLoan(int amount)
//calculateLoan(int amount, double interestRate)
//Print loan details accordingly. Call both methods from main.

class LoanCalculator
{
	void calculateLoan(int amount)
	{
		System.out.println("Loan amount is "+amount);
	}
	void calculateLoan(int amount, double interestRate)
	{
		System.out.println("Loan amount is "+amount+" and interest rate is "+interestRate);
	}
}

public class Q15 {

	public static void main(String[] args) {
		LoanCalculator  obj = new LoanCalculator();
		obj.calculateLoan(50000);
		obj.calculateLoan(50000, 9.0);
		

	}

}
