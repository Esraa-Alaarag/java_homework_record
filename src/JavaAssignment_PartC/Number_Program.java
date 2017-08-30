package JavaAssignment_PartC;

import java.util.*;

public class Number_Program extends Thread{
	//declaring the ranges
	int start , end;
	//declaring the thread type and the Array list that keeps the numbers
	String numberType;
	List <Integer> numberList = new  ArrayList<Integer>() ;
	
	//the class constructor to initialize the variables
	Number_Program(String numberType,int start,int end){
	this.numberType = numberType;
	this.start=start;
	this.end=end;
	
	}
	
	//over riding the threads run methods
	@Override
	public void run() {
		//loop through the range and store the number according to the thread type
		for(int i=this.start ; i<=this.end;i++)
		{
			if(this.numberType=="ODD")
			{//if the number can not be divided by 2 without remainder then it's odd
				if(i%2==1) {
					numberList.add(i);
					
				} 	
			}
			else 
			{//if the number can be divided by 2 without remainder then it's even
				if(i%2==0) {
					numberList.add(i);
				
				} 
			}
				
		}
			
	}
	
	//printing the array
	void display() {
		for(int i=0 ;i<this.numberList.size();i++)
		System.out.print(this.numberList.get(i)+" ");
	}
}
