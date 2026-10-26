package multithreading;

public class ClassA {
	synchronized  public void team1(ClassB b) {
		System.out.println("Thread 1");
		b.B();
	}
	synchronized public void A() {
		System.out.println("deadlock 1");
	}
	
}
