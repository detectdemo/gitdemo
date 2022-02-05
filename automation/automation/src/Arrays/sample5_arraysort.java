package Arrays;

import java.util.Arrays;

public class sample5_arraysort {
public static void main(String[] args) {
	
	
	
	//array declaration 
	int [] ar =new int[5];
	
	
	//array initilaztion
	ar[0]=100;
	ar[1]=300;                       //in int : 1 index is not present sort work
	ar[2]=200;                       //in String : 1 index is not present than sort not work
	ar[3]=500;
	ar[4]=400;
	
	System.out.println("----print array orignal data----");
	
for(int i=0;i<=ar.length-1;i++)
{
	System.out.println(ar[i]);
}

Arrays.sort(ar);
System.out.println("---print array info in ascending order----");
for (int i=0; i<=ar.length-1; i++)
{
	System.out.println(ar[i]);
}
	
	System.out.println("---print array info desending order----");
	
	for (int i=ar.length-1; i>=0;i--)
	{
		System.out.println(ar[i]);
	}
}
}
