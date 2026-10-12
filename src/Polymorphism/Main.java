package Polymorphism;

public class Main {
	 public static void main(String[] args) {
		 // compile time (overloading)

	        Calculator c = new Calculator();

	        c.add(10, 20);
	        c.add(10, 20, 30);
	        c.add(10.5, 20.5);
	        c.add(10, 20.5);
	    
	 // runtime (overriding)
//	 Animal dog=new Dog();
	        Dog dog=new Dog();
	 dog.sound();
	 
	 dog.types();
	 
	 
	 Animal cat=new Cat();
	 cat.sound();
	 
	 
	  
 }
}
