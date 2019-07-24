package demo0408;

public class MethodOvr2 extends MethodOv11 {
	public static void sum(int i)
	{
		System.out.println("formula 2 for sum");
		System.out.println(i);
	}
	
	public static void EMI()
	{
		System.out.println("formula for EMI");
	}
public static void main(String[] args) {
	sum();
	EMI();
	sum(10);
}
}
