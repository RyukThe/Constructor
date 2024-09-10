package Sample;

public class Sample21 
{
	///user defined constructor with parameter.
	int num1;
	int num2;
	
	Sample21(int a, int b)
	{
		num1=a; //50     87
		num2=b;  //67    67
		//user defined constructor with 2 int parameter
		//use1:  initialize global variable using local variable
		//use2: copy all the members of class into object
	}
	public void add()
	{
		System.out.println(num1+num2);  ///assign local variable info into global variable
	}
	public void sub()
	{
		System.out.println(num1-num2);
	}
	public static void main(String[] args) 
	{
		Sample21 s21=new Sample21(50,67);
		s21.add();
		s21.sub();
		System.out.println(".......");
		Sample21 s021=new Sample21(87,67);
		s021.sub();
		s021.add();
		System.out.println(".....Diff Class Output........");
		Sample22 s22=new Sample22(130,65);
		s22.mul();
		s22.div();
		System.out.println(".......");
		s22.add();
		s22.sub();
		
	}
}
