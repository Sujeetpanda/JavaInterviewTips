import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		byte b = (byte)130;
		System.out.println(b);		
		 String str = "sujeet";
	     stringReveseRecursive(str.toCharArray());
	     
	     //Demoing Iterators 
	     
	     List<Integer> al = new ArrayList<>(); 
	        al.add(10); 
	        al.add(20); 
	        al.add(30); 
	        al.add(1); 
	        al.add(2); 
	  
	        // Remove elements smaller than 10 using 
	        // Iterator.remove() 
	        Iterator itr = al.iterator(); 
	        while (itr.hasNext()) 
	        { 
	            int x = (Integer)itr.next(); 
	            if (x < 10) 
	                itr.remove(); 
	        } 
	  
	        System.out.println("Modified ArrayList : "+ al);
	        
		     List<Integer> list = new ArrayList<>(); 
		       	list.add(10); 
		        list.add(20); 
		        list.add(30); 
		        list.add(1); 
		        list.add(2); 
		        
		      ListIterator<Integer> ltr = list.listIterator();
		      while(ltr.hasNext()) {
		    	  int x = (Integer) ltr.next();
		    	  if(x < 10) {
		    		  System.out.println("Inside if");
		    		  ltr.add(10);
		    	  }
		      }
		      
		      System.out.println("Modified ArrayList : "+ list);
		      
		      //Custome comparator demo
		      List<String> names = new ArrayList<String>();
		      names.add("Sujeet");
		      names.add("Ram");
		      names.add("Hari");
		      names.add("james");
		      
		      System.out.println(names);
		      
		      Collections.sort(names,new MyComparator());
		      System.out.println(names);
		      
		      //Map Demo
		      
		      Map<String,Integer> map = new HashMap<String, Integer>();
		      map.put("Sujeet", 36);
		      map.put("Ram", 35);
		      map.put("Hari", 31);
		      
		      Set<Entry<String, Integer>> s = map.entrySet();
		      Iterator<Entry<String, Integer>> mtr = s.iterator();
		      while(mtr.hasNext()) {
		    	  Entry<String, Integer> e = mtr.next();
		    	  System.out.println("key :" + e.getKey() +"======================>" + "Value:"+e.getValue() );
		      }
		      
		      //Thread Demo
/*		      MyRunnable r = new MyRunnable();
		      Thread t = new Thread(r);
		      t.start();
		      for(int i = 0; i < 10; i++) {
		    	  System.out.println("Parent thread");
		      }
		      */
		      
		      System.out.println("Thread DEMOs******************************************");
		      
		      Object sharedObject = new Object();
		      MyRunnable even = new MyRunnable(sharedObject);
		      MyRunnable odd = new MyRunnable(sharedObject);
		      Thread t1 = new Thread(even);
		      Thread t2 = new Thread(odd);
		      t1.setName("even");
		      t2.setName("odd");
		      t1.start();
		      t2.start();
		      
		      //******************************************************************************
		      System.out.println("******************Inner Class *****************************");
		      //1) Extending one class
		      Popcorn p = new Popcorn();
		      p.taste();
		      
		      Popcorn p1 = new Popcorn(){
		    	  public void taste() {
		    		  System.out.println("Sweet");
		    	  }
		      };
		      p1.taste();
		      
		      //2)Implementing an interface
		      new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("Inner class demo");
				}
			}).start();
		      System.out.println("********************End of inner class************************");
		      
		      System.out.println("*****************String magic*****************************");
		      String s1 = new String("Sujeet");
		      String s2 = new String("Sujeet");
		      String s3 = "Sujeet";
		      String s4 = "Sujeet";
		      System.out.println(s1 == s2);
		      System.out.println(s1.equals(s2));
		      System.out.println(s1.hashCode());
		      System.out.println(s2.hashCode());
		      System.out.println(s3.hashCode());
		      System.out.println(s1.equals(s3));
		      System.out.println(s1 == s3);
		      System.out.println(s3 == s4);
		      
		      String s5 = "ram";
		      String s6 = s5.toUpperCase();
		      String s7 = s5.toLowerCase();
		      String s8 = s6.toUpperCase();
		      
		      System.out.println(s5 == s6);
		      System.out.println(s6 == s7);
		      System.out.println(s6 == s8);
		      System.out.println("***********************End of String ************************");
		      
		      System.out.println("*******************Immutable class**************************");
		      ImmutableClass c = new ImmutableClass(10);
		      ImmutableClass c2 = new ImmutableClass(100);
		      ImmutableClass c3 = new ImmutableClass(10);
		      
		      System.out.println(c == c2);
		      System.out.println(c == c3);
		      System.out.println("*******************Immutable class end**************************");
      
	}
	
	public static void stringReveseRecursive(char[] charArray) {

	    if(charArray.length > 1) {
	            stringReveseRecursive(Arrays.copyOfRange(charArray, 1,
	                    charArray.length));
	            System.out.println(charArray[0]);
	            

	        }
	    
	    else{
	       System.out.println(charArray[0]);
	        
	    }
	    return;

	    }

}

class Parent{
	public Object m1() {
		return new Object();
	}
	public void m2() {
		//return new Object();
	}
}
class Child extends Parent{
	public String m1() {
		return new String("sujet");
	}
	public void m2() {
		//return 10;
	}
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return (str1.length() - str2.length());
	}
	
}

class MyRunnable implements Runnable{
	
	private Object obj;
	volatile static int i = 1;

	public MyRunnable(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		while(i <= 10) {			
			if (i % 2 == 0 && Thread.currentThread().getName().equals("even")) {
				synchronized (obj) {
	                System.out.println(Thread.currentThread().getName() + " - " + i);
	                i++;
	                try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			if (i % 2 == 1 && Thread.currentThread().getName().equals("odd")) {
				synchronized (obj) {
	                System.out.println(Thread.currentThread().getName() + " - " + i);
	                i++;
	                obj.notify();
				}
				
			}
			
			
		}
	}
	
}


class Popcorn{
	public void taste() {
		System.out.println("Salty");
	}
}

final class ImmutableClass{
	private int i;

	public ImmutableClass(int i) {
		this.i = i;
	}
	public ImmutableClass modify() {
		if(this.i == i) {
			return this;
		}else {
			return new ImmutableClass(i);
		}
	}
	
}
