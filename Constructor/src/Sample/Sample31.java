package Sample;

public class Sample31 
{
	 String Name;
	 int num1;
	 int num2;
	 double num3;
	 
	 Sample31()
	 {
		 num1=67;
		 num2=56;
		 num3=34.34;
	 }
	 Sample31(int m,int n,int o)
	 {
		 num1=m;
		 num2=n;
		 num3=o;
	 }
	 Sample31(String s1)
	 {
		 Name=s1;
	 }
	 public void add()
	 {
		 System.out.println(num1+num2+num3);
	 }
	 public void sub()
	 {
		 System.out.println(num1-num2-num3);
	 }
	 public void mul()
	 {
		 System.out.println(num1*num2*num3);
	 }
	 public void div()
	 {
		 System.out.println(num1/num2/num3);
	 }
	 public void empname()
	 {
		 System.out.println(Name);
	 }
	 
	 public static void main(String[] args) 
	 {
		Sample31 s31=new Sample31();
		s31.add();
		s31.sub();
		s31.mul();
		s31.div();
		Sample31 s031=new Sample31("Rushi");
		s031.empname();
		System.out.println("..............");
		Sample31 s0031=new Sample31(12,24,365);
		s0031.add();
		s0031.sub();
		s0031.mul();
		s0031.div();
		Sample31 s00031=new Sample31("Rushikesh");
		s00031.empname();
		
	}
}
