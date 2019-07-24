package demo0408;

public class MethodOverLoadingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum(45,95);

	}
	
	public static void sum()
	{
		int a=10;
		int b= 20;
		int sum= a+b;
		System.out.println(sum);
	}
	public static void sum(int a,int b)
	{
		
		int sum= a+b;
		System.out.println(sum);
	}

}
