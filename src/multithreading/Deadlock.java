package multithreading;

public class Deadlock {	
	public static void main(String[] args) {
		ClassA a=new ClassA();
		ClassB b=new ClassB();
		
		Thread t1=new Thread(()->{
			a.team1(b);
		});
		Thread t2=new Thread(()->{
			b.team2(a);
		});
		
		t1.start();
		t2.start();
		
		
	}

}
