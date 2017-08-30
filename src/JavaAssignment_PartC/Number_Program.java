package JavaAssignment_PartC;

import java.util.*;

public class Number_Program extends Thread{
	int start , end;
	String numberType;
	List <Integer> numberList = new  ArrayList<Integer>() ;
	
	
	Number_Program(String numberType,int start,int end){
	this.numberType = numberType;
	this.start=start;
	this.end=end;
	//this.numberList=null;
	}
	
	@Override
	public void run() {
		//System.out.println("inside the run");
		for(int i=this.start ; i<=this.end;i++)
		{
			if(this.numberType=="ODD")
			{
				if(i%2==1) {
					numberList.add(i);
					//System.out.println("odd Thread number="+i);
				} 	
			}
			else 
			{
				if(i%2==0) {
					numberList.add(i);
					//System.out.println("Even Thread number="+i);
				} 
			}
				
		}
			
	}
	void display() {
		for(int i=0 ;i<this.numberList.size();i++)
		System.out.print(this.numberList.get(i)+" ");
	}
}
