public class test30 
{
	public static void main(String[] args)
	{
		Car30 car1;
		car1=new Car30();
		
		try {
			car1.setCar(1234, -10.0);
		}
		catch(CarException e) {
			System.out.println("©ß¥X"+e+"¤F");
		}
		
		car1.show();
	}

}
