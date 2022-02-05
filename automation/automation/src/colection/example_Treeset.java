package colection;

import java.util.Iterator;
import java.util.TreeSet;

public class example_Treeset 
{

	public static void main(String[] args) {
		
		
		TreeSet ts=new TreeSet();
		
				ts.add(200);
				ts.add(400);
				ts.add(100);
				ts.add(300);
				ts.add(200);
				//ts.add(null);
				
				
				System.out.println(ts);
				System.out.println(ts.isEmpty());
		        System.out.println(ts.contains(200));
		
		        System.out.println(ts.size());


		        ts.remove(300);
		        System.out.println(ts);
		        
		     //   ts.pollFirst();
		     //   System.out.println(ts);
		        
		     //   ts.pollLast();
		    //    System.out.println(ts);
		        
		        System.out.println(ts.first()); //100
		        System.out.println(ts.last());  //400
		        	
		        
		        
		        System.out.println("----print info using iterator----");
		        
		        Iterator itr=ts.iterator();
		        
		        while(itr.hasNext())
		        {
		        	System.out.println(itr.next());
		        }
		
		
		
		        System.out.println("----print info using for each----");
		        
		        for(Object s1:ts)
		        {
		        	System.out.println(s1);
		        }
		
		
		
		
		
		
		
		
		
		
	}
}
