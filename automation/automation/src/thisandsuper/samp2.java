package thisandsuper;

public class samp2 {
	
	
	
	int b=30;       // global veriable
	
	public void m2()
	{
		int b=20;      // local veriable
		
		System.out.println(b);  //local veriable call from same class
		System.out.println(this.b);  //global veriable call from same class
		
	}

}
