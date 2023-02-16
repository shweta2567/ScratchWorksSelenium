package corejava;




//Simple inheritance 
class parent{
	public void setData()
	{
		System.out.println("Hi");
	}
}
public class child extends parent{
	
	public void getData()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		child onj=new child();
		onj.setData();  //parent method 
		onj.getData();  //child method
	}

}
