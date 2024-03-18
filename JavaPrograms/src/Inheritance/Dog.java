package Inheritance;

public class Dog extends Animal {
public void bark() {
System.out.println("Barking");

}
public static void main(String[]args)
{
	Dog obj= new Dog();
	obj.bark();
	obj.eat();
System.out.println(obj.Col);
	}
}

