package Sample;

public class Sample13 
{
	int b;
	int c;
 
	Sample13()
	{
		b=32;
		c=87;
	}
	public void addition()
	{
	 System.out.println(b+c);
	}
	public void substraction()
	{
	 System.out.println(b-c);	
	}
	
	public static void main(String[] args)
	{
		Sample13 s13=new Sample13();
		s13.addition();
		s13.substraction();
		System.out.println(".....difff class output.......");
		Sample14 s14= new Sample14();
		s14.mul();
		s14.div();
	}
}
