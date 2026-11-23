package Array_dsa;


public class Array_day3 {
	
	public static void main(String[] args) {
		leftrotation1();
		rightrotation1();
		rightrotation2();
		leftrotationk();
		leftrotationkmorthanlenght();
		sumoftwo();
	}
	// left rotation by one
	public static void leftrotation1() {
		System.out.println("hello");
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println(arr.length);
		// logic first element becmes  last
		// sencond element comest first 
		// all other all b]pushd to the empt positons
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {//arr[1]
			//temp=10;
			 
				arr[i]=	arr[i+1];
				
		}
				arr[arr.length-1]=temp;
				for(int arrs:arr) {
					System.out.println("arr is "+arrs);
				
			
		}		
	}
	public static void rightrotation1() {
		int[] arr = {10, 20, 30, 40, 50};
		int temp=arr[arr.length-1];// temp=50;
		for(int i=arr.length-1;i>0;i--) {// i=4; 4>0;4--
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		for(int arrs:arr) {
			System.out.println("right rotation1"+arrs);
		}
		
	}
	public static void rightrotation2() {
		int[] arr = {10, 20, 30, 40, 50};
		int temp=arr[arr.length-1];// last position
		for(int j=0;j<2;j++) {
		for(int i=arr.length-1; i>0;i--) {
			arr[i]=arr[i-1];
			}
		arr[0]=temp;
		temp=arr[arr.length-1];
		}
		for(int arrs:arr) {
			System.out.println("right rotation2"+arrs);
		}		
	}
	
	public static void leftrotationk() {
		int [] arr= {10,20,30,40,50};
		int temp=arr[0];
		int k=2;
		for(int j=0;j<k;j++) {
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=temp;
		temp=arr[0];
		}
		for(int arrs:arr) {
			System.out.println("left rotaiton k"+arrs);
		}
	}
	// for effective k value more than array lenght we can use formula
	//effectiverotation=k%arr.length;
	public static void leftrotationkmorthanlenght() {
		int [] arr= {10,20,30,40,50};
		int temp=arr[0];
		int k=7;
		int effrotation=k%arr.length;
		
		for(int j=0;j<effrotation;j++) {
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=temp;
		temp=arr[0];
		}
		for(int arrs:arr) {
			System.out.println("7th rotation"+arrs);
		}
	}
	// sum of two eleement in an array =11
	public static void sumoftwo() {
		int[] arr = {4, 7, 2, 7, 9};
		int sum=11;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==11) {
					System.out.println("The elements with sum 11 are "+ arr[i]+"  " +arr[j]);
				}
			}
		}
		
	}
	
	

	

}








