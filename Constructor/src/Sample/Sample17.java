package Sample;

public class Sample17 
{
 int u;
 int v;
 
 Sample17()
 {
	 u=67;
	 v=56;
 }
 public void addition()
 {
	 System.out.println(u+v);
 }
 public void substract()
 {
	 System.out.println(u-v);
 }
 public static void main(String[] args) 
 {
	 Sample17 s17=new Sample17();
	 s17.addition();
	 s17.substract();
	 System.out.println(".......Diff class Output.......");
	 Sample18 s18=new Sample18();
	 s18.multi();
	 s18.div();
 }
}

