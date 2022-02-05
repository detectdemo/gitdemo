package Arrays;

public class example1_intArray {
	public static void main(String[] args) {
		//step 1:Array declaration
		int [] ar=new int[5];
		
		//step2:Array initilazation
		
		ar[0]=100;
		ar[1]=200;
        ar[2]=300;     // zero
		ar[3]=400;
		ar[4]=500;
		
		
		//step3: Array usages
	//System.out.println(ar[0]);//100
//System.out.println(ar[1]);//200
//System.out.println(ar[2]);//300
//System.out.println(ar[3]);//400
//System.out.println(ar[4]);//500
 //    System.out.println(ar[5]);  //ArrayIndexOutOfBoundsException

	
			System.out.println("----print int array info--");
				
		//for(int i=0;i<=4; i++)
	//	{                       //0,1,2,3,4
	//		System.out.println(ar[i]);//100,200,300,400,500
	//	}
				
//		for(int i=0;i<=4; i++)
	//	{                       //0,1,2,3,4
	//		System.out.println(ar[i]);//100,200,300,400,500
	//	}
			
			for(int i=0;i<=ar.length-1;i++)
			{
				System.out.println(ar[i]);
			}
				
				
				
		
		
	}
	
	

}
