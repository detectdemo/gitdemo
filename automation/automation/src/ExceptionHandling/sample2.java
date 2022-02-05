package ExceptionHandling;

public class sample2 {
public static void main(String[] args) {
	
	int [] ar =new int [5];
	try 
	{
	ar[6]=10;
	}
	
	catch(ArrayIndexOutOfBoundsException a)
	
	{
		System.out.println("ArrayIndexOutOfBoundsException Handling");
	}
	   System.out.println("hi..");
}
}
