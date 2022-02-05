package ExceptionHandling;

public class sample3 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=20;
		
		try
		{
			c=a/b;   //10/0--> event
		}
		catch(Exception e)
		{
			System.out.println("generic exception handling");
			e.printStackTrace();
		}
		
		System.out.println("hi..");
		System.out.println(c);
		
		
	}

}
