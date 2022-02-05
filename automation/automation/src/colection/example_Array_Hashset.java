package colection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class example_Array_Hashset {

	
	public static void main(String[] args) {
		
		

		ArrayList a1=new ArrayList();
			
			a1.add("Rahul");
			a1.add(100);
			a1.add('A');
			a1.add(65.5f);
			a1.add(100);
			a1.add(null);
			a1.add(null);
			
			System.out.println(a1);
			
			System.out.println("----by HashSet---");
		HashSet hs=new HashSet(a1);          //remove duplicate but order not maintain
		
		System.out.println(hs);
	LinkedHashSet lhs=new LinkedHashSet(a1);  //maintain order
	System.out.println(lhs);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
