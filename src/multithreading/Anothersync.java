package multithreading;

public class Anothersync extends Subsync{
	synchronized static void team() throws InterruptedException {
		for(int i=0;i<5;i++) {
		Thread.sleep(1000);
		System.out.println("another sync thread");
	}
	}
}
