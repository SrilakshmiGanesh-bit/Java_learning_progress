package JavaEncapsulation;

public class Encapsulation {
	public Encapsulation(){
		
	}
	private long accountnum;
	private long balance;
	
	public void setAccnum(long accountnum) {
		this.accountnum=accountnum;
	}
	public long getAccnum() {
		return accountnum;
	}
	public void setBalance(long balance) {
		this.balance=balance;
	}
	public long getBalance() {
		return balance;
	}
	
	
	public Encapsulation(long accountnum, long balance){
		this.accountnum=accountnum;
		this.balance=balance;
	}

}
