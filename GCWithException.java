
public class GCWithException {

/*	Note: If we explicitly called finalize method and if that throws and exception then program will terminate 
			abnormally. If it is called by JVM then program will run with out any exception.*/
	public static void main(String[] args) {
		GCTest test = new GCTest();
		test.finalize(); //Test commenting out this
		test = null;
		System.gc();
		System.out.println("End of main");
	}

}

class GCTest{
	public void finalize(){
		System.out.println("Finalize method called");
		System.out.println(10/0);
	}
}
