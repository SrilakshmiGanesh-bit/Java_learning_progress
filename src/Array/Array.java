package Array;

import java.util.Scanner;

public class Array {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		// multidimensional array
		threedarray();
	}
	  public static void threedarray() {
//		  int[][][] threedarr=new int [1][][];// 1=> no of block of matrix 2=> row 3=>col
//		  threedarr[0]=new int[2][];
//		  threedarr[0][0]=new int[3];
//		  threedarr[0][1]=new int[2];
//		  // first block first row code and assigned value for the col
//		  // this means first block as matric size 2X3;
//		  threedarr[1]=new int[3][];
//		  threedarr[1][0]=new int[2];
//		  threedarr[1][1]=new int[3];
//		  threedarr[1][2]=new int[4];
//		  // now 2 bllock with matrix 1  and matrix 2 now give value;
//		  System.out.println(threedarr.length);
////		  for(int i=0;i<threedarr.length;i++) {
////			  for(int j=)
//		  }
		  int[][][] threedarr=new int [2][][];
		  System.out.println(threedarr.length);
		  for(int i=0;i<threedarr.length;i++) {
			  
			  System.out.println("Enter the number of rows of block "+i);
			  int rowblock=sc.nextInt();
			  }
			  
		  
	  for(int i=0;i<threedarr.length;i++) {
		  
		  System.out.println("Enter the number of col of block "+i);
		  int rowblock=sc.nextInt();
		  }
		  
	  }
		  
	 

}
