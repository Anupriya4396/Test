import java.util.*;

class ReverseArray{

	static void reverseArr(int arr[] , int start , int end){
		if(start>=end)
			return;
		int temp;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArr(arr , start+1 , end-1);
}

	public static void main(String s[]){
		System.out.print("Enter the no of digits int the array: ");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.print("Enter the array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
}
		reverseArr(arr , 0 , arr.length-1);
		System.out.print("Reverse: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
}
}
}