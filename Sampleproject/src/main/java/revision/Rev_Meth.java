package revision;

public class Rev_Meth {
	static int bonus=3000;

	public static void main(String[] args) {
		
		Rev_Meth obj=new Rev_Meth();
		obj.display_details();
		Rev_Meth.carDetails();
		obj.show_EmpDetails();
		
		
		

	}
	public  void display_details() {
		String name = "Rita";
		int mks1 = 40;
		int mks2 = 70;
		int age = 29;
		int total_mks= mks1+mks2;
		System.out.println("Name of the student"  +   name);
		System.out.println("Age of the student"+  age);
		System.out.println("Marks scored in 1st sem  ="    +mks1);
		System.out.println("Marks Scored in 2nd sem="   +  mks2);
		
		System.out.println(" Total marks scored for both the sem ="  + total_mks);
		
		
			 
		 }
		
	public static void carDetails() {
		int reg_no= 23456;
		String insurance_date= "    12/05/2021";
		System.out.println("insurance date is    " + insurance_date );
		System.out.println("Registered on    " +  reg_no);
		
		
	}
	public void show_EmpDetails() {
		int empid= 12345;
		int jansal= 2000;
	int totalsal= jansal*12;

	System.out.println("Employe ID =  " +  empid);
System.out.println("January Sal=  "+ jansal);
System.out.println("Tota sal  ="   +totalsal);
System.out.println("Bonus="  +bonus);
	}
	}



