import java.util.*;

class MaxSumNoAdj{
	public static void main(String s[]){
		Scanner sc= new Scanner(System.in);
		int length = sc.nextInt();
		int array[] = new int[length];
		for(int i=0; i<length; i++)
			array[i] = sc.nextInt();
		int ans = maxSum(array, length);
		System.out.println(ans);
}
	public static int maxSum(int array[], int len){
		int incl = array[0];
		int excl = 0;
		int temp;
		for(int i=1; i<len; i++){
			temp = incl;
			incl = Math.max(incl, excl+array[i]);
			excl = temp;
}
		return incl;
}
}