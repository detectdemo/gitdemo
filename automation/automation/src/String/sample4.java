package String;

public class sample4 {
	public static void main(String[] args) {
		
		String s1="velocity ";
		String s2="VELOCITY";
		String s3="velocity";
		String s4="city";
	    String s5="ty";
	    String s6="vy";
	    String s7="CITY";
	    String s8="abcabbac";
	    String s9="ok google ok";
	    
	    		
	    
		
		
		
		
		
		
		
		
		
		System.out.println(s1.length());  //8
		System.out.println(s1.isEmpty()); //false
		System.out.println(s1.toUpperCase()); //VELOCITY
		System.out.println(s2.toLowerCase()); //velocity
		
		
		
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s1.contains(s4)); //true
		System.out.println(s4.contains(s1)); //false
	    System.out.println(s1.contains(s5)); //true
	    System.out.println(s1.contains(s6)); //false
	    System.out.println(s1.contains(s7)); //false
	    
	    
	    
	    System.out.println(s1.charAt(5)); //i
	    
	    System.out.println(s1.startsWith("vt"));  //false
	    System.out.println(s1.startsWith("vel")); //true
	    System.out.println(s1.endsWith("ty")); //true
	    System.out.println(s1.endsWith("cty")); //false
		
	    System.out.println(s1.indexOf('c')); //4
	    System.out.println(s2.indexOf('y')); //-1
	    System.out.println(s2.indexOf('Y')); //7
	    System.out.println(s8.indexOf('a')); //0
	    System.out.println(s8.indexOf('b')); //1
	 System.out.println(s8.lastIndexOf('b')); //5  
	 System.out.println(s8.lastIndexOf('d')); //-1
	         
	 System.out.println(s1.substring(4)); //city
	 System.out.println(s1.substring(5)); //ity
	 System.out.println(s1.substring(4,6)); //ci
	 
	 System.out.println(s1+s2); //velocityVELOCITY
	 System.out.println(s1.concat(s2)); //velocity VELOCITY

	 System.out.println(s9.replace("ok","good")); //good google good


	 
	}
	}


