import java.util.*;

class LCS{

	static int findLCS(char ch1[], char ch2[]){
		int l[][] = new int[ch1.length+1][ch2.length+1];
		for(int i=0; i<=ch1.length; i++){
			for(int j=0; j<=ch2.length; j++){
				if(i==0 || j==0)
					l[i][j] = 0;
				else{if(ch1[i-1]==ch2[j-1])
					l[i][j] = 1+l[i-1][j-1];
				else
					l[i][j] = max(l[i-1][j] , l[i][j-1]);
				}
}
}
		return l[ch1.length][ch2.length];
}

	static int max(int i, int j){
		return (i>j)?i:j;
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:");
		String st1 = sc.next();
		char ch1[] = st1.toCharArray();
		System.out.println("Enter second string:");
		String st2 = sc.next();
		char ch2[] = st2.toCharArray();
		int ans = findLCS(ch1, ch2);
		System.out.println("LCS is "+ans);
}
}