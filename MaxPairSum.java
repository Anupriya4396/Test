import java.util.*;

class MaxPairSum{
	public static void main(String s[]){
		Scanner sc= new Scanner(System.in);
		int length = sc.nextInt();
		int k = sc.nextInt();
		int array[] = new int[length];
		for(int i=0; i<length; i++)
			array[i] = sc.nextInt();
		Arrays.sort(array);
		int ans = find(array, length, k);
		System.out.println(ans);
}
	public static int find(int array[], int len, int k){
		int dp[] = new int[len];
		dp[0] = 0;
		for(int i=1; i<len; i++){
			dp[i] = dp[i-1];
			if(array[i]-array[i-1] < k){
				if(i>=2)
					dp[i] = Math.max(dp[i], dp[i-2]+array[i-1]+array[i]);
				else
					dp[i] = Math.max(dp[i], array[i-1]+array[i]);
}
}
		return dp[len-1];
}
}