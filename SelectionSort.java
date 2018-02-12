import java.util.*;

class SelectionSort{
	public static int findMin(int array[], int i, int len){
		int small = i;
		for(int j=i; j<len; j++){
			if(array[j]<array[small]){
				small = j;
			}
		}
		return small;
	}

	public static int[] sort(int array[]){
		int len = array.length;
		for(int i=0; i<len; i++){
			int small_index = findMin(array, i, len);
			int temp = array[i];
			array[i] = array[small_index];
			array[small_index] = temp;
		}
		return array;
	}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the length of the array:");
		int len = sc.nextInt();
		int array[] = new int[len];
		System.out.println("Enter array:");
		for(int i=0; i<len; i++){
			array[i] = sc.nextInt();
		}
		array = sort(array);
		System.out.println("________SORTED________");
		for(int i=0; i<len; i++){
			System.out.println(array[i]);
		}
	}
}