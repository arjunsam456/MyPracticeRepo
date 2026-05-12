package com.practices;

//22. Final Keyword + Constant
//Create a class GovernmentRules with a final variable MAX_WORKING_HOURS = 8
//Try modifying it inside main and observe compile-time restriction.
class CompanyRules 
{
    final int MAX_WORKING_HOURS = 8;
    static final String COMPANY_NAME = "TechCorp";
}

class Employee{
    int id;
    String name;
    double salary;
    final double BONUS;
    Employee(int id, String name, double salary, double bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.BONUS = bonus;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + BONUS);
        System.out.println("Company: " + CompanyRules.COMPANY_NAME);
       
    }
}

public class Q21 {
    public static void main(String[] args) {

        CompanyRules rules = new CompanyRules();

        Employee e1 = new Employee(1, "Sam", 50000, 5000);
        Employee e2 = new Employee(2, "John", 60000, 6000);

        e1.displayDetails();
        e2.displayDetails();

        System.out.println("Max Working Hours: " + rules.MAX_WORKING_HOURS);
    }
}