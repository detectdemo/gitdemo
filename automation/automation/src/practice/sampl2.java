package practice;
//concrete class
//compete class

public class sampl2   extends sample1
{

	
	public  void m2()
	{
		System.out.println("m2");
	}
	
	public void m3()
	{
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		
		sampl2 s1 =new sampl2();
		s1.m1();
		s1.m2();
		s1.m3();
	}
	
	
}
