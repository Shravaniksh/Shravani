
public class LowPriority {
	public static void main(String[] args)
	{
		OneThread t3=new OneThread(3);
		OneThread t4=new OneThread(4);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.NORM_PRIORITY);
	}
}
class OneThread extends Thread
{
	int id;
	OneThread(int id)
	{
		this.id=id;
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("My id is:"+id);
	}
}
