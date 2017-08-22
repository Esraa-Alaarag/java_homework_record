package com.cognizant.tax;

public class TaxCalculator {
	float basicSalary ;
	boolean citizenship ;
	float tax;
	TaxCalculator(boolean c , float salary){
		this.basicSalary=salary;
		this.citizenship=c;
	}
	void calculateTax () {
	 this.tax = 30*this.basicSalary/100;
	System.out.println("The Tax of the employee  for  the "+ (int)this.basicSalary + " is " +  (int)tax);
	
	}
	
	void deductTax() {
		
		int nettSalary=(int)(this.basicSalary-this.tax);
	    System.out.println("The nett salary of the employee "+ (int)nettSalary );
		
	}
	void validateSalary() {
		boolean response = false;
		if(this.citizenship==true && this.basicSalary>100000)
		{
			response=true;
		}
		System.out.println("The salary and citizenship eligibility:  "+response+ "\n" );
	}
}
