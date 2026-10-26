package multithreading;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		Mythread mythread=new Mythread();
		// first should give thhe thread class
		mythread.run();// operates like normal method
//		we havve to use start to run the thread method
		mythread.start();// this will provide asynchrocised 
////		mythread.join();
//		
		Joins join=new Joins();
		if(mythread.isAlive()) {
			System.out.println("thread is running");
		}
		
		Thread thread=new Thread(join);
		thread.start();
		mythread.join();// joins kkodutha munnadi ullathu full ah complete aanathuku arom than next code execute panum
		if(mythread.isAlive()) {
			System.out.println("thread is running");
		}
//		
//	
		mythread.loop10(11);
		System.out.println("thankyou");
	
		
		
		
	}
}
