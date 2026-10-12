package Oops;

public interface Interfaces {
	// we need a implement class for this interface
	public void add();
	public void team();
	// cannot create constructor 
	// we can only declare the methods
	// to d
	// private we can define method, but we can only call in same class
	private void team(String Name) {
		System.out.println("Name");
	}
	default void run() {
		System.out.println("run");
	}
	static void funny() {
		System.out.println("funny");
	}
	// static is a keyword 
	

}
