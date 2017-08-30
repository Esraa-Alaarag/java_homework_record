package JavaAssignment_PartC;

import java.util.Scanner;

public class Main_Program {

	public static void main(String[] args) {
		// Declare and initialized the scanner
		Scanner console=new Scanner(System.in);
		
		//ask the user to enter the range[start, end]
		System.out.println("Enter range of numbers ");
		int start = console.nextInt();
		int end = console.nextInt();
		
		//create two threads objects one for even one for odd
		Number_Program thread1 = new Number_Program("ODD", start, end);
		Number_Program thread2 = new Number_Program("even", start, end);
		
		//this call will start the run
		thread1.start();
		thread2.start();
		
		//the two threads will wait for each other 
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			//in case of exception
			e.printStackTrace();
		}
		finally{
			//printing the result
			System.out.println("Odd numbers in given range"); 
			thread1.display();
			System.out.println("\nEven numbers in given range");
			thread2.display();
			console.close();
		}
		
		
	}

}
