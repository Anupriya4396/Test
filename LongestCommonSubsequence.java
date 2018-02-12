import java.util.*;

class LongestCommonSubsequence{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len1 = sc.nextInt();
		char array1[] = new char[len1];
		for(int i=0 ; i<len1; i++){
			array1[i] = sc.next().charAt(0);
}
		int len2 = sc.nextInt();
		char array2[] = new char[len2];
		for(int i=0 ; i<len2; i++){
			array2[i] = sc.next().charAt(0);
}
		int ans = lcs(array1, array2);
		System.out.println(ans);
}
	public static int lcs(char array1[], char array2[]){
		int ans[][] = new int[array1.length+1][array2.length+1];
		for(int i=0; i<=array1.length; i++){
			for(int j=0; j<=array2.length; j++){
				if(i==0 || j==0)
					ans[i][j] = 0;
				else if(array1[i-1] == array2[j-1])
					ans[i][j] = ans[i-1][j-1] + 1;
				     else
					ans[i][j] = Math.max(ans[i][j-1], ans[i-1][j]);
}
}
		return ans[array1.length][array2.length];
}
}