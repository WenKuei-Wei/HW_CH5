public class test45 
{
	public static void main(String[] args)
	{
		Car45 car1=new Car45("1����");
		car1.start();
		
		Car45 car2=new Car45("2����");
		car2.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class Car45 extends Thread
{
	private String name;
	public Car45(String nm) 
	{
		name=nm;
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��"+name+"���B�̤u�@");
		}
	}
}
