import java.util.*;

class Segregate0and1{

	static void seg0and1(int arr[]){
		int start = 0;
		int end = arr.length-1;
		while(start < end){
		while(start < end && arr[start] == 0){
			start++;
}
		while(start < end && arr[end] == 1){
			end--;
}
		if(start < end){
			arr[start] = 0;
			arr[end] = 1;
			start++;
			end--;
}
}
}

	public static void main(String s[]){
		System.out.print("Enter no of elements in array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements :");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
}
		seg0and1(arr);
		System.out.println("----------");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
}
}
}