import java.util.*;

class MaxSubArray{
	static int MaxSubArray1(int array[]){
		int max_so_far = 0;
		int max_ending_here = 0;
		for(int i=0; i<array.length; i++){
			max_ending_here = max_ending_here + array[i];
			if(max_ending_here < 0){
				max_ending_here = 0;
}
			if(max_so_far < max_ending_here){
				max_so_far = max_ending_here;
}
}
		return max_so_far;
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of digits");
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i=0; i<len; i++){
			arr[i] = sc.nextInt();
}
		//int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int ans = MaxSubArray1(arr);
		System.out.println(ans);
}
}
