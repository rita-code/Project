package exception;

public class Example_Exception {

	public static void main(String[] args) {
		try
		{
		int a=1;
		int b= 0;
		int c= a/b;
		}
		catch(ArithmeticException d)
		{
			System.out.println("exception occured"+" "+d);
		}
		finally
		{
		System.out.println("finished");	
		}
		}
	
	//	System.out.println(c);
		//System.out.println("hi");

	}


