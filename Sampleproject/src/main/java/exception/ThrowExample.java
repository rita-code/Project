package exception;

public class ThrowExample {

	public static void main(String[] args) {
		ThrowExample obj= new ThrowExample();
		obj.display();
	}
	
		
		public void display()
		{
	int age= 16;
	if(age<18) {
		throw new ArithmeticException(" Invalid ");
	}
	else {
		System.out.println("Elligible");
	}
	}

}
