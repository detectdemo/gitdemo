package colection;

import java.util.Iterator;
import java.util.LinkedList;

public class example_LinkedList 
{

	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		
		li.add("Rahul");
		li.add(100);
		li.add('A');
		li.add(100);
		li.add(null);		
		li.add(65.5f);
		li.add(null);
		
		
		System.out.println(li);
		System.out.println(li.size()); //7
		System.out.println(li.isEmpty());//false
		System.out.println(li.contains(100));//true


		//add info in between linklist
		System.out.println("------add info in between linklist-------");
		
		li.add(3,200);
		System.out.println(li);
		
		//remove info 
		
		li.remove(5);
		System.out.println(li);
		
		//set (update)
		
		li.set(2, 'T'); 
		li.set(0, "Rupesh");
		System.out.println(li);
		
		
		//Iterator
		System.out.println("------Iterator--------");
		Iterator itr=li.iterator();
		 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----for each loop-----");
		
		for(Object s1:li)
		{
			System.out.println(s1);
		}
		
		System.out.println("---------for loop---------");
		
		for(int i=0;i<=li.size()-1;i++)
		{
			System.out.println(li.get(i));
		}
		
		
		
	}
}
