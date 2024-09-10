package Sample;

public class Sample5 
{

	public void m1()
	{
		System.out.println("same class m1");
	}
	public void m2()
	{
		System.out.println("same class m2");
	}
	public static void main(String[] args)
	
	{
		Sample5 s5=new Sample5();
		s5.m1();
		s5.m2();
		
		System.out.println(".....................");
		Sample6 s6=new Sample6();
		s6.m3();
	}
}
