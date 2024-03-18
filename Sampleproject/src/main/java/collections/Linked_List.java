package collections;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> obj=new LinkedList<String>(); 
		obj.add("Rita");
		obj.add("Rekha");
		obj.add("Akash");
		obj.add("Jaya");
		obj.add("Jones");
		obj.add("Rita");
		
		obj.remove("Akash");
		
		
		System.out.println(obj.get(2));
		System.out.println(obj.contains("Rita"));
		System.out.println(obj.isEmpty());
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		System.out.println(obj);
		System.out.println(obj.element());
		obj.removeFirst();
		System.out.println(obj);
		System.out.println(obj.clone()); 
		System.out.println(obj.indexOf("Jones"));
		System.out.println(obj.size());
		//obj.clear();
		System.out.println(obj);
		System.out.println(obj.indexOf("Rita"));
		obj.removeFirstOccurrence("Rita");
		//System.out.println(obj);
		//obj.removeLast();
		System.out.println(obj);
		obj.toArray();
		System.out.println(obj);

		System.out.println();
		
		
		
		
		
		
		
		
		
		
		

	}

}
