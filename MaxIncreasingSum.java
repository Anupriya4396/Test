import java.util.*;

class MaxIncreasingSum{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int array[] = new int[length];
		for(int i=0; i<length; i++)
			array[i] = sc.nextInt();
		int ans = mis(array , length);
		System.out.println(ans);
}
	public static int mis(int array[], int length){
		int sum[] = new int[length];
		int max=0;
		for(int i=0; i<length; i++)
			sum[i] = array[i];
		for(int i=1; i<length; i++){
			for(int j=0; j<i; j++){
				if(array[j]<array[i] && sum[i] < sum[j]+array[i])
					sum[i] = sum[j] + array[i];
}
}
		for(int i=0; i<length; i++){
			if(max<sum[i])
				max = sum[i];
}
		return max;
}
}