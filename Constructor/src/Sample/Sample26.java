package Sample;

public class Sample26 
{
	//user defined with int,int(2 int) parameter constructor
	
	int num3;     //x 
	int num4;    //y
	
	Sample26(int x, int y)
	{
	   num3=x;    //x=25    60
	   num4=y;    //y=300   480
	}
	public void add()
	{
		System.out.println(num3+num4);
	}
	public void sub()
	{
		System.out.println(num3-num4);
	}
	public void mul()
	{
		System.out.println(num3*num4);
	}
	public void div()
	{
		System.out.println(num3/num4);
	}
}

