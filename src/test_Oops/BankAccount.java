package test_Oops;

public class BankAccount {
	private long accountnumber;
	private long balance;
//	public BankAccount(long accno, long balance) {
//		this.accno=accno;
//		this.balance=balance;
//	}
	public void setAccno(long accno) {
		this.accountnumber=accno;
	}
	public long getAccno() {
		return accountnumber;
	}
	public void setBalance(long balance ) {
		this.balance=balance;
	}
	public void deposit(long depositamnt) {
		depositamnt+=balance;
		System.out.println(balance);

	}
	public void withdrawal(long withdrawalamnt) {
		if(withdrawalamnt>balance) {
			System.out.println("Withdrawal amount is more that balance");
		}
		else {
			System.out.println("withdraw amnt");
			System.out.println(balance-withdrawalamnt);
		}
	}
}


