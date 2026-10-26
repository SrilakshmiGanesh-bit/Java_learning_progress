package multithreading;
//interface
public class Joins implements Runnable {
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("order confirmed");
		}catch (InterruptedException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
			System.out.println("order confirmed");
		}catch (InterruptedException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
