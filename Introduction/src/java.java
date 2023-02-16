
/*public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1,s=3;
		for(int i=1;i<=3;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				
				System.out.print(k*s+" ");
				
				k++;
			}
		System.out.println();
		}
		
}

}*/

//step 1 Minimum element in array ,   Step 2 in that column find the maximum element present
public class java{
	public static void main(String[] args) {
		int a[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int sum=a[0][0];
		int min=0;
		for(int i=0;i<=2;i++) {  //outer loop (for row element)
			for(int j=0; j<=2; j++) {   //inner loop(column element)
				if(sum>a[i][j]) {     //checking the condition 
					sum=a[i][j];
					min=j;
				}
			}
		}
		int max=a[0][min];
		int k=0;
		while(k<3) {
			if(a[k][min]>max){  //j is contant column of that column where element minimum was found 
				max=a[k][min];
				
			}
			k++;
		}
		
		//System.out.println(sum);
		System.out.println(max);
	}
}
