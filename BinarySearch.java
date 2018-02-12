import java.util.*;

class BinarySearch{

	public static int binSearch(int array[], int start, int end, int num){
		int mid = (start+end)/2;
		if(num==array[mid]){
			return array[mid];
		}
		else if(num<array[mid]){
			return binSearch(array, start, mid-1, num);
		}
		else{
			return binSearch(array, mid+1, end, num);
		}
	}

	public static void main(String s[]){
		int ans = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int len = sc.nextInt();
		int array[] = new int[len];
		System.out.println("Enter the array in sorted order:");
		for(int i=0; i<len; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("Enter number to be found");
		int num = sc.nextInt();
		ans = binSearch(array, 0, len-1, num);
		if(ans!=-1){
			System.out.println("number found = "+ans);
		}
		else{
			System.out.println("number not found");
		}
}
}