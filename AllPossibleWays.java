import java.util.*;

class AllPossibleWays{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int ways = apw(rows, cols);
		System.out.println(ways);
}
	public static int apw(int rows, int cols){
		int array[][] = new int[rows][cols];
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				if(i==0 || j==0)
					array[i][j] = 1;
				else
					array[i][j] = array[i-1][j] + array[i][j-1];
}
}
		return array[rows-1][cols-1];
}
}