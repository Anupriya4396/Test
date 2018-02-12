import java.util.*;

class rotatedSearch{

	static int findPivot(int arr[] , int low, int high){
		if (high < low)  return -1;
   if (high == low) return low;
 
   int mid = (low + high)/2;   /*low + (high - low)/2;*/
   if (mid < high && arr[mid] > arr[mid + 1])
       return mid;
   if (mid > low && arr[mid] < arr[mid - 1])
       return (mid-1);
   if (arr[low] >= arr[mid])
       return findPivot(arr, low, mid-1);
   return findPivot(arr, mid + 1, high);
}
}	

	static int binarySearch(int[] inputArr, int key, int start1, int end1) { 
		int start = start1; 
		int end = end1; 
		while (start <= end) { 
			int mid = (start + end) / 2; 
			if (key == inputArr[mid]) { 
				return mid; } 
			if (key < inputArr[mid]) { 
				end = mid - 1; } 
			else { start = mid + 1; } 
			return -1;}

	public static void main(String s[]){
		System.out.print("Enter the no of digits int the array: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
}
		System.out.print("Enter number to be found: ");
		int find = sc.nextInt();

		int pivot = findPivot(arr , 0, arr.length-1);		

		int b1 = binarySearch(arr , find, 0 , pivot-1);
		int b2 = binarySearch(arr , find, pivot, arr.length-1);
		if(b1!=-1 || b2!=-1)
			System.out.println("element present");
}
}