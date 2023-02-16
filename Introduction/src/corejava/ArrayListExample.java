package corejava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList =ArrayList in Java is used to store dynamically sized collection of elements
		
		//ArrayList is part of Java's collection framework and implements Java's List
		
		//List is an ordered collection (sequence ) .
		/*ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(3);    //List can duplicate elements 
		a.add(0, 4);
		System.out.println(a);
		
		//Access the element 
		
		System.out.println(a.get(1));
		
		//Change an item 
		a.set(0, 22);
		System.out.println(a);
		
		//Remove an element 
		a.remove(2);
		System.out.println(a);

		//To remove all elements 
		//a.clear();
		//System.out.println(a);
		
		//to find the size
		
		System.out.println(a.size());
		
		*/
		
		
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    for (int i = 0; i < cars.size(); i++) {
	      System.out.println(cars.get(i));
		
	    }
	    System.out.println(cars.contains("test"));
	    System.out.println(cars.indexOf("Ford"));
	    System.out.println(cars.isEmpty());
	      
	      //for each element 
	      
	      ArrayList<String> cars1 = new ArrayList<String>();
	      cars1.add("Volvo");
	      cars1.add("BMW");
	      cars1.add("Ford");
	      cars1.add("Mazda");
	      for (String j : cars1) {
	        System.out.println(j);
	      }
	      
	      ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	      myNumbers.add(10);
	      myNumbers.add(15);
	      myNumbers.add(20);
	      myNumbers.add(25);
	      for (int i : myNumbers) {
	        System.out.println(i);
	      }
	      
	      //sort an array 
	      ArrayList<String> cars11 = new ArrayList<String>();
	      cars11.add("Volvo");
	      cars11.add("BMW");
	      cars11.add("Ford");
	      cars11.add("Mazda");
	      Collections.sort(cars11);  // Sort cars
	      for (String i : cars11) {
	        System.out.println(i);
	      }
		
	    
	}

}
