
public class test50 
{
	public static void main(String[] args)
	{
		Car50 car1=new Car50("�@����");
		
		Thread th1=new Thread(car1);
		th1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("���b�i��main()���B�z�u�@");
		}
	}
}

class Car50 implements Runnable
{
	private String name;
	
	public Car50(String nm)
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
