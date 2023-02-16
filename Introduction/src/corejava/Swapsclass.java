package corejava;

public class Swapsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a[]= {2,6,1,4,9};
		int temp;
		for(int i=0;i<5;i++) 
		{
			for(int j=i+1; j<5;j++)
			{
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<5; i++) {
			System.out.println(a[i]); 
		}
		*/
		int a[]= {5,7,1,3,4};
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		
		
		
		
		
		//
		//int temp;
		/*int a = 5;
		int b = 4;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is equal to "+a);
		System.out.println("b is equal to "+b);*/
		
	}

}
