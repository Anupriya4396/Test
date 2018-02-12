import java.util.*;

class Maxpath{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int array[][] = new int[rows][cols];
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++)
				array[i][j] = sc.nextInt();
		int ans = findMax(array, rows, cols);
		System.out.println(ans);
}
	public static int findMax(int array[][], int rows, int cols){
		int newArray[][] = new int[rows][cols];
		int max = 0;
		newArray[0][0] = array[0][0];
		for(int i=1; i<rows; i++){
			if(newArray[i-1][0] + array[i][0]> array[i][0])
				newArray[i][0] = newArray[i-1][0] + array[i][0];
			else
				newArray[i][0] = array[i][0];
}
		for(int i=1; i<cols; i++)
			newArray[0][i] = array[0][i];
		for(int i=1; i<rows; i++){
			for(int j=1; j<cols; j++){
				newArray[i][j] = Math.max(newArray[i-1][j] + array[i][j], newArray[i-1][j-1] + array[i][j]);
}
}
		for(int i=0; i<cols; i++){
			if(newArray[rows-1][i] > max)
				max = newArray[rows-1][i];
}
		return max; 
}
}