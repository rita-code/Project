package Methods;

public class InstanceSample {
	
	public void oddEven(int num) {
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		
	}
	public static void main(String[] args) {
		InstanceSample obj= new InstanceSample();
		obj.oddEven(4);
	
		// TODO Auto-generated method stub

	}

}
