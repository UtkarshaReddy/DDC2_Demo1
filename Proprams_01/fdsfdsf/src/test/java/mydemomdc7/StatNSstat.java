package mydemomdc7;

public class StatNSstat {
int m =99;
static int n=9874;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum2();
//		sum();
		StatNSstat x= new StatNSstat();
		x.sum();
		System.out.println(n);
		System.out.println(x.m);

	}
	
	public void sum()
	{
		int a=10;
		int b=50;
		int total;
		total= a+b;
		System.out.println(total);
	}
	
	public static void sum2()
	{
		int a=200;
		int b=300;
		int total;
		total= a+b;
		System.out.println(total);
	}

}
