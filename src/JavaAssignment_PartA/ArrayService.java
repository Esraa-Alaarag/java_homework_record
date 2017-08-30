package JavaAssignment_PartA;

import java.util.Scanner;

public class ArrayService {

	public static void main(String[] args) {
		
		//declaring the array 
		int [] myarray;
		
		//declaring variable to store the input temporary . and the array length
		int value , length;
		
		//declaring the scanner object
		Scanner console=new Scanner(System.in);
		
		//input the size of the array and assign the array length to that size
		System.out.println("Enter the number of elements in the array ");
		length= console.nextInt();
		myarray = new int[length];
	
		//feeding the array
		System.out.println("Enter the elements in the array ");
		for(int i=0 ;i<myarray.length;i++) {
			value= console.nextInt();
			myarray[i]=value;
		}	
		
		//asking the user for the index , which might cause exception so we put it inside catch
		System.out.println("Enter the index of the array element you want to access ");
		value= console.nextInt();
		try {
			//the index is valid
			System.out.println("The array element at index"+value+"="+myarray[value]);
			System.out.println("The array element successfully accessed ");
	
		//if the index is not valid
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("IndexOutOfRangeException");
		}
		finally {
			//closing the scanner 
			console.close();
		}	
		
	}

}
