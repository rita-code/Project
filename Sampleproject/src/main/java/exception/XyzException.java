package exception;

public class XyzException {

	public static void main(String[] args) throws AbcException
	{
		XyzException obj=new XyzException();
		obj.display(12);
		
	}
	public void display( int a) throws AbcException
	{
		if (a<18)
		{throw new AbcException(" ABCKHFJKHKJFCHGJFC");
			
			
		}
		else {
			System.out.println(" Elligible");
		}

	}

}
