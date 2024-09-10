package Sample;

public class Sample22 
{
		int num3;  //num3=c
		int num4;  //num4=d
		
		Sample22(int c, int d)
		{
			num3=c; //c=130
			num4=d;  //d=65
		}
		public void mul()
		{
			System.out.println(num3*num4);   ///////assign local variable info into global variable
		}
		public void div()
		{
			System.out.println(num3/num4);
		}
		public void add()
		{
			System.out.println(num3+num4);
		}
		public void sub()
		{
			System.out.println(num3-num4);
		}
}
