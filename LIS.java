import java.util.*;

class LIS{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int array[] = new int[length];
		for(int i=0; i<length; i++){
			array[i] = sc.nextInt();
}
		int ans = lis(array, length);
		System.out.println(ans);
}
	public static int lis(int array[], int length){
		int max = 0;
		int ansArray[] = new int[length];
		for(int i=0; i<length; i++){
			ansArray[i] =  1;
}
		for(int i=1; i<length; i++){
			for(int j=0; j<i ; j++){
				if(array[i]>array[j] && ansArray[i]<ansArray[j]+1){
					ansArray[i] = ansArray[j] + 1;
}
}
}
		for(int i=0; i<length; i++){
			if(max<ansArray[i])
				max = ansArray[i];
}
		return max;
}
}