package Arrays;

public class exampleStringArray {
	public static void main(String[] args) {
		
		
		//step 1:Array declaration
	
	String [] ar1=new String[4];
	
	
	//step2:Array initilazation
	ar1[0]="ganesh";
	ar1[1]="suresh";
//	ar1[2]="Ramesh";  null
	ar1[3]="mahesh";
	
	
	
	//step3: Array usages
	System.out.println(ar1.length);//4
	System.out.println(ar1[0]);//ganesh

	//step3: Array usages


	System.out.println("--print array info--");
	
	
	
	for(int  i=0; i<=3; i++)
	{
		System.out.println(ar1[i]);
	}
	
	
	//step3: Array usages
	for(int i=0;i<=ar1.length-1;i++)
		System.out.println(ar1[i]);
	
	
	}
	

}
