import java.util.*;

class MaxSumRemoving1Ele{

	public static int maxSum(int array[]){
		int fw[] = new int[array.length];
		int bw[] = new int[array.length];
		int curr_max, max_so_far;
		curr_max = max_so_far = array[0];
		fw[0] = 0;
		for(int i=1; i<array.length; i++){
			curr_max = max(array[i], array[i]+curr_max);
			max_so_far = max(max_so_far, curr_max);
			fw[i] = curr_max;
}
		curr_max = max_so_far = bw[array.length-1] = array[array.length-1];
		for(int i=array.length-2; i>=0; i--){
			curr_max = max(array[i], array[i]+curr_max);
			max_so_far = max(max_so_far, curr_max);
			bw[i] = curr_max;
}
		int ans = curr_max;
		for(int i=1; i<array.length-1; i++){
			ans = max(ans, fw[i-1]+bw[i+1]);
}
		return ans;
}

	public static int max(int x, int y){
		if(x>=y)
			return x;
		else
			return y;
}

	public static void main(String s[]){
		System.out.println("Enter the number of elements int the array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the array:");
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
}
		int ans = maxSum(array);
		System.out.println("Maximum sum is " + ans);
}
}