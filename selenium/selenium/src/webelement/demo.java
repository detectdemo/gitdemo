package webelement;

public class demo 
{

	public static void main(String[] args) {
		
		int num1=50;
		int num2=addition(10,20);  //30
		 //mul(num1,num2);   //1500
	
		int num3=mul(num1, num2);
		System.out.println(num3);
		
		String str1 ="velocity";
		
		String str2 =convertstringToUppercase(str1);
		System.out.println(str2);
		
		
				
	}		
				public static String convertstringToUppercase(String s1)
				{
			       String s2= s1.toUpperCase();
			       return s2;
			       
				}
				
				
	
	
	public static int mul(int c, int d)
	{
		int multipal=c*d;
		return multipal;
	}
		
		//method with int return type 
		public static int addition (int a, int b)
		{
			int sum =a+b;
		     return sum;
			
		}
	
}
