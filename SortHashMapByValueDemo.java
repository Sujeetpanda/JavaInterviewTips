import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SortHashMapByValueDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Sujeet", 32, 100000);
		Employee e2 = new Employee("Smita",32,32324);
		Employee e3 = new Employee("Smita1223",32,32324);
		
		Map<Employee,Integer> empMap = new HashMap<Employee,Integer>();
		
		empMap.put(e1,10);
		empMap.put(e2, 20);
		empMap.put(e3,15);
		
		List<Entry<Employee,Integer>> keyList = new LinkedList<Entry<Employee, Integer>>(empMap.entrySet());
		Collections.sort(keyList,new Comparator<Entry<Employee,Integer>>() {

			@Override
			public int compare(Entry<Employee, Integer> o1,
					Entry<Employee, Integer> o2) {
					return ((o1.getValue()).compareTo( o2.getValue() ));
			}
		});
		
		Map<Employee, Integer> result = new LinkedHashMap<Employee, Integer>();
		
	    for (Map.Entry<Employee, Integer> entry : keyList)
	    {
	        result.put( entry.getKey(), entry.getValue() );
	    }
		
		
		Set<Entry<Employee, Integer>> s = result.entrySet();

		for(Entry<Employee, Integer> e : s){
			System.out.println(e.getKey() + "*******************" + e.getValue());
		}
	}

}


class Employee{
	private String name;
	private int age;
	private int sal;
	public Employee(String name, int age, int sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
