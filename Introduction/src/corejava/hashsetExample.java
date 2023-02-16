package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet,TreeSet,LinkedHashset implements the Set Interface 
		//Set doesn't accept duplicate values
		// set is unordered sequence ..... Stored in Random order 
		HashSet<String> s= new HashSet<String>();
		s.add("USA");
		s.add("russia");
		s.add("India");
		s.add("India");
		s.add("She");
		s.add("Ass");
		System.out.println(s);
		System.out.println(s.remove("India"));
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		
		
		
		
		//Iterator 
		Iterator<String> i= s.iterator();
		
		//System.out.println(i.next());      //Iterates one by one starting from out 
		//System.out.println(i.next());
		
		while(i.hasNext()) {           //Iterates all items one by one till it ends 
			System.out.println(i.next());
		}
		
		
	}

}

