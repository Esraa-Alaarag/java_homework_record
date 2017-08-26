package JavaAssignment_PartC;

import java.util.Scanner;

public class Main_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		
		System.out.println("Enter your start number \n");
		int start = console.nextInt();
		
		System.out.println("Enter your end number\n ");
		int end = console.nextInt();
		
		Number_Program thread1 = new Number_Program("ODD", start, end);
		Number_Program thread2 = new Number_Program("even", start, end);
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("Odd numbers in given range"); 
			thread1.display();
			System.out.println("Even numbers in given range");
			thread2.display();
			console.close();
		}
		
		
	}

}
