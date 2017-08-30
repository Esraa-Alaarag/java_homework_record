package JavaAssignment_PartD;

import java.util.*;

//Create an abstract class called ‘Mathematician’
abstract class Mathematician {
	
	//Declare, but not initialize, five protected integer variables; num1, num2, num3, result& responseTime 
	protected int num1,num2,num3,result,responseTime;
	
	//declare one ‘Object Date’ variable: ‘timeRequested’.
	Date timeRequested ;
	
	//Create four Abstract methods; add, subtract, multiply and divide. 
	//Each of these methods takes two parameter of type integer.
	abstract void add (int a , int b);
	abstract void subtract (int a , int b);
	abstract void multiply (int a , int b);
	abstract void divide (int a , int b);
	
	
	//Create one more method and name it ‘print’. This method will take two parameters. 
	//The first will be an integer, which will be the result
	//The second will be another integer,which will be the amount of seconds it took to produce the result 
	void print (int result , int seconds) {
		
		/*
		This method will print the following statements to the screen:
		“The answer to your inquiry is ‘param 1’ ” 
		“Response time: ‘param 2’ seconds”
		*/
		System.out.println("The answer to your inquiry is '"+ result+"'");
		System.out.println("Response time: '"+seconds+"' seconds");

	}


}
