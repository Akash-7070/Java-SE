
public class MyThread3 implements Runnable
{
	synchronized public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello "+i);
		}
		System.out.println("\n");
	}

	public static void main(String[] args) 
	{
		MyThread3 m1= new MyThread3();
		
		Thread t1= new Thread(m1);
		Thread t2= new Thread(m1);
		Thread t3= new Thread(m1);
		
		t1.start();
		t2.start();
		t3.start();	
	}

}
