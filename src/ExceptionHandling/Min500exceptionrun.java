package ExceptionHandling;

public class Min500exceptionrun  extends RuntimeException{
	//error should be handled when the object is created
	public Min500exceptionrun(String message) {
		
		super(message);
		System.out.println("check");
		
	}

}
