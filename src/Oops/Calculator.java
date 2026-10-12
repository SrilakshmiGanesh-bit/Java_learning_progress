package Oops;

public class Calculator {
	// constructor
    Calculator(int data1, int data2){
		System.out.println("Add data using constructor"+ data1+data2);
	}
	int add(int a,int b) {
		return a+b;	
	}
	float sub(float a, float b) {
		return a-b;
	}
	double div(int a, int b) {
		return a/b;
	}
	int multi(int a , int b) {
		return a*b;
	}
	
	String AddtwoString(String a, String b) {
		return a+b;
	}
	static void message() {
		System.out.println("thankyou");
	}

}
