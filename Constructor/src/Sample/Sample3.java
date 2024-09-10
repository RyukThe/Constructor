package Sample;

public class Sample3 
{
	//example 1: default constructor
	
	//default constructor--> provided by compiler
	//use: copy all the members of class into object
//	Sample1()
//	{
//		
//	}
	

	public void m1()
	{
		System.out.println("Run M1");
	}
	public void m2()
	{
		System.out.println("Run M2");
	}
	public static void main(String[] args) 
	{
		Sample3 s3=new Sample3();
		s3.m1();
		s3.m2();
		//1: Sample1--> classname --> datatype
		//2: s1  --> objectName  --> to identify/refer object
		//3: new  --> keyword --> to create blank/empty object
		//4: Sample1()  --> classname()  --> constructor call -->  copy all the members of class into object
	
		
		System.out.println("....................");
		
		Sample4 s4=new Sample4();
		s4.m3();
	}
	
	
}
