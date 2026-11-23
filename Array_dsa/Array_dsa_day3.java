package Array_dsa;

public class Array_dsa_day3 {
	// 2 d arrays
	public static void main(String[] args) {
		print2darr();
		sumofelements();
		rowsum();
		colsum();
		findmax();
		findmin();
		maindiagonal();
		secdiagonal();
	}
		
	
	public static void print2darr() {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	//Sum of all elements
	public static void sumofelements() {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}System.out.println("sum "+sum);

	}
	public static void rowsum() {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr.length;i++) {int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}System.out.println("sum of row "+sum);
		}
			
	}// Column-wise sum
	public static void colsum() {
    int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[j][i];
			}System.out.println("sum of col "+sum);
		}
		
	}
	//Find maximum
	public static void findmax() {
int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
int large=arr[0][0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(large<arr[i][j]) {
					large=arr[i][j];
				}
			}
			
		}System.out.println(large);
		
	}
	// find min
	public static void findmin() {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int small=arr[0][0];
				
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						if(small>arr[i][j]) {
							small=arr[i][j];
						}
					}
					
				}System.out.println(small);
	}
	public static void maindiagonal() {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
				
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						if(i==j) {
							System.out.println(arr[i][j]);
						}
					}
				}
		
	}
	// secondary diagonal

	public static void secdiagonal() {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {//0 1 2
				System.out.println(arr[i][arr.length-1-i]);
				
				
			
		}
		
	}
}
