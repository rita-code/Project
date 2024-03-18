package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterative_1 {

	public static void main(String[] args) {
		List<String> obj=new ArrayList<String>();;
		obj.add("Hi");
		obj.add("ok");
		obj.add("uuhyujy");
		obj.add("now")	;
		Iterator<String> col= obj.iterator();
		while( col.hasNext()) {
			System.out.println(col.next());
			
		}
	col.remove();
	System.out.println(obj);
		
	}
	
}
