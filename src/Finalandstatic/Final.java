package Finalandstatic;
//final static
// final is the final value we cannot change value at any point even inside same class
// we cannot inhert overload;
public final class Final {
	final String salary="45000";
	public final void finalmethod() {
		// we cannot reassign anywhere 
		System.out.println(salary);
	}

	public void finalmethod(int a) {// here method name is same but parameter diff hence consider as diff method
		System.out.println(a);// this is method overloading
	}
}
