package Finalandstatic;

public class Staticclass {
	public static void team() {
		System.out.println("hello");
	}
	public static void team(int a, int b) {
		System.err.println(a+b);
	}
	// for this atleast any one thing shoud be called from that particular class
	// to access static method
	static {
		System.out.println("static withhout any call it will display");
	}

}
