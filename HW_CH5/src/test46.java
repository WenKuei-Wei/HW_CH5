public class test46 
{
	public static void main(String[] args)
	{
		Car46 car1=new Car46("1����");
		car1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class Car46 extends Thread
{
	private String name;
	public Car46(String nm) 
	{
		name=nm;
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				sleep(500);
				System.out.println("���b�i��"+name+"���B�̤u�@");
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}