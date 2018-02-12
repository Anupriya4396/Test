import java.util.*;

class MaxLengthSnake{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int array[][] = new int[rows][cols];
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				array[i][j] = sc.nextInt();
}
}
		int ans = findLength(array, rows, cols);
		System.out.println(ans);
}
	public static int findLength(int array[][], int rows, int cols){
		int dp[][] = new int[rows][cols];
		int max = 0;
		for(int i=1; i<rows; i++){
			if(array[i][0] == 1 + array[i-1][0] || array[i][0] == array[i-1][0] - 1)
				dp[i][0] = dp[i-1][0] + 1;
			
}
		for(int i=1; i<cols; i++){
			if(array[0][i] == 1 + array[0][i-1] || array[0][i] == array[0][i-1] - 1)
				dp[0][i] = dp[0][i-1] + 1;
}
		for(int i=1; i<rows; i++){
			for(int j=1; j<cols; j++){
				int above=0;
				int left=0;
				if(array[i][j] == 1 + array[i-1][j] || array[i][j] == array[i-1][j] - 1)
					above = dp[i-1][j] + 1;
				if(array[i][j] == 1 + array[i][j-1] || array[i][j] == array[i][j-1] - 1)
					left = dp[i][j-1] +1;
				dp[i][j] = Math.max(above, left);
}
}
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				if(max<dp[i][j])
					max = dp[i][j];
}
}
		return max+1;
}
}