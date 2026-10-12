package Classinterface;

public class Main {
	public static void main(String[] args) {
		Interface interfaces=new Child();
		interfaces.Stringlen("hello");
		Parent parent=new Child();
		System.out.println(parent.StringAdd(5, 10));
	}

}
