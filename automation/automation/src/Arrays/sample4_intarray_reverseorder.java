package Arrays;

public class sample4_intarray_reverseorder {
	public static void main(String[] args) {
		//array declaration 
		int [] ar =new int[5];
		
		
		//array initilaztion
		ar[0]=100;
		ar[1]=300;
		ar[2]=200;
		ar[3]=500;
		ar[4]=400;
		
		//usags
		
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	
	System.out.println("reverse order");

	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	
	
	}
}
