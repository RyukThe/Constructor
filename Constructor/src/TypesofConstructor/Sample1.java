package TypesofConstructor;

public class Sample1 
{ 
		
		//example 1: default constructor
		
		//default constructor--> provided by compiler
		//use: copy all the members of class into object
//		Sample1()
//		{
//			
//		}
		
		public void m1() 
		{
			System.out.println("running method m1");
		}
		
		public void m2() 
		{
			System.out.println("running method m2");
		}
		
		public static void main(String[] args)
		{
			Sample1 s1=new Sample1();
			s1.m1();
			s1.m2();
			
			//1: Sample1--> classname --> datatype
			//2: s1  --> objectName  --> to identify/refer object
			//3: new  --> keyword --> to create blank/empty object
			//4: Sample1()  --> classname()  --> constructor call -->  copy all the members of class into object
		
		System.out.println("----------------");
		
		Sample2 s2=new Sample2();
		s2.m3();
		
		}
	}
