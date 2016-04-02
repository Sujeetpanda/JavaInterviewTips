import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CursorsDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(33);
		list.add(35);
		list.add(40);
		list.add(50);
		
		//Using Enumeration and Iterator(Only one way)
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			if(itr.next() %2 != 0){
				itr.remove();
			}
		}
		System.out.println(list);
		
		list.add(33);
		list.add(43);
		
		System.out.println(list);
		
		ListIterator<Integer> listItr = list.listIterator();
		
		while(listItr.hasNext()){
			Integer temp = listItr.next();
			if(temp %2 != 0 && temp > 30 && temp < 40 ){
				listItr.remove();
			}else if(temp %2 != 0 && temp > 40){
				listItr.set(temp + 1);
			}
		}
		System.out.println(list);
		
	}

}
