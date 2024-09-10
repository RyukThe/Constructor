package Sample;

public class Sample30 
{
	int num1;
	int num2;
	double num3;
	String name;
	
	Sample30()
	{
		num1=32;
		num2=65;
		num3=12.3;
	}
	Sample30(int x,int y, double z)
	{
		num1=x;
		num2=y;
		num3=z;
	}
	Sample30(String s4)
	{
		name=s4;
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
	public void studentname()
	{
		System.out.println(name);
	}
}
