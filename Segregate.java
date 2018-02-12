import java.util.*;

class Segregate{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
			array[i] = sc.nextInt();
		array = seg(array, len);
		for(int i=0; i<len; i++)
			System.out.print(array[i]+" ");
}
	public static int[] seg(int array[], int len){
		int i=0; 
		int j=1;
		while(i<len && j<len){
			if(array[i] < 0 && array[j]>0){
				swap(array, i, j);
				i = i+2;
				j = j+2;
}
			else if(array[i] > 0)
				i = i+2;
			else if(array[j] < 0)
				j = j+2;
			else 
				continue;
}
		return array;
}
	public static void swap(int array[], int i, int j){
		int temp = 0;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
}
}