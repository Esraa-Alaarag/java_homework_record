package JavaAssignment_PartD;

import java.util.*;

abstract class Mathematician {
	protected int num1,num2,num3,result,responseTime;
	Date timeRequested ;
	
	abstract void add (int a , int b);
	abstract void subtract (int a , int b);
	abstract void multiply (int a , int b);
	abstract void divide (int a , int b);
	void print (int result , int seconds) {
		System.out.println("The answer to your inquiry is '"+ result+"'");
		System.out.println("Response time: '"+seconds+"' seconds");

	}


}
