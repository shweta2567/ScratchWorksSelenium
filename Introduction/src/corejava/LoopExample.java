package corejava;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k=3;
		int k=1;
		int s=3;
		for(int i=1; i<=4;i++) {
			//System.out.println(i);
			for(int j=1;j<=i;j++) {
				System.out.print(k*s+ " ");
				k++;
			}
			System.out.println();
		}
		
		}

	}


