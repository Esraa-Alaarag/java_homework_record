package JavaAssignment_PartD;

import java.util.Calendar;
import java.util.Scanner;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//Create a class called ‘InputCollector’. 
//The inputCollector object will be responsible for collecting the input,
//making a record of the time the inquiry was made and passing the information on to the right calculating object (Adder, Subtractor, Multiplier, or Divider)
	
public class InputCollector {
	
	//Declare a variable with a ‘long’ data type and name it ‘timeRequested’.
	//It will be initialized via the constructor when the InputCollector is instantiated.
	long timeRequested;
	Calendar currenTime ;
	//Declare, but not initialize another three variables with an integer data type. Name them num1, num2, & num3.
	int num1 , num2,num3;
	boolean third=false;
	public InputCollector() {
	
	
	//Inside the constructor, use the Calendar method .getInstance() to get the current time. 
	 this.currenTime = Calendar.getInstance();
	
	//Convert that into milliseconds using another Calendar method, and assign it to the ‘timeRequested’ variable. 
	this.timeRequested=currenTime.getTimeInMillis();
	
	}
	
	
	/*

If input is equal to ‘1’, user has another integer, then collect it and store the value into the variable ‘num3’, then create a new ‘Adder’ class object and get the four variables, num1, num2, num3 & timeRequested into the constructor. Then call the add method.

If input is equal to ‘2’, no more integers, then create a new ‘Adder’ class object and get the three variables, num1, num2, & timeRequested into the constructor. Then call the add method. 
	 */
	
	
	
	//Create a method called ‘collectInput’
	void collectInput () {
		
		/* . This method will perform the following:
		Ask the user if they want to:
		1.	Add
		2.	Subtract
		3.	Multiply
		4.	Divide
		*/
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
		
		
		/*If input is equal to ‘1’, then ask user for First and second Integer. 
		 * Store the values into the variables you declared earlier. 
		 * Then ask the user if they have a third integer, tell them to: 
		Enter ‘1’ for Yes
		Enter ‘2’ for No
		*/
		System.out.println("Do you have third integer? Enter 1 for yes and 2 for No ");
		int ans= console.nextInt();
		
		if(ans ==1)
		{
			System.out.println("Enter the third number");
			this.num3 = console.nextInt();
			third=true;
		}
		else if(ans ==2) {
			System.out.println("No third number");
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
		
		/* using the File API (from Java.io.*), 
		 * 
 		We will be writing to this ‘file’ using a stream, specifically an output stream. 
 		For now the only information we will be sending through this stream is the time the inquiry was made. 
 		The Calendar method .getTime(), after getting an instance, will be the format we want to send through the stream.  
 		Just a heads up when using the output stream you may have to catch an IOException. And remember to close the stream as the final command.
*/		
		//create a new File and name it “Mathematician’s Log book”
		Path file = Paths.get("Mathematician’s-Log-book.txt");
		try {
		    // Create the empty file with default permissions, etc.
		    Files.createFile(file);
		} catch (FileAlreadyExistsException x) {
			//when the file already exist
		    System.err.format("file named %s" +
		        " already exists%n", file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//convert the calendar information to string then to array of bytes
		String input=this.currenTime.toString();
		byte [] stringbyted = input.getBytes();
		 OutputStream os ;
		try {
		         // create a new output stream
		         os = new FileOutputStream("Mathematician’s-Log-book.txt");
		         // write the bytes
		         os.write(stringbyted);
		         os.close();
		      } catch (IOException ex) {
		         ex.printStackTrace();
		      }
		//cleaning the heab
		Runtime r = Runtime.getRuntime();
		r.gc();
	}
	
}
