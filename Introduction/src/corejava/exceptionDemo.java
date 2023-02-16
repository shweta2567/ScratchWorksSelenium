package corejava;

public class exceptionDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		int a=4;
		@SuppressWarnings("unused")
		int b=0; 
		try {                //purchased failed 
			//int k=a/b;
			//System.out.println(k);    ///Arithmetic exception 
			
			int x[]=new int[7]; 							//ArrayOutOfBound Index 
			System.out.println(x[7]);
		}
		
		catch(ArithmeticException et) {
			System.out.println("I catched Artimetic Expection ");
		}
		catch(IndexOutOfBoundsException ets) {
			System.out.println("Array out of bound ");
		}
		
		//parent class Exception ,you can use it if you don't know the name 
		catch(Exception e) {            //retry again       
			System.out.println("I catched the error");
		}
		
		
		
		
		//real scenario to clear cookies or to close the browsers 
		finally{
			System.out.println("I am definnitely run");   /// real scenario when you need to close the program
		}
		

	}

}
