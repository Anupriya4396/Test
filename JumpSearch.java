import java.util.*;

class JumpSearch{

	public static int jumpSearch(int array[], int start, int end, int num, int block){
		while(start<end && (start+block)<=end){
			if(num<array[start]){
				return IterativeBinarySearch(array, start-block, start, num);
			}
			start = start+block;
		}
		return -1;
	}
	
	public static int IterativeBinarySearch(int array[], int start, int end, int num){
		int mid = (start+end)/2;
		while(start<end){
			if(num == array[mid]){
				return mid;
			}
			else if(num < array[mid]){
				end = mid-1;
			}
			else{
				start = mid+1;
			}
	}
	return -1;
	} 

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = sc.nextInt();
		int array[] = new int[len];
		int block = (int)Math.pow(len, 1/2);
		System.out.println("Enter the array in sortd order:");
		for(int i=0; i<len; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the number to be searched:");
		int num = sc.nextInt();
		int ans = jumpSearch(array, 0, len-1, num, block);
		if(ans!= -1){
			System.out.println("Number fpond at index "+ans);
		}
		else{
			System.out.println("Number not found");
		}
	}
}