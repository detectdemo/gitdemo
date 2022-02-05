package ExceptionHandling;

public class sample1 {

	
	public static void main(String[] args) {
		
		
		int a=10;
		int b=0;
		int c;
		try
		{
		 c=a/b;           //10/0 -->RISKY CODE -->EVENT OR EXCEPTION
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Handling ");
		
			c=2;
		}
		System.out.println(c);
		System.out.println("hi..");
		
		
		
		
	}
}
