package Arrays;

import java.util.Arrays;

public class sample_intarray_declaration_initilazation_in_singalstep {

public static void main(String[] args) {
	
	
	
	
	int [] ar= {300,200,100,500,400};
	
	System.out.println(ar.length);
	
	
	for(int i=0; i<=4; i++)
	{
		System.out.println(ar[i]);
	}
	
	for(int i=ar.length-1; i>=0; i--)
	{
		System.out.println(ar[i]);
	}
	
       System.out.println("---SORT--");
	Arrays.sort(ar);
	for(int i=0; i<=4;i++)
	{
		System.out.println(ar[i]);
	}
	
	
	
	
	
	
	
}
}
