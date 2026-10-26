package multithreading;

public class Mythread extends Thread{
	void loop10(int value) {
		for(int i=1;i<value;i++) {
			
			try {
				System.out.println("normal method "+i);
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
			
		}
		
	}
	//overrideen thread method
	// for one class we can create only one thread only override one time 
	// after one time it will show duplicates
	
	public void run() {
		for(int i=1;i<10;i++) {
			try {
				Thread.sleep(2000);
				System.out.println("thread method"+i);
			}catch(InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}
