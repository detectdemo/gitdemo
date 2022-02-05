package casting;

public class son extends father 
{
	

	public void mobile()
	{
		System.out.println("mobile : samsung");
	}

	public void car()
	{
		System.out.println("car: honda city");
	}

	public void home()
	{
		System.out.println("home : 4bhk");
	}

	public void money()
	{
		System.out.println("money : 1lakh");
	}
public static void main(String[] args) {
	son s1 = new son();
	s1.mobile();
	s1.home();
	s1.money();
	s1.car();
	
}

}
