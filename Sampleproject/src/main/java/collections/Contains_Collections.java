package collections;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class Contains_Collections {

	public static void main(String[] args) {
		ArrayList<Integer> obj= new ArrayList<Integer>();
		obj.add(5);
		obj.add(8);
		boolean s= obj.contains(8);
		System.out.println(s);
		System.out.println(obj);
		
		

	}

}
