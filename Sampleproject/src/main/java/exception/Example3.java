package exception;

public class Example3 {

	public static void main(String[] args) {
		try {
		String s= null;
		System.out.println(s.length());
	}
	
		catch(NullPointerException a) 
		{
			System.out.println("exception occured" +"  " + a);
			}
			finally 
			{
				System.out.println( "Done");
			}
			
			
			
			
			
			
			
			
		}
	}
		


