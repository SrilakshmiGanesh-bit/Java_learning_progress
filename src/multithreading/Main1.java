package multithreading;

public class Main1 {
	public static void main(String[] args) throws InterruptedException{
	Order order=new Order();
	Shopping shop=new Shopping();
	Location location=new Location();
	order.start();
	order.join();
	shop.start();
	shop.join();
	location.start();
	location.join();
	System.out.println("order has been delivered");
	}

}
