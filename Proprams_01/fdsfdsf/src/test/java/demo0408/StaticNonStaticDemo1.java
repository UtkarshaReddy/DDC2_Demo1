package demo0408;

public class StaticNonStaticDemo1 {
 
	 String Training ="Selenium3.0";
	 static int i = 101;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStaticDemo1 obj1 = new StaticNonStaticDemo1();	
		
		obj1.sum();
	mul(435,10);
		System.out.println(i);
		System.out.println(obj1.Training);
	}
	public void sum()
	{
		
		int a=10;
		int b=20;
		int sum = a+b;
		System.out.println(sum);
	}
	public static void mul(int a, int b)
	{
//		int a=10;
//		int b=20;
		int mul = a*b;
		System.out.println(mul);
	}
		
	
}
