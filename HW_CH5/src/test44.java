public class test44 
{
	public static void main(String[] args)
	{
		Car44 car1=new Car44("1����");
		car1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class Car44 extends Thread
{
	private String name;
	public Car44(String nm) 
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
