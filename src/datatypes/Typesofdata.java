package datatypes;

import java.util.Scanner;

public class Typesofdata {
	public void comparision() {
		int a=30,b=30;
		System.out.println(a==b);
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);
	}
	void logicaloperator() {
		int a=10,b=20;
		System.out.println(a>=b && a==b);
		System.out.println(a==b || a>=b);
	}
	void bitwiseoperator() {
		int a=7, b=5;
		String c="s";
		System.out.println("add gate:" + (a&b) ); // it will add the ascii value
		System.out.println("or gate:"+ (a|b));
		System.out.println("xor gate:"+(a^b));
		System.out.println("xor gate:"+ (a<=b ^ a==b));
		// we can find ascii code
		System.out.println(c.codePointAt(0));		
	}


// increement and decrement operators

public void increment() {
	int a=90;
	System.out.println(a++);
	System.out.println(a);
	System.out.println(++a);
	System.out.println(a--);
	System.out.println(a);
	System.out.println(--a);
	
	
}
}
	// bring id tomorrow otherwise avlothan

	
	
	
	
	
	
	
	
	
	
	// 4 method calling 
		// default
//		void primitive() {
			// primitive non primitive  datatypes
				// primitive=> byte int boolean long short float double char
				// primitive=>numbers => integers
//				byte age=100; // size -128 to +127
//				System.out.println(age);
//				short noofdays=365;
//			    System.out.println(noofdays);
//				int pincode=626132;
//				System.out.println(pincode);
//				long phoneno=8072073015l;
//				System.out.println(phoneno);
//				// primitive=> double, float
//				float mark=95.8085f;// 6-7 point digits precision
//				System.out.println(mark);
//				double salary=9595955.255455555555d; // has 15 to 16 precision
//				System.out.println(salary);
//				
//				// primitive=>non numberic , boolean , char
//				//boolean
//				boolean pass=true;
//				System.out.println(pass);
//				char a='a';
//				System.out.println(a);
//		}
		
//		void addtwostring() {
//			Scanner sc=new Scanner(System.in);
	//
//			System.out.println("enter string1");
//			String name=sc.nextLine();// if u give only next means it will give u only before space 
//			System.out.println("enter string2");
//			int age=sc.nextInt();
//			sc.nextLine(); /// when having string+int+string
////			System.out.println(name+age);
//			System.out.println("enter clg");
//			String clg=sc.nextLine();
//			System.out.println(name+age+clg);
//		}
//		void multiply() {
//			double a=7,b=3;// use double because if any / or % value comes in point;
////			System.out.println(a*b);
//			System.out.println(b/a);
////			System.out.println(a%a);
//			
//		}
	//	
		// assignmentoperators=> +=,-+,*=,/+,=
		
//		public void total() {
//			int amount=100;
//			amount=50;//50
//			amount+=100;//150
//			amount-=30;//120
//			amount*=2;//240
//			amount /=2;//120
//			amount%=9;//3
//			
//			System.out.println(amount);
//		}
//			// comparison operator
		
	
