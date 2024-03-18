package aggregation;
import java.util Scanner;
public class Square 

{
public int calculatearea (int side) 
	{
		return side*side;
}
public static int getside()
{ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side:   ");
int side=sc.nextInt();
return side;

}
}
