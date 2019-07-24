package pages;

public class Aadharnumber {
	int m;
	
	public Aadharnumber(int MobNo){
         this.m=MobNo;
		 String Name="Srinivas";
		  String DOB="date";
		  System.out.println(Name+" "+DOB+" "+m);
		  

		}
	public void pan() {
		System.out.println("pan number to be printed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aadharnumber aa=new Aadharnumber(78956454);
		aa.pan();
		
		
	} 
}
 
