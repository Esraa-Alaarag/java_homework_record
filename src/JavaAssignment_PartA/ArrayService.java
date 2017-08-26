package JavaAssignment_PartA;

import java.util.Scanner;

public class ArrayService {
//	void printmyarray (int[] array) {
//		for (int a : array) {
//			System.out.println(a);
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myarray;
		int value , length;
		Scanner console=new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array ");
		length= console.nextInt();
		myarray = new int[length];
	
		System.out.println("Enter the elements in the array ");
		for(int i=0 ;i<myarray.length;i++) {
			value= console.nextInt();
			myarray[i]=value;
		}	
		//obj.printmyarray(myarray);
		System.out.println("Enter the index of the array element you want to access ");
		value= console.nextInt();
		try {
			System.out.println("The array element at index"+value+"="+myarray[value]);
			System.out.println("The array element successfully accessed ");
	

		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("IndexOutOfRangeException");
		}
		finally {
			console.close();
		}	
		
	}

}
