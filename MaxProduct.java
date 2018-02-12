import java.util.*;

class MaxProduct{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0 ;i<len; i++)
			array[i] = sc.nextInt();
		int ans = max(array, len);
		System.out.println(ans);
}
	public static int max(int array[], int len){
		int max_so_far = 1;
		int max_ending_here = 1;
		int min_ending_here = 1;
		for(int i=0; i<len; i++){
			if(array[i]>0){
				max_ending_here = max_ending_here*array[i];
				min_ending_here = Math.min(min_ending_here*array[i], 1);
}
			else if(array[i]==0){
				max_ending_here = 1;
				min_ending_here = 1;
}
			else{
				int temp = max_ending_here;
				max_ending_here = Math.max(min_ending_here*array[i], 1);
				min_ending_here = temp*array[i];
}
			if(max_so_far < max_ending_here)
				max_so_far = max_ending_here;
}
			return max_so_far;
}
}