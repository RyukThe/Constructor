package TypesofConstructor;

public class Sample7
{
	//example4: user defined with parameter multiple constructor -->Constructor overloading
	int num1;
	int num2;
	String name;
	
	Sample7()
	{
		//user defined without parameter constructor
		num1=9;
		num2=18;
	}
	Sample7(int a,int b)
	{
		//user defined with 2 int parameter constructor
		num1=a;
		num2=b;
	}
	Sample7(String s1)
	{
		//user defined constructor with String parameter
		name=s1;
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void sub()
	{
		System.out.println(num1-num2);
	}
	public void Studentname()
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		Sample7 s7=new Sample7();
		s7.add();
		s7.sub();
		
		Sample7 s07=new Sample7(78,87);
		s07.add();
		s07.sub();
		
		Sample7 s007=new Sample7("Rushikesh");
		s007.Studentname();	
		
		System.out.println("......Diff Class Output......");
		
		Sample8 s8=new Sample8();
		s8.add();
		s8.sub();
		s8.mul();
		s8.div();
		
		Sample8 s08=new Sample8(56,87);
		s08.add();
		s08.sub();
		s08.mul();
		s08.div();
		
		Sample8 s008=new Sample8("Munde");
		s008.Studentname();
	}
}