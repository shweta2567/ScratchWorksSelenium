package corejava;

//When common parent data required for the child class 


class A       //super class
{
	
	void display() 
	{
		System.out.println("Hi");
	}
	
}
class B extends A      //sub class 1
{
	
	void set()
	{
		
	
	System.out.println("Hello");
    }
	
}

public class DemoHeirachial extends A {      //subclass 2


	
	void shweta()
	{
		System.out.println("hjk");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoHeirachial onj=new DemoHeirachial();
		onj.display();       //sub class 2 obj to inherits the feacture of parent and sub 2 methods
		
		onj.shweta();
		B obj=new B();       //sub class 1 obj to inherit the features of parent and sub 1 methods 
		obj.display();
		obj.set();
		
		
	}
	
	

}



