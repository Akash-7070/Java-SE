
public class DemoOb {
	
	int a=10;
	public void disp()
	{
		System.out.println(this.a);
	}

	public static void main(String[] args) 
	{
		DemoOb m1=new DemoOb();
		DemoOb m2=m1;
		
		m1.disp();//10
		m2.disp();//10
		
	    m2=new DemoOb();
		m2.a=20;
		
		m1.disp();//10
		m2.disp();//20

	}

}
