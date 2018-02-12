import java.util.*;

class Pair{
	int a;
	int b;
	public Pair(int a, int b){
		this.a = a;
		this.b = b;
}
}
class MaxChain{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		Pair array[] = new Pair[len];
		for(int i=0; i<len; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();	
			array[i] = new Pair(a, b);
}
		int ans = findMax(array, len);
		System.out.println(ans);
}
	public static int findMax(Pair array[], int len){
		int dp[] = new int[len];
		for(int i=0 ; i<len; i++)
			dp[i] = 1;
		for(int i=1; i<len; i++){
			for(int j=0; j<i; j++){
				if(array[j].b<array[i].a && dp[j]+1>dp[i])
					dp[i] = dp[j]+1;
}
}
		int max = 1;
		for(int i=0; i<len; i++){
			if(max<dp[i])
				max = dp[i];
}
		return max;
}
}