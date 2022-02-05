package constructor;

public class usersamp2 {
	
	
	//step1: varible declaration
	int a;
	int b;
     //user defined constructor---->provide by user
	//use1 to copy all the members of clas into object---->after object creation
	 //step2 to initializglobal veriable or object
	usersamp2()
	{
		a=10;
		b=20;
	}
    //step3 usages
	
	public void addition()
	{
		int c=a+b;
			
		System.out.println(c);
	}
	
	  //step3 uges
	public void mul()
	{
		int d=a*b;
		System.out.println(d);
	}
	
}
