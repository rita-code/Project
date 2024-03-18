package Inheritance;

public class Baby extends Dog
{

public void babyBark()
{
	System.out.println("Bow");
	
}


public static void main(String[]args) {

Baby obj1=new Baby();
obj1.bark();
obj1.eat();
obj1.babyBark();
System.out.println(obj1.Col);


}
}
