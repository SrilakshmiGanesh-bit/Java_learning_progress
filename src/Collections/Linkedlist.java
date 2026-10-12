package Collections;

import java.util.LinkedList;

public class Linkedlist {
	// arrylist is fast access eleemnt ia index, insertion deletion is slow
	// ll is slow sequentially for head to  tail, it is fast for only requireds changing pointers
	// LL 2 nodes info and address 
	// ll has 2 nodoes fast for insertion and deletion
	// arraylist is fast for viewing the element
	public void linedlists() {
		LinkedList<Integer> link=new  LinkedList<Integer>();
		link.add(10);
		link.add(25);
		link.add(30);
		link.contains(5);
		System.out.println(link);
	}
	
	public static void main(String[] args) {
		Linkedlist link=new Linkedlist();
		link.linedlists();
		
		
	}
}
