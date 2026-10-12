package AccessModifiers;

public class Privates {
	private String thing="pen";
	 void privatemethod() {
		 System.out.println("private method");
	 }
	 public static void main(String[] args) {
		 Privates t=new Privates();
		 t.privatemethod();
		 
	 }
}
