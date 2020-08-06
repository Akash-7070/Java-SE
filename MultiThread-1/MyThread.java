
public class MyThread extends Thread
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
		MyThread t1= new MyThread();
		MyThread t2= new MyThread();
		t1.start();
		t2.start();
	}

}
