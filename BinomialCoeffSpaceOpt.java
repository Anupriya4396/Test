import java.util.*;

class BinomialCoeffSpaceOpt{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = findBinomiaCoeff(n , k);
		System.out.println(ans);
}
	public static int findBinomiaCoeff(int n, int k){
		int c[] = new int[k+1];
		c[0] = 1;
		for(int i=0; i<=n; i++){
			for(int j = Math.min(i, k); j>0; j--){
				c[j] = c[j] + c[j-1];
}
}
		return c[k];
}
}