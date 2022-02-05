package colection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example_vector 
{

	public static void main(String[] args) {
		
		
		
	     
		Vector v= new Vector();
		
		v.add("Rahul");
		v.add('A');
		v.add(100);
		v.add(65.5f);
		v.add(100);
		v.add(null);
		v.add(null);
		
		
		
		System.out.println(v);
		System.out.println(v.size());  //7
		System.out.println(v.isEmpty());  //false
		System.out.println(v.contains(100));  //true
		
		System.out.println(v);
		v.add(2,200);      //right opration
		
		System.out.println(v);

		v.remove(1);   //left opration
		
		System.out.println(v);
		
		v.set(3, 80);
		System.out.println(v);
		
          System.out.println(v.indexOf(200));
          System.out.println(v.get(4));

		System.out.println(v);
		
		
		System.out.println("----print vector data using iterator--");
	
		
		Iterator itr=v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		
		System.out.println("----print vector data using listIterator--");
		
		ListIterator litr=v.listIterator();
		
       
		while(litr.hasNext())
		{
			System.out.println(litr.next());
			
		}
	

		System.out.println("-----print Arraylist data using for loop");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
			
		}
				
		
	}
}
