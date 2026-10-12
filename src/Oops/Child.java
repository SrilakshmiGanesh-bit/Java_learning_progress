package Oops;

import java.util.Scanner;

public class Child extends Parent{
	Scanner sc=new Scanner(System.in);
	void findindex(String index) {
		System.out.println("what index u need to display:");
		int indexnum=sc.nextInt();
		System.out.println("String index:"+ index.charAt(indexnum));
		// here it wont work because we are giving value in scann f where '
		// java didint store that value yet how would it check witht he mermory location
		// in runtime no memory created hence ca=answer will be false only 
		// remove scanner 
		// runtime  no memry, compile time memory
		String names="shree";
		String team="shree";
		
	
	}

}
