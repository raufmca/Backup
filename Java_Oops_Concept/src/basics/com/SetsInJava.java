package basics.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsInJava {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add("India");
		s.add("France");
		s.add("Netherland");
		s.add("Belgium");
		s.add("Netherland");
		
		System.out.println(" Number of elements in s -->" + s.size());

		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
