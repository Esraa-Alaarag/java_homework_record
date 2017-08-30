package JavaAssignment_PartD;

import java.util.Calendar;
import java.util.Scanner;

public class InputCollector {
	long timeRequested;
	int num1 , num2,num3;
	boolean third=false;
	public InputCollector() {
		// TODO Auto-generated constructor stub
	Calendar currenTime = Calendar.getInstance();
	this.timeRequested=currenTime.getTimeInMillis();
	
	}
	void collectInput () {
	Scanner console=new Scanner(System.in);
	System.out.println("Enter the number of the required mathematical operation\n"
			+ "1. Add\n"
			+ "2. Substract\n" + 
			"3. Multiply\n" + 
			"4. Divide");
	int choice = console.nextInt();
	System.out.println("Enter the first and the second number");
	this.num1 = console.nextInt();
	this.num2 = console.nextInt();
	System.out.println("Do you have third integer? Enter yes/No ");
	String ans= console.next();
	ans=ans.toLowerCase();
	System.out.println(ans);
	if(ans.equals("yes"))
	{
		System.out.println("Enter the third number");
		this.num3 = console.nextInt();
		third=true;
	}
	else if(ans.equals("no")) {
		System.out.println("No third number");
	}
	else
	{
	System.out.println("wrong entery");
	choice=0;
	}
	
	if(choice==1 && third==false) { 
		Adder plus = new Adder(this.num1,this.num2,this.timeRequested);
		plus.add(num1, num2);
	}
	else if(choice==1 && third==true) { 
		Adder plus = new Adder(this.num1,this.num2,this.num3,this.timeRequested);
		plus.add(num1, num2,num3);
	}
	else if(choice==2 && third==false) { 
		Subtractor minus = new Subtractor(this.num1,this.num2,this.timeRequested);
		minus.subtract(num1, num2);
	}
	else if(choice==2 && third==true) { 
		Subtractor minus = new Subtractor(this.num1,this.num2,this.num3,this.timeRequested);
		minus.subtract(num1, num2, num3);
	}
	else if(choice==3 && third==false) { 
		Multiplier x = new Multiplier(this.num1,this.num2,this.timeRequested);
		x.multiply(num1, num2);
	}
	else if(choice==3 && third==true) { 
		Multiplier x = new Multiplier(this.num1,this.num2,this.num3,this.timeRequested);
		x.multiply(num1, num2, num3);
	}
	else if(choice==4 && third==false) { 
		Divider div = new Divider(this.num1,this.num2,this.timeRequested);
		div.divide(num1, num2);
	}
	else if(choice==4 && third==true) { 
		Divider div = new Divider(this.num1,this.num2,this.num3,this.timeRequested);
		div.divide(num1, num2, num3);
	}
	else {
		System.out.println("restart this program to repeat");
	}

	
	
	
	}
}
