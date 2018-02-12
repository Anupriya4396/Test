import java.util.*;

class MinCostMatrix{

	static int minCost(int matrix[][], int x, int y){
		int cost[][] = new int[x+2][y+2];
		cost[0][0] = matrix[0][0];
		for(int i=1; i<=x; i++){
			cost[i][0] = cost[i-1][0] + matrix[i][0];
}
		for(int j=1; j<=y; j++){
			cost[0][j] = cost[0][j-1] + matrix[0][j];
}
		for(int i=1; i<=x; i++){
			for(int j=1 ; j<=y; j++){
				cost[i][j] = min(cost[i-1][j], cost[i][j-1], cost[i-1][j-1])+matrix[i][j];
}
}
		return cost[x][y];
}

	static int min(int x, int y, int z){
		if(x<y && x<z)
			return x;
		else{
			if(y<x && y<z)
				return y;
			else
				return z;
}
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and columns:");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int matrix[][] = new int[rows][cols];
		System.out.println("Enter cost matrix");
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				matrix[i][j] = sc.nextInt();
}
}
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.print(matrix[i][j]+" ");
}
			System.out.println();
}
		System.out.println("Enter final destination");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int cost = minCost(matrix, x, y);
		System.out.println("Min cost to reach destination is "+cost);
}
}