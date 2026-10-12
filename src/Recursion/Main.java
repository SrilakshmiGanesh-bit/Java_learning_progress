package Recursion;
// oops lamda accessspecifiers 
// use for loop withoutloop
public class Main {
	public void recursion(int n) {
		if(n==11) {
			return ;
		}
		System.out.println(n);
		recursion(n+1);
			
	}
	public void evenodd(int n) {
		if(n==51) {
			return;
		}
		if(n%2==0) {
			System.out.println(n+" even");
		}
		else {
			System.out.println(n+" odd");
		}
		
		evenodd(n+1);
	}
	
	
	public static void main(String[] args) {
		Main main=new Main(); 
		   main.recursion(1);
		   main.evenodd(1);
	}

}
