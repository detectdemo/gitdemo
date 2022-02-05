package colection;

import java.util.ArrayList;

public class example_generic 
{

	public static void main(String[] args) {
		
		
		ArrayList<String> a1=new ArrayList<String>();
		
		//a1.add(100);
	//	a1.add(200);
	//	a1.add(300);
		
		a1.add("rahul");
		a1.add("sample");
		
		System.out.println(a1);
		
		System.out.println("---print info usinf for each loop---");
		
		for(String s1:a1)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		
		
		
	}
}
