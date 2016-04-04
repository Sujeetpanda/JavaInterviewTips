
public class ParentChildStaticDemo {
	static int x = 10;
	static{
		m1();
		System.out.println("Inside base static block");
	}
	public static void main(String[] args) {
		m1();
		System.out.println("base main");

	}
	
	public static void m1()
	{
		System.out.println("Value of Y  " + y);
	}
	
	static int y = 20;
}

/*1) Identification of static members from parent to child
2) Execution of static members and static blocks from parent to child
3) Execution of only child class main method since it is overriding the parent.*/
class Derived extends ParentChildStaticDemo{
	static int i = 100;
	static{
		m2();
		System.out.println("Inside derived static block");
	}
	
	public static void main(String[] args) {
		m2();
		System.out.println("Derived main");
	}
	
	public static void m2(){
		System.out.println("Value of j   " + j);
	}
	
	static{
		System.out.println("Derived second static block");
	}
	
	static int j = 200;
}
