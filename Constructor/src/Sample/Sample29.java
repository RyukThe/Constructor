package Sample;

public class Sample29 
{
	int num1;
	int num2;
	double num3;
	String name;
	
	Sample29()
	{
		num1=5;
		num2=65;
		num3=55.5;
	}
	Sample29(int a,int b,double c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	Sample29(String s3)
	{
		name=s3;
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
	public void StudentName()
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		Sample29 s29=new Sample29();
		s29.add();
		s29.sub();
		s29.mul();
		Sample29 s029=new Sample29("Rushi");
		s029.StudentName();
		System.out.println(".............");
		Sample29 s0029=new Sample29(12,34,87.8);
		s0029.add();
		s0029.sub();
		s0029.mul();
		Sample29 s00029=new Sample29("Rushikesh");
		s00029.StudentName();
		System.out.println(".......Diff Class Output........");
		Sample30 s30=new Sample30();
		s30.add();
		s30.sub();
		s30.mul();
		s30.div();
		Sample30 s030=new Sample30("Rushi Munde");
		s030.studentname();
		System.out.println("................");
		Sample30 s0030=new Sample30(23,46,45.5);
		s0030.add();
		s0030.sub();
		s0030.mul();
		s0030.div();
		Sample30 s00030=new Sample30("Rushikesh Pramod Munde");
		s00030.studentname();
		
	}
}
