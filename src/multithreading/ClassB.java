package multithreading;

public class ClassB {
	synchronized  public void team2(ClassA a) {
	   System.out.println("thread 2");
	   a.A();
   }
	synchronized public void B() {
		System.out.println("deadlock 2");
	}
}
