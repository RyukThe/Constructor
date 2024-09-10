package Sample;

public class Sample15 
{
	
	int m;
	int n;
	
	Sample15()
	{
		m=88;
		n=90;
	}
	public void addition()
	{
		System.out.println(m+n);
	}
	public void substract()
	{
		System.out.println(m-n);
	}
	public static void main(String[] args) 
	{
		Sample15 s15=new Sample15();
		s15.addition();
		s15.substract();
		System.out.println("........diff class output.........");
		Sample16 s16=new Sample16();
		s16.mul();
		s16.div();
	}
}
