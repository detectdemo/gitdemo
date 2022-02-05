package Arrays;

public class largestnum 
{

		
		public static void main(String[] args) {
			int a[]= {33,67,21,98,67,65};
			int max=a[0];
			//int s=4;
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]>max) {
				max=a[i];
				}
			}
			System.out.println(max);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

