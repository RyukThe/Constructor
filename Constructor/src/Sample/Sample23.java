package Sample;

public class Sample23 
{
	int num1;
	int num2;
	
	Sample23(int m,int n)
	{
		num1=m;
		num2=n;
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
		Sample23 s23=new Sample23(55,50);
		s23.add();
		System.out.println(".....");
		s23.sub();
		System.out.println(".....");
		s23.mul();
		System.out.println(".....");
		s23.div();
		System.out.println(".....Diff Class Output......");
		Sample24 s24= new Sample24(12.5,37.5);
		s24.add();
		System.out.println(".....");
		s24.sub();
		System.out.println(".....");
		s24.mul();
		System.out.println(".....");
		s24.div();
	}
}
