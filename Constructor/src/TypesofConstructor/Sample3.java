package TypesofConstructor;

public class Sample3
{
		//example2: user defined constructor without parameter
		
		//step1: variable declaration
		int m;    //10
		int n;    //20

		//step2: variable initialization
		//user defined constructor --> provided by user
		//use1: to initialize global variable
		//use2: to copy all the members of class into object
		Sample3()            // without/zero parameter constructor
		{
			m=10;
			n=20;
		}
		
		public void addition()
		{
			System.out.println(m+n);
		}
		
		public void mult() 
		{
			System.out.println(m*n);
		}

		public static void main(String[] args) 
		{
			Sample3 s3=new Sample3();
			s3.addition();
			s3.mult();
			System.out.println("---------------------");
			Sample4 s4=new Sample4();
			s4.sub();
			s4.div();
		}
	}

