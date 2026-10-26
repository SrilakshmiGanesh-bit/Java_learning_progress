package multithreading;

public class Order extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Order has been placed");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
