package constructor_1;

public class DefConstructor {
	int a;
	int b;
	
public  void DefConstructor()
{
	
	System.out.println("hi" + a);// default value of a is 0, there is a constructor being created by the compiler 
}
	public static void main(String[] args) {
		DefConstructor obj=new DefConstructor();
		obj.DefConstructor();
	}

}

