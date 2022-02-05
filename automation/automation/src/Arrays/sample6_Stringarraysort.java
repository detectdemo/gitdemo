package Arrays;

import java.util.Arrays;

public class sample6_Stringarraysort {

	
	
	
	public static void main(String[] args) {
		
		String[] ar=new String[4];
		ar[0]="ganesh";
		ar[1]="suresh";
		ar[2]="Ramesh";  
		ar[3]="mahesh";
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	System.out.println("-----print array info ascending order---");
	
	Arrays.sort(ar);
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("--decending order--");
	
	for (int i=ar.length-1;i>=0;i--)
	{
	System.out.println(ar[i]);
	}
	
	
	
	
	}
}
