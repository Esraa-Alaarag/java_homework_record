package JavaAssignment_PartB;
import java.io.*;

public class PlaywithIO {

	public static void main(String[] args) {
		//Initialize the robot starting location
		int x = 0 , y = 0;
		String line;
		
		//use the buffer reader to read the input 
		InputStreamReader mystring = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(mystring);
		
		//ask the user to enter his direction
		System.out.println("Please enter direction to Mr.Prime");
		try {
			//read the user instruction
			line = console.readLine();
			
			//store the user direction inside array of int
			char[] letters = line.toCharArray();
			
			//the size of the entered direction should not be more than 10
			if(line.length()<=10) {
				//loop inside the array
				for (char a : letters)  {
					//increment the y axis
					if(Character.toUpperCase(a) =='U') {
						++y;
					}
					//decrement the y axis
					else if(Character.toUpperCase(a) =='D') {
						--y;
					}
					//decrement the x axis
					else if(Character.toUpperCase(a)=='L') {
						--x;
					}
					//increment the x axis
					else if(Character.toUpperCase(a)=='R') {
						++x;
					}
				}
			}
			else //if more than 10 entries
				System.out.println("I won’t be able to make it that far");
			
			//display result
			System.out.println("Mr.Prime location =(" +x+ ","+y+")");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
