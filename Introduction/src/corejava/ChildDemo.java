package corejava;

public class ChildDemo extends ParentDemo{
	String name="ShwetaYadav";
	public ChildDemo() {
		
		super();    //invoke the constructor of parent class........This should be first line in child class 
		System.out.println("I am a constructor ");
	}
	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);   //super is used to refer parent class variables 
	}
	
	//same method as parent method
	public void getData() {
		

		int a=3;
		System.out.println(a);
		System.out.println(this.a); //this brings a value from parent class a=2
		
		System.out.println("I am a child class");
		super.getData();    //get the method  from parent method of parent class  i.e I am parent class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo c=new ChildDemo();
		c.getStringdata();            //name is present in both ,but complier will give preference to local i.e child class variables
		c.getData();

	}

}
