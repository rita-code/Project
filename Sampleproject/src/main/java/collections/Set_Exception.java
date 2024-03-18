package collections;

import java.util.ArrayList;
import java.util.List;

public class Set_Exception {

	public static void main(String[] args) {
		List <String> obj= new ArrayList<String>();
		try {
		obj.add("Rita");
		obj.add("hope");
		obj.add("doing");
		obj.add("type");
		obj.set(7, "RITA");
		obj.set(4, "notDisplaying");
		System.out.println(obj);
		
		

	}
		catch (IndexOutOfBoundsException r)
		{
			System.out.println("Exception occured"   +r);
			obj.set(3, "show");
		
			
			
		}
		finally {
			System.out.println("Execution completed");
			obj.set(2, "replaced");
			System.out.println(obj);
		}
		}
	}


