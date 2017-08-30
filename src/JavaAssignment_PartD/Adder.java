package JavaAssignment_PartD;

import java.util.Date;





// Create a subclass of the Mathematician class and call it ‘Adder’
public class Adder extends Mathematician {
	
	//Create a constructor that will receive two parameters.
	//The constructor will take the two parameters and assign them to the initially declared variables; num1 & num2.
	Adder(int num1 , int num2,long timeRequested){
		this.num1=num1;
		this.num2=num2;
	
		//Assigned ‘timeRequested’ to the current time in milliseconds. 
		//Note: we can't store the current time in millisecond because time requested is Date object and time in millisecond is long
		this.timeRequested = new Date();
		/*getTime():It returns the number of milliseconds */
		System.out.println("Time in milliseconds using Date class: " + this.timeRequested.getTime());
	}
	
	//Create another constructor that will receive three parameters.
	// This constructor will take the three parameters and assign them to the variables; num1, num2, & num3
	
	Adder(int num1 , int num2, int num3, long timeRequested){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		
		//Assigned ‘timeRequested’ to the current time in milliseconds .
		//Note: we can't store the current time in millisecond because time requested is Date object and time in millisecond is long
		this.timeRequested = new Date() ;
		/*getTime():It returns the number of milliseconds */
		System.out.println("Time in milliseconds using Date class: " + this.timeRequested.getTime());
	}
	
	
	//create a method called ‘add’. This method take two parameters, (variables num1 & num2 that were initialized by the constructor) 
	void add(int num1, int num2) {
		
		//add them together and store the result in the initially declared variable ‘result’. 
		this.result=this.num1+this.num2;
		
		
		//Within the method create a new date object and convert it to milliseconds .
		Date newDate	 = new Date();
		
		//Then subtract the timeReqested from the new date object (in seconds) and store the result in the ‘responseTime’ variable. 
		long diff=newDate.getTime()-this.timeRequested.getTime();
		this.responseTime=(int) (diff/1000);
		System.out.println(newDate.getTime()+ ","+timeRequested.getTime());
		
		//Then call the print() method, passing in the ‘result’ and ‘responseTime’ as parameters.
		this.print(this.result, this.responseTime);
	}
	
	
	//Create another method called ‘add’ that will execute the same commands as the first method but this will take three parameters (num1, num2, num3).
	void add (int num1 , int num2, int num3) {
		
		//add them together and store the result in the initially declared variable ‘result’. 
		this.result = this.num1+this.num2+this.num3;
		
		//Within the method create a new date object and convert it to milliseconds .
		Date newDate	 = new Date();
		
		//Then subtract the timeReqested from the new date object (in seconds) and store the result in the ‘responseTime’ variable. 
		long diff=newDate.getTime()-this.timeRequested.getTime();
		this.responseTime=(int) (diff/1000);
		this.print(this.result, this.responseTime);
	}
	
	//we have to include all the unused methods because of abstraction
	
	@Override
	void subtract(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void multiply(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void divide(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
