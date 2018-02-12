import java.util.*;

class MissingNumber{

	static int missing1(int array[] , int n){
		int sum , sum1=0, ans;
		sum = n*(n+1)/2;
		for(int i=0; i<array.length; i++){
			sum1 = sum1 + array[i];
}
		ans = sum - sum1;
		return ans;
}

	public static void main(String s[]){
		System.out.print("Enter max no of digits : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num-1];
		System.out.println("Enter array");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
}
		int ans = missing1(arr , num);
		System.out.println("Missing number is " +ans);
		
}
}