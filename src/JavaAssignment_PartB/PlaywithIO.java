package JavaAssignment_PartB;
import java.io.*;

public class PlaywithIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0 , y = 0;
		InputStreamReader mystring = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(mystring);
		String line;
		System.out.println("Please enter direction to Mr.Prime");
		try {
			line = console.readLine();
			char[] letters = line.toCharArray();
			if(line.length()<=10) {
				for (char a : letters)  {
					if(Character.toUpperCase(a) =='U') {
						++y;
					}
					else if(Character.toUpperCase(a) =='D') {
						--y;
					}
					else if(Character.toUpperCase(a)=='L') {
						--x;
					}
					else if(Character.toUpperCase(a)=='R') {
						++x;
					}
				}
			}
			else 
				System.out.println("I won’t be able to make it that far");
			
			System.out.println("Mr.Prime location =(" +x+ ","+y+")");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
