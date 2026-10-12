package Oops;

public class Bank_encapsulatio {
	 Bank_encapsulatio(){
		
	}
	// encapsulation
	private long accno;
	private double balance;
	private int pin;
	// 3 way to collect 
	// set=> method=particular give
	// constructor=> all give
	// value to set
	
	// write a setter function for accno
	public void setAccno(long accno) {
		// same variable assing or same spelling means use this
		this.accno=accno;		
	}
	public long getAccno() {
		return accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setPin(int pin) {
		this.pin=pin;
	}
	public int getPin() {
		return pin;
	}
	public Bank_encapsulatio(long accno, double balance, int pin) {
		this.accno=accno;
		this.balance=balance;
		this.pin=pin;
	}// call this innmain class
	

}
