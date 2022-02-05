package Arrays;

public class chararray {
	
	public static void main(String[] args) {
		
		
char [] ar=new char [5];

ar[0]='A';
ar[1]='B';
ar[2]='E';
ar[3]='D';
ar[4]='C';

	
	System.out.println(ar.length);
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[3]);
	System.out.println(ar[4]);
	System.out.println(ar[4]);
	
	
	System.out.println("-----print array info-----");
	
	for (int i=0;i<=4;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("--print reverse order--");
	for(int i=4;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	for (int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	
	
	}

}
