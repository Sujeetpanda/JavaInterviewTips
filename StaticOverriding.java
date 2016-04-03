
public class StaticOverriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parent p = new Child();
		//p.show();
		p.test();

	}

}
//Resolution by reference type
class Parent{
	public static void show(){
		System.out.println("Base");
	}
	
	public Object test(){
		System.out.println("Object");
		return new Object();
	}
}

class Child extends Parent{
	public static void show(){
		System.out.println("Child");
	}
	
	public String test(){
		System.out.println("String");
		return "Sujeet";
	}
}
