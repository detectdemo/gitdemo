package practice;

public class arrays2_m {

	public static void main(String[] args) {
		//10 20 30
		//30 40 50
		//60 70 80
		
		int[][] ar= {{10,20,30},{30,40,50},{60,70,80}};
		

	        	ar[0][0]=10;
				ar[0][1]=20;
			    ar[0][2]=30;
				ar[1][0]=30;
				ar[1][1]=40;
		    	ar[1][2]=50;
		    	ar[2][0]=60;
		        ar[2][1]=70;
		       	ar[2][2]=80;
		       	
		       	
		       	
		       	for(int i=0;i<=2;i++)
		       	{
		       		for(int j=0;j<=2;j++)
		       		{
		       			System.out.print(ar[i][j]+"    ");
		       			
		       		}
		       		System.out.println();
		       	}
		       	
		       	
		       	
		       	
	}
}
