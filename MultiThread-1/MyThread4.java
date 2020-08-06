
public class MyThread4 implements Runnable
{
	
	synchronized static void call()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Hello "+i);
		}
		System.out.println("\n");
	}
	
	public void run()
	{
		call();
	}

	public static void main(String[] args) 
	{
		MyThread4 m1= new MyThread4();
		MyThread4 m2= new MyThread4();
		
		Thread t1= new Thread(m1);
		Thread t2= new Thread(m2);
		
		t1.start();
		t2.start();
	}

}
