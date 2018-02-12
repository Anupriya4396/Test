import java.util.*;

class MaxSum{

	static int findMax(int arr[]){
		int sum1, sum2=0, new_sum=0;
		sum1 = arr[0];
		for(int i=1; i<arr.length; i++){
			new_sum = sum2 + arr[i];
			sum2 = max(sum1 , sum2);
			sum1 = new_sum;
}
		return max(sum1 , sum2);
} 

	static int max(int num1 , int num2){
		if(num1>=num2)
			return num1;
		else
			return num2;
}


	public static void main(String s[]){
		System.out.println("Enter the number of digits in array: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the array: ");
		for(int i=0; i<num; i++){
			arr[i] = sc.nextInt();
}
		int max = findMax(arr);
		System.out.println("Max is "+max);
		
}
	
}