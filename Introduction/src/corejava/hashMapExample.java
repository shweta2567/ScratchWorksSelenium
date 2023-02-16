package corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		HashMap<Integer,String> s=new HashMap<Integer,String>();
		s.put(0,"hello");
		s.put(1, "Shweta");
		s.put(2, "How");
		s.put(3, "You");
		s.put(4,"Doing");
		s.put(5, "cbdh");
		System.out.println(s);
		System.out.println(s.get(2));
		s.remove(5);
		System.out.println(s);
		
		
		
		Set sm=s.entrySet();       //converting HashMAp into the HashSet 
		Iterator  it =sm.iterator();       //To Iterating to each key value pair
		
		while(it.hasNext()) {       // Iterator till all elements came as output 
			
			Map.Entry mp=(Map.Entry)it.next();   //Map.Entry separates Key and values in the HAsh MAp
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
