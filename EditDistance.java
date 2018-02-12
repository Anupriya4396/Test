import java.util.*;

class EditDistance{

	static int editDistance(char ch1[], char ch2[], int len1, int len2){
		int dp[][] = new int[len1+1][len2+1];
		for(int i=0; i<=len1; i++){
			for(int j=0; j<=len2; j++){
				if(i==0)
					dp[i][j] = j;
				else{if(j==0)
					dp[i][j] = i;
				else{if(ch1[i-1]==ch2[j-1]){
					dp[i][j] = dp[i-1][j-1];
}
				else{
					dp[i][j] = 1 + min(dp[i-1][j-1], dp[i][j-1], dp[i-1][j]);
}
}
}
}
}
		return dp[len1][len2];
}
	
	static int min(int a, int b, int c){
		if(a<b && a<c)
			return a;
		else{if(b<a && b<c)
			return b;
		else
			return c;
}
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.next();
		char ch1[] = str1.toCharArray();
		System.out.println("Enter second string");
		String str2 = sc.next();
		char ch2[] = str2.toCharArray();
		int ans = editDistance(ch1, ch2, ch1.length, ch2.length);
		System.out.println("Minimum steps are "+ ans);
}
}