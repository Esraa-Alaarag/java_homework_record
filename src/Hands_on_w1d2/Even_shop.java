package Hands_on_w1d2;

import java.util.ArrayList;
import java.util.Iterator;

public class Even_shop {
	
	ArrayList<Integer> A1 = new ArrayList<>();
	ArrayList<Integer> A2 = new ArrayList<>();
	
	ArrayList<Integer> storeEvenNumbers(int N) {
		
	
	for(int i =0; i<=N ;i++) {
		if(i%2==0) {
		this.A1.add(i);
		}
	}
	return this.A1;
				
	}
	
	  ArrayList<Integer> printEvenNumbers() {
		
		  Iterator<Integer> it = this.A1.iterator();
		  while(it.hasNext()) {
			  int result = it.next()*2;
			  this.A2.add(result);
			  System.out.println(result);
		  }
		  return this.A2;
		  
	}
	  int retrieveEvenNumber(int N) {
		  Iterator<Integer> it = this.A1.iterator();
		  while(it.hasNext()) {
			  if(it.next()==N) {
				  return N;
			  }
			 
		  }
		  return 0;
	  }
}
