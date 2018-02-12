import java.util.*;

class MaxToEndBlock{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int maze[][] = new int[rows][cols];
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++)
				maze[i][j] = sc.nextInt();
		int ans = find(maze, rows, cols);
		System.out.println(ans);
}

	public static int find(int maze[][], int rows, int cols){
		int dp[][] = new int[rows][cols];
		for(int i=0; i<rows;i++){
			for(int j=0;j<cols;j++){
				if(maze[i][j] == -1)
					dp[i][j] = -1;
}
}
		dp[0][0] = 1;
		for(int i=1;i<rows; i++){
			if(dp[i][0] == -1){
				dp[i][0] = 0;
				continue;
}
			else
				dp[i][0] = dp[i-1][0];
}
		for(int i=1; i<cols; i++){
			if(dp[0][1] == -1){
				dp[0][i] = 0;
				continue;
}
			else
				dp[0][i] = dp[0][i-1];
}
		for(int i=1; i<rows; i++){
			for(int j=1; j<cols; j++){
				if(dp[i][j] == -1){
					dp[i][j] = 0;
					continue;
}
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
}
}
		return dp[rows-1][cols-1];
}
}