package corejava;

public class StaticVar {
	
	String name;   //These are instance variables 
	String address;
	static String city="Bangalore";   //static variable are class variables  
	static int i=0;  //sharing happen and 
	/*static {                        //static block used for intiatlazation of variables/fields
		city="Bangalore";
		i=0;
	}*/
	StaticVar(String name,String Street)     //Explicitly constructor will be invoke that means constructor which is defined by the user 
	
	{	
	
		//name Street and city are local variables ......scope of these var will be inside the block 
		
		this.name=name;    //this refers to the current object instance in your class 
		this.address=Street;
		i++;
		System.out.println(i);
		//this.city=city;
	}
	public void getAddress() {
		System.out.println(address+" "+city);
	}

	public static void getCity()
	{
		System.out.println(city);   // Static method use only static variables 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar obj =new StaticVar("Shweta","Gorakhpur");
		StaticVar obj1= new StaticVar("Gamma","Lucknow");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();  //Directly you can call through classname..... // 
		StaticVar.i=4;  //Access field/variables  also  
	}

}


  //Static methods and  variables are independent of object and and they belong to class  