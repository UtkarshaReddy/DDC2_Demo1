package demo0408;

public class StaticNonStaticDemo2 {

	
	String Name = "srinivas";   // Global varaible  - accssible across all the function/methods in the class
	static int EmpId = 11480932;  // local  -- specific to the method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStaticDemo2 obj1 = new StaticNonStaticDemo2();
		
			sum();  // without creating object
//			obj1.sum();   // with creating on object
			obj1.prod();
			System.out.println(EmpId);
			System.out.println(obj1.Name);
//			StaticNonStaticDemo2.
	}
	
	public static void sum()
	{
		System.out.println("formula for addition");
//		int a= 30;
//		int b =40;
	}
	
	public void prod()
	{
		System.out.println("formula for multiplication");
//		int c= 30;
//		int d =40;
	}
	
}
