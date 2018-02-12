import java.util.*;

class MaxSubMatrixSize{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int array[][] = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				array[i][j] = sc.nextInt();
}
}
		int ans = func(array, m, n);
		System.out.println(ans);
}
	public static int func(int array[][], int m, int n){
		int temp[][] = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(i==0 || j==0)
					temp[i][j] = array[i][j];
				else if(array[i][j]==1)
					temp[i][j] = Math.min(temp[i-1][j-1], Math.min(temp[i-1][j], temp[i][j-1])) + 1;
				else
					temp[i][j] = 0;
}
}
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(temp[i][j]+" ");
}
			System.out.println();
}
		int ans = findMin(temp, m, n);
		return ans;
}
	public static int findMin(int array[][], int m, int n){
		int ans = 0;
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(ans < array[i][j])
					ans = array[i][j];
}
}
		return ans;
}
}