package Collections;

public class Bank {
	private String accname;
	private double balance;
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank(String accname, double balance) {
		super();
		this.accname = accname;
		this.balance = balance;
	}
	public void display() {
		System.out.println("name "+accname+" acc balance"+balance);
	}
	
	

}
