
public class AustralianTraffic implements CentralTraffic,IndiaTraffic{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a=new AustralianTraffic();
		a.greenGo();
		a.redstop();
		a.yellow();
		//when class have to acccess different Interface  methods
		IndiaTraffic b=new AustralianTraffic();   //Initiated the obj for class Australian to implement the methods of Indian Traffic class i.e . another method
		b.trainSymbol();
		//when class have to access its own method
		AustralianTraffic c=new AustralianTraffic();
		c.walk();

	}

	@Override
	
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train symbol");
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("You can Go");
		
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("You have to stop");
		
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("You have to wait");
		
	}
	//own methods
	public void walk() {
		System.out.println("Walking");
	}

}
