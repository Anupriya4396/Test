import java.util.*;

class BubbleSort{
	public static int[] sort(int array[], int len){
		while(true){
			int flag = 0;
			for(int i=0; i<len-1; i++){
				if(array[i]>array[i+1]){
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					flag = flag+1;
				}
			}
			if(flag==0)
				break;
		}
		return array;
	}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++){
			array[i] = sc.nextInt();
		}
		array = sort(array, len);
		System.out.println("__SORTED__");
		for(int i=0; i<len; i++){
			System.out.println(array[i]);
		}
	}
}