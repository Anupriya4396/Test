import java.util.*;

class ReplaceByMaxAtRight{
	public static void main(String s[]){
		Scanner sc= new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
			array[i] = sc.nextInt();
		array = maxAtRight(array, len);
		for(int i=0; i<len; i++)
			System.out.print(array[i]+" ");
}
	public static int[] maxAtRight(int array[], int len){
		int max = -1;
		for(int i=len-1; i>=0; i--){
			int temp = array[i];
			array[i] = max;
			if(max<temp)
				max = temp;
}
		return array;
}
}