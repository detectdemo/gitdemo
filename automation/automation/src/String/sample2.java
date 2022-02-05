package String;

public class sample2 {
public static void main(String[] args) {
	
	//without using new keyword
	String s1="xyz";
	String s2="xyz";
	String s3="xyz1";
	
	
	//using new keyword
	
	String s4=new String("xyz");
	String s5=new String("xyz");
	String s6=new String("xyz1");

	
	System.out.println(s1==s2);//true
    System.out.println(s1==s3);//false
	System.out.println(s1==s4);//false
	System.out.println(s4==s5);//false
	
}
}
