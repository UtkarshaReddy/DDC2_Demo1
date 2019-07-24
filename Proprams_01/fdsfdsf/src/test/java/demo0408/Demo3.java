package demo0408;

public class Demo3 {

	
	String S= "srinivas";
	static int empid = 11480392;
	public static void main(String[] args) {
		Demo3 obj1 = new Demo3();
		System.out.println(obj1.S);  // calling non static variable
		System.out.println(empid); // 1. calling static variable 
		System.out.println(Demo3.empid); // 2. calling static variable
		
		addition();  // calling static method
		
		Demo3 obj2 = new Demo3();  // calling non static method
		obj2.multiplication();
	}
		public static void addition()
		{
			int a=10;
			int b=20;
			int sum;
			sum=a+b;
			System.out.println(sum);
		}
		public void multiplication()
		{
			int a=10;
			int b=20;
			int prod;
			prod=a*b;
			System.out.println(prod);
			
		}
	}


