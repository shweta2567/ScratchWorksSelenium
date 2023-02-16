import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	//@Test
	public void regular() {
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("Abhisekh");
		names.add("Shweta");
		names.add("Abhay");
		names.add("akshay");
		names.add("Drish");
		names.add("Amt");
		names.add("Ashish");
		int count =0;
		for(int i=0; i<names.size();i++) 
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
			
				count++;
			}
		}
		System.out.println(count);
		
		
		}
	//@Test	
	public void streamFilter() {
			
	ArrayList<String> names=new ArrayList<String>();
			
			names.add("Abhisekh");
			
			names.add("Shweta");
			names.add("Abhay");
			names.add("akshay");
			names.add("Drish");
			names.add("Amiot");
			names.add("Ashish");  
			
			//There is no life for Intermediate Operation ,if there is no Terminal Operation 
			//Terminal operation will execute only if there is intermediate operation (filter ) Returns True 
			
			
			Long c= names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			
			//We can create Stream 
			long d=Stream.of("Abhisekh","Abhay","Akshay","Amit","Drish","Aaas").filter(s->
			{
				s.startsWith("A");	
				//return false;  //Return 0
				
				return true;
			}).count();
			System.out.println(d);
			
			//FOR EACH 
			
			//Print all the names of ArrayList 
			//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));    //It will give output as names greater than 4
			names.stream().filter(s->s.length()>4).limit(4).forEach(s->System.out.println(s));     //It will limit the output to print 4 string 
			
		
		}
	//@Test
	public void StreamMap() 
	{
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("man");
		names.add("Don");
		names.add("women");
		names.add("Priya");
		names.add("Hari");
		
		
	
		
		//Print the names which have last letter as "a" with Uppercase
		Stream.of("Abhi","rama","Adam","Alekya","Don").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//Print the names which have first letter as "A" with uppercase and sorted 
		
		//You can covert Arrays into ArrayList : Arrays.asList()
		
		List<String>names1=Arrays.asList("Abhi","rama","Adam","Alekya","Don");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Merging 2 different List 
		  Stream<String>newString=Stream.concat(names.stream(), names1.stream());
		  newString.sorted().forEach(s->System.out.println(s));
		  
		  
		  
		  //To check any text present in the List :
		  Stream<String>newString1=Stream.concat(names.stream(), names1.stream());
		  boolean flag=newString1.anyMatch(s->s.equalsIgnoreCase("Adam"));
		  Assert.assertTrue(flag);
	}
	@Test
	public void streamCollect() 
	{
		 List<String> ls=Stream.of("Abhi","rama","Adam","Alekya","alekya").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		 
		 //When you want to grab one value
		System.out.println(ls.get(0));
		
		//question 
		//Print the Unique Number from this array 
		//Sort the Array 
		List<Integer> values =Arrays.asList(1,2,3,4,4,5,6,7,7,8,8,9);
		
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer>li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
		
		
		
		
	}
		


	}

		
		
	
	


