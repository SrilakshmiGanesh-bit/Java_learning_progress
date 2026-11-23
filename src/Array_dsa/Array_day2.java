package Array_dsa;

public class Array_day2 {
	
	public static void main(String[] args) {
		
Print();
SumAverage();
Largenum();
Countevenodd();

search(25);
reversearray();
secondLargest();
dupsecondlarge();
targetappear();
repeat();
firstrepeat();
int[] result=createArray();
System.out.println(result);


	}
	static void  Print() {
		int[]  arr= {10, 20, 30, 40, 50};
		for(int arrs:arr) {
			System.out.println(arrs);
		}
	}
	// Calculate the sum and average
	static void SumAverage() {
		int[] arr= {15, 25, 35, 45, 55};
		int sum=0;
		double avg=0;
		for(int arrs:arr) {
			sum+=arrs;
		}
		avg=(double)sum/arr.length;
		System.out.println("Sum "+sum+"Average"+avg);
	}
	//Find the largest number
	static void Largenum() {
		int[] arr={34, 12, 78, 56, 23};
		int large=arr[0];
		for(int arrs:arr ) {
			if(large<arrs) {
				large=arrs;
				
			}
			
			
		}
		System.out.println("the largest num is "+ large);
	}
	//Task 4: Count even and odd numbers
	public static void Countevenodd() {
		int[] arr={11, 20, 33, 42, 55, 60};
		int even=0;
		int odd=0;
		for(int arrs:arr) {
			if(arrs%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Even:"+even+" odd"+odd);
	}
	// Linear search
	public static void search(int target) {
	int index=-1;
	
	int[] arr1 = {5, 12, 18, 25, 31};
	for(int i=0;i<arr1.length;i++) {
		if(arr1[i]==target) {
			index=i;
			break;
		}
	}System.out.println("the index is "+ index);
	}
	// reverse an array
	public static void reversearray() {
	int[] arr = {10, 20, 30, 40, 50};
	for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]);
	}	
	}
	//second largest
	static void secondLargest() {
		int[] arr = {10, 25, 8, 40, 30};
		int large=arr[0];
		int secondlarge=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(large<arr[i]) {// 10<25 large=>25; secodnlarge=10, =>25<8=false; now elseifrun
				secondlarge=large;// nowi=3; 25<40 true secondlarge=25; large=40 
				large=arr[i];  //  now i=4; 40<30 flase noow elsleif
				
			}
			else if(secondlarge<arr[i]) {// 10<8 false 8 skipped next loo[ starts
				secondlarge=arr[i];// 25<30 true now secondlarge becomes 30
			}
			// there is a problem in this elseif here if the array has same element it wont check that see this4
			/*
			 * else if(secondlarge<arr[i] && arr[i]<large) {// 10<8 false 8 skipped next loo[ starts
				secondlarge=arr[i];// 25<30 true now secondlarge becomes 30	
			}
			 */
		}
		System.out.println("largest is "+large+" second large is "+ secondlarge);
		
	}
	public static void dupsecondlarge() {
		int[] arr = {10, 40, 40, 25, 30};
		int large=arr[0];
		int secondlarge=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(large<arr[i]) {// 10<25 large=>25; secodnlarge=10, =>25<8=false; now elseifrun
				secondlarge=large;// nowi=3; 25<40 true secondlarge=25; large=40 
				large=arr[i];  //  now i=4; 40<30 flase noow elsleif
				
			}
			else if(secondlarge<arr[i] && arr[i]<large) {// 10<8 false 8 skipped next loo[ starts
				secondlarge=arr[i];// 25<30 true now secondlarge becomes 30
			}
		}		System.out.println("largest is "+large+" second large is "+ secondlarge);

	}
	public static void targetappear() {
		int[] arr = {5, 12, 5, 25, 5, 31};
		int target = 5;
		int c=0;
		for(int arrs:arr) {
			if(arrs==target) {
				c++;
			}
		}System.out.println("the target "+ target+" has appeared " +c+" times");
	}
	public static void repeat() {
		int[] arr = {4, 7, 2, 7, 9, 4};
		int firstrepeat = -1;
		for(int i=0;i<arr.length;i++) {//4 , 7
			for(int j=i+1;j<arr.length;j++) {//7,2
				if(arr[i]==arr[j]) {// 4==7=>false, 4==2 false, 4==2 false 4==7 false 4==9 false 4==4 true 
					firstrepeat=arr[i];
					System.out.println(" repeat is "+firstrepeat);
					break;
				}
			}break;
		}
	}
	public static void firstrepeat() {
		int[] arr = {4, 7, 2, 7, 9, 4};
		int firstrepeat = -1;
		int indexdiff=0;
		for(int i=0;i<arr.length;i++) {//4
			for(int j=i+1;j<arr.length;j++) {//
				if(arr[i]==arr[j]) {// 4==4 true 7==7 
					if(indexdiff<(j-i)) {// if(0<(5-0) true  if(5<(3-1))false // else if
					firstrepeat=arr[i];// firstrpeat=4
					indexdiff=(j-i);//indexdiff=5
					}
					else {
						indexdiff=(j-i);// index diff(3-1)==2
						firstrepeat=arr[i];// first repeat==7
						
					}
				}
			}
		}
	
			System.out.println("first repeat is "+ firstrepeat);
		
		
	}
	public static int[] createArray() {
		int[] arr= {1,2,3,4,5,6,7};
		return arr;
	}
	
	
}
	



