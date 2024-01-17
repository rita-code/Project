package Super;

public class Dog extends Animal {
	
	String col= "white";
	public void print() {
		System.out.println(super.col);
		System.out.println(col);
	}
	

	public static void main(String[] args)
	{
		
		Dog obj=new Dog();
		obj.print();
		

	}

}
