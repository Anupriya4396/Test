import java.util.*;

class BinomialCoefficient{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = findBinomoalCoefficient(n, k);
		System.out.println(ans);
}

	public static int findBinomoalCoefficient(int n , int k){
		int c[][] = new int[n+1][k+1];
		for(int i=0; i<=n; i++){
			for(int j=0; j<=Math.min(i, k); j++){
				if(i==j || j==0)
					c[i][j] = 1;
				else
					c[i][j] = c[i-1][j-1] + c[i-1][j];
}
}
		return c[n][k];
}
}