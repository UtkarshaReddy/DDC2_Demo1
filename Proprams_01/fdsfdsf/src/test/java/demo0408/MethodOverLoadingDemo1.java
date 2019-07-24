package demo0408;

public class MethodOverLoadingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingDemo1 obj1 = new MethodOverLoadingDemo1();
		obj1.sum();
		obj1.sum(10);
		obj1.sum(10,415);
	}
	// main method overloading can be done but with different arguments
	public static void main(int[] args) {
		// TODO Auto-generated method stub
		MethodOverLoadingDemo1 obj1 = new MethodOverLoadingDemo1();
		obj1.sum();
		obj1.sum(10);
		obj1.sum(10,415);
	}
	
	public void sum()
	{
		System.out.println("sum no parameters");
	}
	public void sum(int i)
	{
		System.out.println("sum one parameters");
		System.out.println(i);
	}
	public void sum(int i, int j)
	{
		System.out.println("sum two parameters");
		System.out.println(i);
		System.out.println(j);
	}
	
	
}
// Note: method name being the same with input parameters or arguments within the same class
// we can't create a method inside a method
// duplicate methods with same no.of arguments is not accepted