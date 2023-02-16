package corejava;
//When all data is required by all the class 

//mULTILEVEL iNHERITAANCE 

class X{
	void setData() {
		System.out.println("hii Shweta");
		
	}
}

class Y extends X{
	 void getData() 
	 {
		 System.out.println("Hello ");
	 }
}


public class DemoMutipleInheritance extends Y{
	
	void acess()
	{
		System.out.println("Hii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoMutipleInheritance obj=new DemoMutipleInheritance();
		obj.setData();    //Parent method 
		obj.getData();     //Sub class 1 method 
		obj.acess();      //Sub class 2 method 
		
	}
	
	
}
	


