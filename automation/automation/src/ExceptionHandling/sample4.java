package ExceptionHandling;

public class sample4 {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int c=0;
		
		
		
		try
		{
			c=a/b;  //10/0--> event
		}
//catch(ArithmeticException e)
//{
//	System.out.println("ArithmeticException Handling");
//}
		catch(NullPointerException n)
		{
			System.out.println("NullPointerException Handling");
		}
		catch(ArrayIndexOutOfBoundsException w)
		{
			System.out.println( "ArrayIndexOutOfBoundsException Handling");
		}
		catch(Exception e)
		{
			System.out.println("Genric Exception hANDLIN");
		}
		System.out.println("hi..");
		
		
		
	}
}
