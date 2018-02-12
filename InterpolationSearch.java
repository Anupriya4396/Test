import java.util.*;

class InterpolationSearch{
	public static int interpolSearch(int array[], int low, int high, int num){
		int pos;
		while(low<high && num>array[low] && num<array[high]){
		pos = low + (((int)(high-low) /
              (array[high]-array[low]))*(num - array[low]));
		System.out.println(pos);
		if(num == array[pos]){
			return pos;
		}
		else if(num<array[pos]){
			high = pos-1;
		}
		else{
			low = pos+1;
		}
		}
		return -1;
	}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the length of the array:");
		int len = sc.nextInt();
		int array[] = new int[len];
		System.out.println("ENter the array:");
		for(int i=0; i<len; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("Enetr the number to be searched:");
		int num = sc.nextInt();
		int ans = interpolSearch(array, 0, len-1, num);
		if(ans!=-1){
			System.out.println("Number found at index "+ans);
		}
		else{
			System.out.println("Number not found.");
		}
	}
}