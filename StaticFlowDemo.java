
/*Identify the static members from top to bottom
Execution of static variable assingment and static blocks from top to bottom
execution of main method.*/

public class StaticFlowDemo {

	static int x = 10;
	static{
		m1();
		System.out.println("First static block");
	}
	
	
	public static void main(String[] args) {
		m1();
		System.out.println("Inside main");
	}
	
	public static void m1(){
		System.out.println("Value of Y   " + y);
	}
	
	static{
		System.out.println("Second static block");
	}
	
	static int y = 20;
	
	//RIWO
	//Static variables we cannot access directly. We need to access them thrun functions if they are in RIWO state
/*	static
	{
	    System.out.println(i);
	    System.out.println("block1");
	}
	static int i = 10;
	public static void main(String... args)
	{
	    System.out.println("main block");
	}*/

}
