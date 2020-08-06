
public class MyThread1 implements Runnable
{
	public void run()
	{
		for(char ch='A'; ch<='J'; ch++)
		{
			System.out.print(ch+"\t");
		}
	}
	
	public static void main(String[] args) 
	{
		MyThread1 t1= new MyThread1();
		MyThread1 t2= new MyThread1();
		
		Thread th1= new Thread(t1);
		Thread th2= new Thread(t2);
		th1.start();
		th2.start();
	}

}
