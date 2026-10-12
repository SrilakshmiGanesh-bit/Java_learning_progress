package Collections;

import java.util.HashSet;

public class Set {
	public void hashset(){
		
		// we can only remove using data not  useing index
		HashSet<Integer> hashset=new HashSet<>();
		hashset.add(20);
		hashset.add(25);
		hashset.add(10);
		hashset.add(20);
		System.out.println(hashset);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new Set();
		set.hashset();
	}

}
