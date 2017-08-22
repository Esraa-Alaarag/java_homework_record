package com.cognizant.tax;

public class EmployeeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator person1 = new TaxCalculator(true, 25000);
		person1.calculateTax();
		person1.deductTax();
		person1.validateSalary();
		TaxCalculator person2 = new TaxCalculator(true, 125000);
		person2.calculateTax();
		person2.deductTax();
		person2.validateSalary();
	}

}
