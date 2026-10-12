package Oops;

public class Interfaceimplement implements Interfaces ,Hide {
	// error wil show until u define the logic that u have declared in the interfacejava
	// only public give when method definition;
	// interface are default public hence no ned of givng it as public
	public void add() {
		System.out.println("hello world");
		
	}
	public void team(String name) {
		System.out.println(name);
	}
	@Override
	public void team() {
		// TODO Auto-generated method stub
		System.out.println("fun");
	}

}
