package collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Interface {

	public static void main(String[] args) {
		Set <String> obj= new LinkedHashSet<String>();
		obj.add("Hi");
		obj.add("ok");
		obj.add("Rita");
		System.out.println(obj.contains("ok"));

	}

}
