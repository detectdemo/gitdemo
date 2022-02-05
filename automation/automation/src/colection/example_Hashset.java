package colection;

import java.util.HashSet;
import java.util.Iterator;

public class example_Hashset 
{

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		
		h.add("Rahul");
		h.add(100);
		h.add('A');
		h.add(null);
		h.add(100);
		h.add(null);
		
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.contains(100));
		
		h.remove(100);
		
		System.out.println(h);
		
		
		System.out.println("----print info using iterstor cursor-----");
		
		Iterator itr=h.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----print info using for loop each-----");

		for(Object s1:h)
		{
			System.out.println(s1);
		}
		
	}
}
