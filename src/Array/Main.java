package Array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int[] arr=new int[10];
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("enter your num "+i);
//			arr[i]=sc.nextInt();
//		}
//		for(int arrs:arr) {
//			System.out.println("displayed value "+arrs);
//		}
//		
//		String[] products= {"apple","chair","computer","table","keyboard","speakers","television","phone","car","bike"};
//		for(int i=0;i<products.length;i++) {
//			System.out.println("product num " +(i+1)+" " +products[i]);
//		}
	
	//2d array
//		System.out.println("enter your row");
//		int row=sc.nextInt();
//		System.out.println("Enter your col");
//		int col=sc.nextInt();
//	int [][] a=new int [row][col];
//	for(int i=0;i<row;i++) {
//		for(int j=0;j<col;j++) {
//			System.out.println("Enter num for index row "+i+" col "+j);
//			a[i][j]=sc.nextInt();
//			
//		}
//	}
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.println("index"+"row"+i+"col"+j+"="+a[i][j]);
//			}
//		}
		
		
		//jagged array 
		
		
		//row and colum of diff sizes => row constant col will vary
		int[][] value=new int[3][];	
		//seperately giving value for each col
		value[0]=new int[2];
		value[1]=new int[3];
		value[2]=new int[1];
		//value[3]=new int[4]; runtime error
		for(int[] jagged:value) {// it traverse each row
			for(int datas:jagged) {// it traerse thoguh each col of row
				System.out.print(datas);
			}
			System.out.println();
		}
	
		String[][] values=new String[3][];
		for(int i=0;i<values.length;i++) {
			System.out.println("enter num of col for row "+i);
			int colsize=sc.nextInt();
			values[i]=new String[colsize];
		}
		for(int i=0;i<values.length;i++) {// 
			for(int j=0;j<values[i].length;j++) {
				System.out.println("row "+i+" col "+j);
				values[i][j]=sc.nextLine();
			}
		}
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values[i].length;j++) {
				System.out.print(values[i][j]+" ");
				
			}System.out.println();
		}
		
	
}
	
}
