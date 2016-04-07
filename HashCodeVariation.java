import java.util.HashMap;
import java.util.Map;


/* if key1.equals to key2 then the value will be replaced
 if key1.equals(key2) is false. Then One more node will be created in the same bucket.
 Key match is always by equals method NOT by hashCode.
 Always keys with their associated values are store in the bucket*/

public class HashCodeVariation {

	public static void main(String[] args) {
		Map<HashCodeTest,Integer> map = new HashMap<>();
		HashCodeTest obj1 = new HashCodeTest("Sujeet");
		HashCodeTest obj2 = new HashCodeTest("Hari");
		HashCodeTest obj3 = new HashCodeTest("Ram");
		
		System.out.println(map.put(obj1, 10));
		System.out.println(map.put(obj2,20));
		System.out.println(map.put(obj3, 30));
		System.out.println(map.put(obj3, 40));
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println("The size of map is   " + map.size());
		
		System.out.println(map.get(obj1));
		System.out.println(map.get(obj2));
		System.out.println(map.get(obj3));
	}

}

class HashCodeTest{
	private String name;


	
	public HashCodeTest(String name) {
		super();
		this.name = name;
	}



	public int hashCode(){
		return 100;
	}
}
