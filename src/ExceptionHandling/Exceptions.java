package ExceptionHandling;

public class Exceptions {
	// exception is general if runtime exception means use RuntimeException or mre specific use the particular exveption
	// checked exception => occurs in compile time red color is that
	// unchecked exception=> occurs during running of program
	public static void main(String[] args) throws Exception  {
		try {
		int  arr[] =new int[2];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;// this will give exception inorder to prevent it form stoping hte program we use exception handling
		for(int arrs:arr)
		System.out.println(arrs);
		}
		catch(RuntimeException e) {
			System.out.println(e);//if only msg nneded use e.getmessage
			System.out.println(e.getMessage());
		}
		System.out.println("not stopped");
		
		//null point exception
		try {
		String name=null;
		System.out.println(name.length());// gives error becoz null has no lenght
		}
		catch(NullPointerException e){
			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
		}
		
		try {
			String name="shree";
			System.out.println(name.charAt(6));//  
			}
			catch(Exception e){
				System.out.println(e);
				System.out.println(e.getLocalizedMessage());
			}
		try {
			int a=10/0;
			System.out.println(a);// gives error becoz null has no lenght
			}
			catch(Exception e){
				System.out.println(e);
				System.out.println(e.getLocalizedMessage());
			}
		try {
		String data="10s";
		int no=Integer.valueOf(data);
		System.out.println(no);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Bank bank=new Bank();
		bank.bank(0);
		
	}
	
	
}
