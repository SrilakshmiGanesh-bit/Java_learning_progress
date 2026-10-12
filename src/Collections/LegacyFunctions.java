package Collections;

import java.util.Hashtable;
import java.util.Vector;

public class LegacyFunctions {
	// synchronized 
	// teu ae interfaces tothe original dsa 
	// arryalist linkekd list and vecotr only has the index predefined methods
	
	
	public void vector() {
		// legacy function of arraylist
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(25);
		vector.add(30);
		vector.add(90);
		vector.addElement(20);
		vector.add(30);
		System.out.println(	vector.indexOf(30));// gives first index where the num appeared first
		System.out.println(vector.lastIndexOf(30));// gives the last index where the num appeared last
		System.out.println(vector);
	}
	
	public void hashTable() {
		// legacy fruntion of map
	    Hashtable<Integer, String> hashtable=new Hashtable<Integer, String>();
	    hashtable.put(10,"shreee");
	    hashtable.put(20, "gayu");
	    hashtable.put(30, "Kumar");
	    hashtable.put(40, "shree");
	    hashtable.remove(20);
	    hashtable.put(30, "krish");
	    hashtable.replace(10, "gayu");
	    
	    System.err.println(hashtable);
		
	}
	public static void main(String[] args) {
		LegacyFunctions l=new LegacyFunctions();
		l.vector();
		l.hashTable();
		
		
	}

}
