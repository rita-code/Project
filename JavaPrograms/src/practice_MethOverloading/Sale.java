package practice_MethOverloading;
import java.util.Scanner;

 
class Sale
{
	public static void main(String args[])
	{
 
	double  dis,amount,markedprice,s;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter markedprice ");	
               
	markedprice=sc.nextDouble();
 
        System.out.println("enter discount percentage ");	
               
	dis=sc.nextDouble();			
	
        s=100-dis;
 
	amount= (s*markedprice)/100;
 
	System.out.println("amount after discount="+amount);
 
	}
}
