package constructor;

public class parameter {
	
	// step1 veriable declaration
	int num1;
	int num2;
	
	//step2 veriable initilaztion
	
	//user defined with 2int parameter constructor
	
	//user1 to initilaze global veriable
	parameter(int a,int b)
	{
		num1 =a;
		num2 =b;        ///assign local veriablee info to global
		
	}
	public void addition()
	{
		int sum=num1+num2;
		System.out.println(sum);
	}
	

}
