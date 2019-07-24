package demo0408;

public class ClassObject_Demos {
String name = "srini";
static String namez= "godari";
	public static void main(String[] args) {
		// calling static method
		total(); // 1st way direct call
		ClassObject_Demos.total(); //2nd by using  class name
		ClassObject_Demos x= new ClassObject_Demos();
		System.out.println(x.name);	
		System.out.println(namez);

		
	}
	public static  void total()
	{
int a =10;
int b=30;
int sum;
sum = a+b;
int x=99;
System.out.println("the total1 is :"+sum);
}
	public   void total2()
	{
int a =10;
int b=40;
int sum;
sum = a+b;
System.out.println("the total2 is :"+sum);
}
}
