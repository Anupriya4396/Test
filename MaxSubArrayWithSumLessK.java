import java.util.*;

class MaxSubArrayWithSumLessK{

	public static int maxSubArray(int array[], int k){
		int array1[][] = new int[array.length][array.length];
		for(int i=0; i<array.length; i++){
			array1[i][i] = array[i];
}
		for(int i=0; i<array.length; i++){
			for(int j = i+1; j<array.length; j++){
				array1[i][j] = array1[i][j-1] + array1[j][j];
}
}
		int count=array.length;
		for(int i=0; i<array1.length; i++){
			for(int j=0; j<array1.length; j++){
				if(array1[i][j]>=k){
					if(j-i < count){
						count = j-i;
}
}
}
}
		return count;
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n = sc.nextInt();
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the array:");
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
}
		int ans = maxSubArray(array, k);
		System.out.println(ans + " is the length of the maximum subarray with length less than k");
}
}