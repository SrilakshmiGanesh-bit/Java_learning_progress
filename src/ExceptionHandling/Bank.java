package ExceptionHandling;

public class Bank {
public void bank(int balance) {
	try {
		if(balance==0) {
			System.out.println("zero balance");
		}
		else if(balance<500) {
		throw new Min500exceptionrun("Your balance is below 500");
	}
	else {
		System.out.println("your balance is above 500");
	}
	}
	catch(Min500exceptionrun e) {
		System.out.println(e);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
}
}
