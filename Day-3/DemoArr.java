//2) create a class "DemoArr",with the function "disp". 
//create 4 objects of this class in an array.
//Traverse the array and invoke "disp" on each objects.

public class DemoArr {
	
	static int cnt;
	
	public void disp()
	{
		System.out.println("Disp for object "+(++cnt));
	}

	public static void main(String[] args) 
	{
		DemoArr a1[] = new DemoArr[4];
		
		for(int i=0;i<a1.length;i++)
		{
		a1[i]=new DemoArr();
		a1[i].disp();
		}

	}

}
