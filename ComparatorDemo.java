import java.util.Comparator;
import java.util.TreeSet;


public class ComparatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(3);
		t.add(25);
		t.add(12);
		t.add(2);
		
		System.out.println(t);

	}

}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 < o2){
			return 1;
		}else if(o1 > o2){
			return -1;
		}else{
			return 0;
		}
	}
	
}
