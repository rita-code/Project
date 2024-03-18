package aggregation;

public class Student1 {



	String name;
	int id;
	Address address;
	
	void Student(String name, int id, Address address)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		
	}

	public static void main(String[] args) {
		Address obj1=new Address ("Trivandrum", "Kerala","India");
		
		Student obj=new Student("Rita", 34,obj1);
		
		obj.print();
		}

	public void print() {
	System.out.println("name is" +name+  "id is "  + id  );
	System.out.println("address is" +address.city +address.country + address.state);
	


}
}
	
