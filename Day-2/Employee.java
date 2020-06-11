class AK{
	private static int cnt=10;
	
	static int getNum() {
		return cnt;
	}
}
public class Employee {

	public static void main(String[] args) 
	{
		System.out.println(AK.getNum());
	}

}
