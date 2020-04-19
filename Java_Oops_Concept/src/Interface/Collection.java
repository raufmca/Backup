package Interface;

import java.util.ArrayList;
import java.util.Hashtable;

public class Collection {

	public static void main(String[] args) {
		
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("AA");
		lst.add("BB");
		lst.add("CC");
		lst.add("DD");

		System.out.println("Elements in array list ");
		for ( int i =0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		
		//------------------------ Hashtable ------------------
		
		Hashtable<String,String> tab = new Hashtable<String, String>();
		tab.put("name", "Alhaam");
		tab.put("place", "Bengaluru");
		tab.put("Eductation", "Nursery");
		
		System.out.println(tab.get("place"));
		
		
		//----------- Hashtable of Hashtable --------------------------
		
		Hashtable <String, String> tab1 = new Hashtable<String, String>();
		
		tab1.put("City1", "Dubai");
		tab1.put("City2", "Paris");
		tab1.put("City3", "Brussel");
		
		Hashtable<String, Hashtable> tab2 = new Hashtable<String,Hashtable>();
		tab2.put("City1", tab1);
		tab2.put("city2", tab1);
		
		System.out.println(tab2.get("City1").get("City1"));
	}

}
