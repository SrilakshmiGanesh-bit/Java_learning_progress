package Conditions;

import java.util.Scanner;

public class Switch {
	
	
	public void  switchcase() {
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		int result=0;

		do {
		System.out.println("calculator app");
		System.out.println("1 to add, 2 to sub 3 to mul and 4 to div");
		System.out.print("Enter your options");
		int value1;
		int value2;
		switch(choice){
		
		case 1:
			System.out.println("Addition");

			System.out.println("val1");
			value1=sc.nextInt();
			System.out.println("val1");
			value2=sc.nextInt();
			result= value1+value2;
			break;
		case 2:
			System.out.println("Subtraction");

			System.out.println("val1");
			value1=sc.nextInt();
			System.out.println("val1");
			value2=sc.nextInt();
			result= value1-value2;
			break;
		case 3:
			System.out.println("Multiplication");

			System.out.println("val1");
			value1=sc.nextInt();
			System.out.println("val1");
			value2=sc.nextInt();
			result= value1*value2;
			break;
		case 4:
			System.out.println("Devision");

			System.out.println("val1");
			value1=sc.nextInt();
			System.out.println("val1");
			value2=sc.nextInt();
			result= value1/value2;
			break;
		case 0:
			System.out.println("application is stopped");
			break;
		default:
			System.out.println("Invalid operator");
			
// break willjust break the condition
			// return will stop the entire method
			
		}
		}while(choice!=0);
		
		
		
		
	}
	public static void loop() {
		//for(int i=0;i<10;i++) {
			//;// here the first line after loop will be executed without block
	//	System.out.println(i);// this will not because i is only for the for loop
		
	
	
	int n=10;
	while(n>0) {
		if(n==6) {
			n--;
			continue;
			
		}
		System.out.println(n--);
		
	}
	// enhanced for loop 
	// for gettign datas from backed u can usee enhanced for loop
	// used for array lists\
	
	
	// String
	
	String s="shree";
	for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i));
	}
	
	String[] names= {"shree", "anu", "krish", "mano"};
	for(String ss:names ) {
		System.out.println(ss);
	}
	
	}
}

