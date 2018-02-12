import java.util.*;

class LongestCommonSubstring{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int ans = lcs(str1, str2, str1.length(), str2.length());
		System.out.println(ans);
}
	public static int lcs(String str1, String str2, int len1, int len2){
		int array[][] = new int[len1+1][len2+1];
		int max = 0;
		for(int i=0; i<=len1; i++){
			for(int j=0; j<len2; j++){
				if(i==0 || j==0)
					array[i][j] = 0;
				else if(str1.charAt(i-1)==str2.charAt(j-1))
					array[i][j] = 1+array[i-1][j-1];
				else 
					array[i][j] = 0;
}
}
		for(int i=0; i<=len1; i++){
			for(int j=0; j<len2; j++){
				if(max<array[i][j])
					max = array[i][j];
}
}
		return max;
}
}