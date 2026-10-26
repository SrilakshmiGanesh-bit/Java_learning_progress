package multithreading;

public class Location extends Thread{
	public void run(){
		try {
			Thread.sleep(3000);
			System.out.println("delivery partner has took your order from shop");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		try {
			Thread.sleep(5000);
			System.out.println("Delivery partner reached your location");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
