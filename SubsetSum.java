import java.util.*;

class SubsetSum{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int array[] = new int[length];
		for(int i=0; i<length; i++){
			array[i] = sc.nextInt();}
		int num = sc.nextInt();
		if(sumAvailable(array, length, num))
			System.out.println("Sum Available.");
}
	public static boolean sumAvailable(int array[], int length, int sum){
		boolean ans[][] = new boolean[sum+1][length+1];
		for(int i=0; i<=length; i++)
			ans[0][i] = true;
		for(int i=1; i<=sum; i++)
			ans[i][0] = false;
		for(int i=1; i<=sum; i++){
			for(int j=1; j<=length; j++){
				ans[i][j] = ans[i][j-1];
				if(i>=array[j-1])
					ans[i][j] = ans[i][j] || ans[i-array[j-1]][j-1];
}
}
		return ans[sum][length];
}
}
