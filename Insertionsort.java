import java.util.*;

class InsertionSort{

	static void insertionSort(int arr[]){
		for(int i=1; i<arr.length; i++){
			int hole = i;
			int value = arr[i];
			while(hole>0 && value<arr[hole-1]){
				arr[hole] = arr[hole-1];
				hole = hole-1;
}
			arr[hole] = value;
}
}

	public static void main(String ...s){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of digits in the array: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
}
		System.out.println("---------");
		insertionSort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]+" ");
}
}
}