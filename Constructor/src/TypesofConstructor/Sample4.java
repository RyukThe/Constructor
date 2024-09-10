package TypesofConstructor;

public class Sample4
{
	//step1: variable declaration
		int p;   //50
		int q;   //20
		
		//step2: variable initialization
		//use1: to initialize global variable
		//use2: copy all the members of class into object
		Sample4()     // without/zero parameter constructor
		{
			p=100;
			q=25;
		}
		
		public void sub()
		{
			System.out.println(p-q);
		}
		public void div()
		{
			System.out.println(p/q);
		}


}
