package Collections;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {
	public void Hashmap() {
		
		// we create as a key value pair
		// value can be duplicated
		// key should be unique
		// it will overwrite the current key value
		HashMap<Integer, String> product=new HashMap<Integer, String>();
		product.put(1, "pen");
		product.put(2,"pencil");
		product.put(3, "box");
		product.put(1,"scale");
		product.remove(1);
		System.out.println(product);
		System.out.println(product.containsKey(2));
		System.out.println(product.containsValue("box"));
		System.out.println(product.isEmpty());
		System.out.println(product.get(3));
		System.out.println(product.replace(3, "Table"));
		System.out.println(product.put(4, "chair"));
		System.out.println(product.size());
		System.out.println(product.values());// gives all value withot keys
		//product.clear();
		System.out.println(product);
		for(Integer key:product.keySet()) {
			System.out.println("key:"+key);
		}
		for(String value:product.values()) {
			System.out.println("Value:"+value);
		}
		System.out.println("check"+product.entrySet());

			
	}
	public void Hashtree() {
		//tree=>sorting purpose follows order
		// asc order based on the key if what u want inorder give it as key
		// hashtree does not allow dupliates
		TreeMap<String,Integer> student=new TreeMap<String	, Integer>();
		student.put("kumar",20000);
		student.put("shree", 200);
		student.put("hari", 300);
		System.out.println(student);
		System.out.println(student.firstKey());
		System.out.println(student.lastKey());
		System.out.println(student.values());
		System.out.println(student.keySet());
		System.out.println(student.containsKey("shree"));
		System.out.println(student.remove("hari", 300));
		TreeMap<Integer,String> std=new TreeMap<Integer,String>();
		std.put(1, "shree");
		std.put(4, "krish");
		std.put(5, "laskhmi");
		std.put(2,"anu");
		std.put(3, "kumar");
		System.out.println(std);// asc order based ont he reg no;
		
	}
	
	
	
	
	public static void main(String[] args) {
		Map map=new Map();
		map.Hashmap();
		map.Hashtree();
	}

}
