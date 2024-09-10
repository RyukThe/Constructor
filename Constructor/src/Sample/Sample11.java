package Sample;

public class Sample11 
{
		int a;
		int b;
		
		Sample11()
		{
		 a=87;
		 b=67;
		}
		
	public void addition()
	{
		System.out.println(a+b);
	}
	public void substract()
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		Sample11 s11=new Sample11();
		s11.addition();
		s11.substract();
		System.out.println(".....Diff class Output........");
		Sample12 s12=new Sample12();
		s12.multi();
		s12.division();
	}
}
	

