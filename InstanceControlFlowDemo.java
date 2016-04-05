
public class InstanceControlFlowDemo {

	int x = 10;
	{
		m1();
		System.out.println("First instance block");
	}
	public InstanceControlFlowDemo() {
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		InstanceControlFlowDemo ob = new InstanceControlFlowDemo();
		System.out.println("Inside main");
	}
	
	public static void m1(){
		//System.out.println("Value of Y    " + y);
	}
	
	{
		System.out.println("Second instance block");
	}
	
	 //int y = 20;

}
