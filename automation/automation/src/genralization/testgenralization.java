package genralization;

public class testgenralization {
	
	public static void main(String[] args) {
		
		System.out.println("-----propertis of airtel class---");
		airtel a=new airtel();
		
		a.sms();
		a.audiocalling();
		a.internet();
		a.newfeatureB();
		
		System.out.println("----propertis of jio class---");
		
		jio j = new jio();
		j.sms();
		j.audiocalling();
		j.internet();
		j.newfeatureA();
		
		System.out.println("----propertis of vI class---");
		
		vI v=new vI();
		v.sms();
		v.audiocalling();
		v.internet();
		v.newfeatureC();
		

	
	}

}
