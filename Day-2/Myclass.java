class Shape
{
	private int width;
	private int height;
	
	public void setNum(int a,int b) 
	{
		this.width=a;
		this.height=b;
	}
	public int getNum1()
	{
		return this.width;
	}
	public int getNum2()
	{
		return this.height;
	}	
}

public class Myclass {

	public static void main(String[] args) 
	{
		Shape b=new Shape(); 
		b.setNum(100,200);
		System.out.println(b.getNum1());
		System.out.println(b.getNum2());			
	}

}
