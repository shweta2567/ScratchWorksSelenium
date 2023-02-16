package corejava;

public class thisDemo {
	int a=2;
	public void getData() {
		int a=3;
		System.out.println(a);   //t will give output as 3
		System.out.println(this.a);   //this is used to refer global variable i.e a=2 in the same class 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo t=new thisDemo();
		t.getData();

	}

}

