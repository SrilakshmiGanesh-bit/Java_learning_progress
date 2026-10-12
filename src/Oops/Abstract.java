package Oops;

public abstract class Abstract {
	// abstract is partially hidden
	// we can write both hidden and normal method
	// hidden
	abstract void hide();// hidden method used to write info which should  not be shared
	// non hidden 
	void reg() {
		System.out.println("acno:2525225");
	}

}
