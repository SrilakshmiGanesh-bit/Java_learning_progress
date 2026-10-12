package Lamda;
// it is not lamda fuction it is definition for interface  in main class
public class Main {
	public static void main(String[] args) {
		interfaces team= (int a,int b)->{
			System.out.println("hello");
			return a+b;
			
		};
		System.out.println(team.add(5,6));
		
		Multiply multi =(int a,int b)->(a*b);
		System.out.println(multi.multi(5, 2));
		
		
		Print print=()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Lamda function => "+i);
			}
		};
		print.prints();
		
		
//	// we can also create by new obj 
		// interfaces inter=new interfaces(){
		
//	{
//		@Override
//		public void add() {
//			System.out.println(5+8);
//		}
//		
//			
//		};
//		
//	}
}
}
