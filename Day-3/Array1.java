//1) initialize a single dimension array and sort it in ascending order.
public class Array1 
{
	public static void main(String[] args) 
	{
		int i,j;
		int arr[]= {50,20,10,40,30};
		
		System.out.println("Before Sorting");
		for(i=0; i<5; i++)
		{
			System.out.println(arr[i]);
		}
		
		for(i=0; i<5; i++)
		{
			for(j=0; j<4; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("After Sorting");
		for(i=0; i<5; i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
