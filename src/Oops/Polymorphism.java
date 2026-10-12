package Oops;

import java.util.Scanner;

public class Polymorphism {
	// method loading=> identify based ob sign means datatypes
	// perform in same class
	void arithmetic() {
		Scanner sc=new Scanner(System.in);
		System.out.println("value 1");
		int a=sc.nextInt();
		System.out.println("value 2");
		int b=sc.nextInt();
		
		System.out.println(a+b);
		
	}
	void arithmetic(int a, int b) {
		System.out.println("sub"+(a-b));
	}
	void arithmetic(float  a, float b) {
		System.out.println("div"+(a/b));
	}
	
	void arithmetic(int a, int b, int c) {
		System.out.println("result:"+(a+b+c));
	}
}
