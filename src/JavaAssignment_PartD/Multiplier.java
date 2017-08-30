package JavaAssignment_PartD;

import java.util.Date;

public class Multiplier extends Mathematician {
	Multiplier(int num1 , int num2, long timeRequested){
		this.num1=num1;
		this.num2=num2;
		
	this.timeRequested = new Date();
	      /*getTime():It returns the number of milliseconds since 
	       * January 1, 1970, 00:00:00 GMT 
	       * represented by this date.
	       */
	 
	System.out.println("Time in milliseconds using Date class: " + this.timeRequested.getTime());


	}
	
	
	Multiplier(int num1 , int num2, int num3, long timeRequested){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;

		this.timeRequested = new Date() ;
		/*getTime():It returns the number of milliseconds since 
	       * January 1, 1970, 00:00:00 GMT 
	       * represented by this date.
	       */
	System.out.println("Time in milliseconds using Date class: " + this.timeRequested.getTime());
	}
	
	
	
	
	void multiply(int num1, int num2) {
		this.result=this.num1*this.num2;
	Date newDate	 = new Date();
	long diff=newDate.getTime()-this.timeRequested.getTime();
	this.responseTime=(int) (diff/1000);
	this.print(this.result, this.responseTime);
	}
	
	void multiply (int num1 , int num2, int num3) {
		this.result = this.num1*this.num2*this.num3;
		Date newDate	 = new Date();
		long diff=newDate.getTime()-this.timeRequested.getTime();
		this.responseTime=(int) (diff/1000);
		this.print(this.result, this.responseTime);
	}


	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}


	@Override
	void subtract(int a, int b) {
		// TODO Auto-generated method stub
		
	}


	@Override
	void divide(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}
