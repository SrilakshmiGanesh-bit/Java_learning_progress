package Collections;

import java.util.TreeSet;

public class Tree {
	// it also follows asc order 
	public void trees(){
	TreeSet<Integer> tree=new TreeSet<Integer>();
	tree.add(10);
	tree.add(40);
	tree.add(30);
    //tree.addFirst(35);
	//tree.addLast(5);
	tree.remove(30);
	tree.first();
	
	System.err.println(tree.size());
	//tree.clear();
	System.err.println(tree);
	System.err.println(tree.first());
	System.err.println(tree.last());
	
	}
	public static void main(String[] args) {
		Tree tree=new Tree();
		tree.trees();
	}
}
