package TypesofConstructor;

public class Sample5
{
	//example3:   user defined constructor with parameter
	
		int num1;    //10   5
		int num2;    //20    6

		//user defined constructor with 2 int  parameter
		//use1:  initialize global variable using local variable
		//use2: copy all the members of class into object
		Sample5(int a, int b)
		{
			num1=a;          //assign local variable info into global variable
			num2=b;
		}
		
		public void add() 
		{
			System.out.println(num1+num2);
		}
		
		public void sub() 
		{
			System.out.println(num1-num2);
		}
		
		public static void main(String[] args) 
		{
			Sample5 s5=new Sample5(10,20);
			s5.add();
			s5.sub();
			
			System.out.println("-----");
			
			Sample5 s05=new Sample5(5,6);
			s05.add();
			s05.sub();
			
			System.out.println("--------------------------------");
			
			Sample6 s6=new Sample6(9,8);
			s6.mul();
			
			System.out.println("-------");
			
			Sample6 s06=new Sample6(20, 30);
			s06.mul();

		}
		
		
}
