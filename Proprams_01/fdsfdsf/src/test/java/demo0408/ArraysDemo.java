package demo0408;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	
//	int i[]= new int[10];
//		i[9]=99;
//	i[0]=156;
//	i[8]="srinivas";
//		System.out.println(i.length);
//		String s[]= new String[10];
//		s[9]="srini";
//		s[0]="LKM";
//		System.out.println(s.length);
//		
//		char c[]= new char[10];
//		c[9]=srini;
//		c[0]=LKM;
//		System.out.println(c.length);
//		double d[]= new double[10];
//		d[9]=10.235;
//		c[0]=546.56;
//		System.out.println(d.length);
		
		Object obj[][] = new Object[3][4];
		System.out.println(obj.length);
		System.out.println(obj[1].length);
		obj[1][1] = "Srinivas";
		obj[1][0] = 11480932;
		obj[1][2] = true;
		obj[3][0] = 1.4;
		obj[3][1] = "test";
		obj[4][1] = "test";
	}
}
