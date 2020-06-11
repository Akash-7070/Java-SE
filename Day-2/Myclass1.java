
public class Myclass1 
{
	int a;
	int b;
	static int cnt;
	
	public Myclass1()
	{
		this.a=0;
		this.b=0;
		cnt++;
		System.out.println("Inside No Argu const");
	}
	
	public Myclass1(int a)
	{
		this.a=a;
		cnt++;
		System.out.println("Inside One para constr");
	}
	public Myclass1(int a,int b)
	{
		this.a=a;
		this.b=b;
		cnt++;
		System.out.println("Inside Two para constr");
	}

	public static void main(String[] args) 
	{
		Myclass1 m1=new Myclass1();
		Myclass1 m2=new Myclass1(100);
		Myclass1 m3=new Myclass1(100,200);
		System.out.println("Number of Constructor "+cnt);
	}

}
