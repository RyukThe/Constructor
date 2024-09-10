package TypesofConstructor;

public class Sample8 
{
	int num1;
	int num2;
	String name;
	
	//user defined without parameter constructor
	Sample8()
	{
		num1=65;
		num2=76;
	}
	//user defined with 2 int parameter constructor
	Sample8(int x,int y)
	{
		num1=x;
		num2=y;
	}
	//user defined constructor with String parameter
	Sample8(String s2)
	{
		name=s2;
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
	public void Studentname()
	{
		System.out.println(name);
	}
	
}
