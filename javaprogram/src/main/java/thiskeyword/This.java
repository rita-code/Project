package thiskeyword;

public class This
{
String name;
This(String name)
{
this.name=name;
}
public void show()
{System.out.print(name);
}
public static void main(String []args)
{
This obj=new This("Rita");
obj.show();
}

}
