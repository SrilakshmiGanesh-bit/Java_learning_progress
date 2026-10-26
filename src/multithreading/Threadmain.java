package multithreading;

public class Threadmain {
	public static void main(String[] args) {
		Thread my=new Thread(()->{
			System.out.println("first");
		});
		my.setPriority(5);
		// use only 1 to 10 priotiry rangn ffrom low to high
		
		
		Runnable myinterface=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("second");
			}
			
		};
		Thread my1=new Thread(myinterface);
		
		Thread my2=new Thread(()->{
			System.out.println("third");
		});
		my2.setPriority(1);
my1.setPriority(10);

		my.start();
		my1.start();
		my2.start();
		
		
	}

}
