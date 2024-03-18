package abstraction;

public class First implements Third_Interface, Second_Interface {

	public static void main(String[] args) {
		First obj=new First();
		obj.num();
		obj.num2();

	}

	@Override
	public void num2() {
		System.out.println("1234");
		
	}

	@Override
	public void num() {
		System.out.println("5678");
		
	}

}
