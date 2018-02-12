import java.util.*;

class MaxSumPath{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int array[] = new int[length];
		for(int i=0; i<length; i++)
			array[i] = sc.nextInt();
		find(array, length);
}
	public static void find(int array[], int len){
		int dp[] = new int[len];
		for(int i=0; i<len; i++)
			dp[i] = array[i];
		for(int i=1; i<len; i++){
			for(int j=0; j<i; j++){
				if((i+1)%(j+1) == 0 )
					dp[i] = Math.max(dp[i], dp[j]+array[i]);
}
}
		for(int i=0; i<len; i++)
			System.out.println(dp[i]);
}
}