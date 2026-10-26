package multithreading;

public class Shopping extends Thread {
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Order has been made in the shop");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
