package Methods;
import java.util.Scanner;
public class Parameter {
	public static void oddEven(int num) {
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
	}
	


public static void main(String []args) {
	System.out.println("Enter a number");

	Scanner input= new Scanner(System.in);
	int num=input.nextInt();
	
	Parameter.oddEven(num);
	
	
}
}
