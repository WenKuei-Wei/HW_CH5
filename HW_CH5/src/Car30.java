class CarException extends Exception
{
}

class Car30 
{
	private int num;
	private double gas;
	
	public Car30()
	{
		num=0;
		gas=0.0;
		System.out.println("�w�Ͳ��F�T��");
	}
	
	public void setCar(int n,double g) throws CarException
	{
		if (g<0)
		{
			CarException e= new CarException();
			throw e;
		}else
		{
			num=n;
			gas=g;
			System.out.println("�N�����]��"+num+"�N�T�o�]��"+gas);
		}
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�o�q�O"+gas);
	}
}
