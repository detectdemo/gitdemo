package practice;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
		
		
		
		int [] ar= {100,200,300,400,500};
		
		ar[0]=100;
		ar[1]=200;

		ar[2]=500;

		ar[3]=400;
		ar[4]=300;
		
		System.out.println(ar.length);

        System.out.println(ar[0]);
        
        Arrays.sort(ar);
        for(int i=0;i<=ar.length-1;i++)
        {
        	System.out.println(ar[i]);
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
