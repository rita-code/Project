package interface_Ex;

public class Multiple3 implements Multiple1, Multiple2 {

	@Override
	public void display() {
		System.out.println("hi");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("hello");
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		Multiple3 obj=new Multiple3();
		obj.display();
		obj.show();
	}
	

}
