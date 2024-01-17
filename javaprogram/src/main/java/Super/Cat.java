package Super;

public class Cat extends Animal 
{
	public void eat() {
		
	System.out.println("cat Eating");
}
	public void print() {
	
		eat();
		super.eat();
	}

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.print();
	

	}

}
