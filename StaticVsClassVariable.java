
public class StaticVsClassVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterviewTest t1 = new InterviewTest();
		t1.x = 100;
		t1.y = 999;
		InterviewTest t2 = new InterviewTest();
		System.out.println(t2.x + "               " + t2.y);

	}

}


//1) Important property of class variable and static variable
//If we change static variale value then it will reflect in other objects
//but in case of simple class variable it wont affect
//In the below example x is class variable and we are changing for t1 but it is not affecting t2.x
class InterviewTest{
	int x = 10;
	static int y = 100;
	
}
