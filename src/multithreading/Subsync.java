package multithreading;

public class Subsync {
	synchronized void team1() throws InterruptedException {
		
		System.out.println("first  thread");
		Thread.sleep(1000);
	}
	synchronized void team2() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("Second thread");
			Thread.sleep(1000);
		}
	}
	
	synchronized void team3() throws InterruptedException {
		System.out.println("third  thread");
		Thread.sleep(1000);
	}
	void normal() {
		System.out.println("normal");
	}
	public static void main(String [] args) throws InterruptedException {
		Subsync sub=new Subsync();
		
		Thread s1=new Thread(()->{
			try {
				sub.team1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		Thread s2=new Thread(()->{
			try {
				sub.team2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		Thread s3=new Thread(()->{
			try {
				sub.team3();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		// another sync when u creae an object and create thread and execure=> it will not be synchronized
//		Anothersync another=new Anothersync();
//		Thread s4=new Thread(()->{
//			try {
//				another.team();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		});// it becomes unsyncrhonized to avoid this
		// when we want to use two classs use inheri teh class so that do notcreate obj for it and use 
		// this will be synchronized
		Thread s4=new Thread(()-> {
			try {
				Anothersync.team();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		
		
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}
	
}
