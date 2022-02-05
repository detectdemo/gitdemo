package Arrays;

public class samplemultipal_insinfgalstep {
	
	public static void main(String[] args) {
		
          	//    o  1  2
			// 0   10 20 30
			//  1  40 50 60
			
		int[][] ar= {{10,20,30},{40,50,60}};
		
		
		
		
		System.out.println(ar.length);
		
		for(int i=0;i<=1;i++)
		{
		for(int j=0;j<=2;j++)
		{
			System.out.print (ar[i][j]+" ");
		}
		System.out.println();
		}
	}

}

