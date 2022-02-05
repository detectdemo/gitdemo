package colection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class exampal_Arraylist {
	

	
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
		System.out.println(a1.isEmpty());  //false
		System.out.println(a1.size()); //7
		System.out.println(a1.contains(100));//true

		//add info in between Array-->right shift opreation
		System.out.println(a1);
	
		a1.add(1,200);
		System.out.println(a1);
		
		//remove/delete info in between arraylist----->left shift opretion
		
		a1.remove(5);
		System.out.println(a1);
		
		//update info in array
		
		a1.set(4,80);
		
		System.out.println(a1);
		
		System.out.println(a1.indexOf("Rahul"));//0
	
		System.out.println(a1.get(2)); //100  
		
		System.out.println("-------print Arraylist data using itrator--------------");
		
		Iterator itr=a1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------print Arrray data using ListItrator");
		
		
		ListIterator litr=a1.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		
		System.out.println("-----print Arraylist data using for loop");
		
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
		
		
		System.out.println("-----print Arraylist data using for each loop---");
		
		for(Object s1:a1)
		{
		
			System.out.println(s1);
		}
	}
	
}
