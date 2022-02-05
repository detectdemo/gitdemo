package thisandsuper;

public class demo1    extends demo2 
{

	        //int b=30;     //global veriable from super class
          int b=40;      // global veriable
         public  void m1()
         {
        	 int b=20;    // local veriable
        	 System.out.println(b);       //local veriable call from same class
        	 System.out.println(this.b);   //global veriable call from same class
        	 System.out.println(super.b);   //30 global veriabe call from super class
         }
         
         public static void main(String[] args) {
			 
        	 
        	 
        	 
        	 demo1 d1=new demo1();
        	 d1.m1();
        	 
        	 
        	
		}

}
   