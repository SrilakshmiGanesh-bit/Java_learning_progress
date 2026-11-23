package Array_dsa;

import java.util.Scanner;

public class Array_dsa_day5 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
//		leftrotate1();
//		rightrotate();
//		kthrotationright();
//		kthleftrotation();
		moveZerosToEnd();
		movezerobeginning();
		
		
		
	}
	public static void leftrotate1() {
			int[] a= {1,2,3,4,5};
			int temp=a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
			for(int arr:a) {
				System.out.print(arr);
			}
			System.out.println();
		}
	public static void rightrotate() {
		int[] a= {1,2,3,4,5,6};//612345
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		for(int arr:a) {
			System.out.print(arr);
		}
		
		
		}
	public static void kthrotationright() {
		int[] a= {1,2,3,4,5,6,7};
		System.out.print("Enter the number of rotation u want:");
		int rotation=sc.nextInt();
		int k=rotation%a.length;
		for(int i=0;i<k;i++) {
			int temp=a[a.length-1];//7

			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
			
			
		}for(int arr:a) {
			System.out.print(arr);
		}	
	}
	public static void kthleftrotation() {
		int[] a= {1,2,3,4,5,6,7};//3456712
		System.out.println("enter number of times rotate left:");
		int rotate=sc.nextInt();//
		int k=rotate%a.length; //2%7
		for(int i=0;i<k;i++) {
			int temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];   // here 2,3,4,5,6,7
			}
			a[a.length-1]=temp;
		}
		for(int arr:a) {
			System.out.print(arr);
		}
	
		
	}
	public static void moveZerosToEnd() {
	    int[] a = {0, 1, 0, 3, 12};
	    int j=0;
	    for(int i=0;i<a.length;i++) {// i scans each elements
	    	
	    		if(a[i]!=0) {
	    			a[j]=a[i];
	    			j++;
	    		}
	    		
	    	}
	    for(int i=j;i<a.length;i++) {
	    	a[i]=0;
	    }
	    
	    for(int arr:a) {
	    	System.out.println(arr);
	    }

	    // your logic
	}
	public static void movezerobeginning() {
		int[] a= {1, 0, 3, 0, 5, 6};
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				int temp=a[i];
				for(int k=i;k>j;k--) {
					a[k]=a[k-1];//
				}
				a[j]=temp;
				j++;
				
			}
		}
		System.out.println("moves zero first");
		for(int arr:a) {
			System.out.println(arr);
		}
	}
}
