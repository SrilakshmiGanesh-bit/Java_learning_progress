package Polymorphism;

public class Calculator {
	 void add(int a, int b) {
	        System.out.println("Addition of 2 integers: " + (a+b));
	    }
	 void add(int a, int b, int c) {
	        System.out.println("Addition of 3 integers: " + (a+b+c));
	    }
	 void add(double a, double b) {
	        System.out.println("Addition of 2 decimal numbers: " + (a+b));
	    }
	 void add(int a, double b) {
	        System.out.println("Addition of integer and decimal: " + (a+b));
	    }
}
