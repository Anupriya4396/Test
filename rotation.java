import java.util.*;

class rotation{

	static void rotateByD(int arr[] , int arr1[], int d){
		for(int i=d; i<arr.length; i++){
			arr[i-d] = arr[i];
}
		int temp = arr1.length-1;
		for(int i=arr.length-1; i>=arr.length-d; i--){
			arr[i] = arr1[temp];
			temp--;
}
}

	public static void main(String s[]){
		System.out.println("Enter no of digits in array and no. elements for rotation:");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int d = sc.nextInt();
		int arr[] = new int[len];
		int arr1[] = new int[d];
		System.out.println("Enter array:");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
}
		for(int i=0; i<arr1.length; i++){
			arr1[i] = arr[i];
}
		rotateByD(arr , arr1, d);
		System.out.println("New array:");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
}
}
}