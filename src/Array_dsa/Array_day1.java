package Array_dsa;

public class Array_day1 {
	
	
	
	public static void main(String[] args) {
		int[] n= {1,2,3,4,5,6,7,88,9};
		//traversing an array
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		// adding array element
		int sum=0;
		for(int i=0;i<n.length;i++) {
			sum+=n[i];
		}
		System.out.println("sum is "+sum);
		int[] numbers = {12, 5, 27, 3, 19};
		int small=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(small>numbers[i]) {
				small=numbers[i];
			}
			else {
				small=small;
			}
		
			
		}	System.out.println("smallest is "+small);
	
	
	//Write the complete Java code to find how many times 25 occurs.
	int[] num = {10, 25, 7, 40, 15, 25};
	int count=0;
	for(int i=0;i<num.length;i++) {
		if(num[i]==25) {
			count++;
		}
	}
	System.out.println("count is "+count);
	
//count the even number
	int[] number = {12, 7, 4, 9, 16, 21, 8};
	int cnt=0;
	for(int i=0;i<number.length;i++) {
		if(number[i]%2==0) {
			cnt++;
		}
	}System.out.println("Count of even number is "+ cnt);
	
	
	// sum of even numbers only
	
	int[] numb = {10, 25, 8, 31, 42, 17, 6};	
	int sumofEven=0;
	for(int i=0;i<numb.length;i++) {
		if(numb[i]%2==0) {
			sumofEven+=numb[i];
		}
	}System.out.println("Count of even number is "+ sumofEven);
	
	
	//Average
	
	int[] marks = {10, 20, 15, 25, 30};
	
	double sums=0;
	for(int i=0; i<marks.length;i++) {
		sums+=marks[i];
	}
	System.out.println(sums);
	System.out.println("Average is "+ (sums/marks.length));
	
	// 2. Difference between largest and smallest
	
	int[] values = {14, 7, 25, 3, 18};
	int largest=values[0];
	int smallest=values[0];
	for(int i=0; i<values.length;i++) {
		if(largest>values[i]) {
			largest=largest;
		}
		else {
			largest=values[i];
		}
	}
	for(int i=0; i<values.length;i++) {
		if(smallest<values[i]) {
			smallest=smallest;
		}
		else {
			smallest=values[i];
		}
	}
	System.out.println("diff betweeen largest and smallest is "+ (largest-smallest));
	
	
	//Count number greater than 10
	int[] numbs = {5, 12, 8, 20, 15, 3, 25};
	int c=0;
	for(int i=0;i<numbs.length;i++) {
		if(numbs[i]>10) {
			c++;
		}
		
	}System.out.println("count greater that 10"+ (c));
	
	
//	 4. Find the first number divisible by 5
	int[] data = {7, 13, 22, 15, 8, 20};
	System.out.println(
            "First number divisible by 5: " + displaydivby5(data)
        );
    

	
	
}
	
	static int displaydivby5(int[] data) {
		for (int i = 0; i < data.length; i++) {
            if (data[i] % 5 == 0) {
                return data[i];
            }
        }
		return -1;
	}
}