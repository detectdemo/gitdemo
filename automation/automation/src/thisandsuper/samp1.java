package thisandsuper;

public class samp1 {
	
int a=10;     // global veriable
	
	
	
	public void m1()
	{
		int a=20;//local veriable
		
		System.out.println(a);   //20  //local veriable call from same class
		System.out.println(this.a); // global veriable call from same class
	}
	
	public static void main(String[] args) {
		
		samp1 s1=new samp1();
		
	   s1.m1();
	   
		
		
		
	}

}
