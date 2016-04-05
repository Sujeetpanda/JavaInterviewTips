
public class TypeCastingDemo {

	public static void main(String[] args) {
		//A a = (C) d;
		Object ob = new String("Sujeet");
		//StringBuffer sb = (StringBuffer) ob;
		//Case1 : C and D should be of same time or parent child and child parent
		String s = new String("Sujeet");
		//StringBuffer sbb = (StringBuffer) s; 
		
		Object o = (Object) s;//C and D are of same type
		
		//Case2: C must be same type of derived type of A
		
		Object o2 = new String("Sujeet");
		String s2 = (String) o2;
		
		//Case3 : d must be same or derived C otherwise Exception
		//java.lang.ClassCastException:
		//StringBuffer sb2 = (StringBuffer) o2;
		
		//For static or instance variables resolution should be done on reference type not with runtime object
		//Other methods it will with Runtime object
		C c = new C();
		c.m1();
		((B)c).m1();
		((A)c).m1();
	}

}

class A{
	public static void m1(){
		System.out.println("A");
	}
}
class B extends A{
	public static void m1(){
		System.out.println("B");
	}
}
class C extends B{
	public static void m1(){
		System.out.println("C");
	}
}
