public class test55
{
	public static void main(String[] args)
	{
		Company55 cmp=new Company55();
		
		Driver55 drv1=new Driver55(cmp);
		drv1.start();
		
		Driver55 drv2=new Driver55(cmp);
		drv2.start();
	}

}

class Company55
{
	private int sum=0;
	public synchronized void add(int a)
	{
		int tmp=sum;
		System.out.println("�ثe���X�p���B�O"+tmp+"��");
		System.out.println("�Ȩ�"+a+"���F");
		tmp=tmp+a;
		System.out.println("�X�p���B�O"+tmp+"��");
		sum=tmp;
	}
}
class Driver55 extends Thread
{
	private Company55 comp;
	public Driver55(Company55 c)
	{
		comp=c;
	}
	
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			comp.add(50);
		}
	}
}
