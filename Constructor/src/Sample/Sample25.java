package Sample;

public class Sample25 
{
	///user defined constructor with parameter
	double num1;
	int num2;
				//user defined constructor with 2 int  parameter
				//use1:  initialize global variable using local variable
				//use2: copy all the members of class into object
	
	Sample25(double x,int y)
	{
		num1=x;   //assign local variable info into global variable
		num2=y;
		
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void sub()
	{
		System.out.println(num1-num2);
	}
	public void mul()
	{
		System.out.println(num1*num2);
	}
	public void div()
	{
		System.out.println(num1/num2);
	}
	public static void main(String[] args) 
	{
		Sample25 s25=new Sample25(12.5,25);
		System.out.println("....Same Class.......");
		s25.add();
		System.out.println(".....");
		s25.sub();
		System.out.println(".....");
		s25.mul();
		System.out.println(".....");
		s25.div();
		System.out.println("............");
		
		Sample25 s025=new Sample25(30,120);
		s025.add();
		System.out.println(".....");
		s025.sub();
		System.out.println(".....");
		s025.mul();
		System.out.println(".....");
		s025.div();
		
		System.out.println(".........Diff Class.........");
		Sample26 s26=new Sample26(25,300);
		s26.add();
		System.out.println(".....");
		s26.sub();
		System.out.println(".....");
		s26.mul();
		System.out.println(".....");
		s26.div();
		System.out.println(".....");
		
		Sample26 s026=new Sample26(60,480);
		s026.add();
		System.out.println(".....");
		s026.sub();
		System.out.println(".....");
		s026.mul();
		System.out.println(".....");
		s026.div();
		
	}
}
