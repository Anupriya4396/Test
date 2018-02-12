import java.util.*;

class MergeSort{
	
	static void mergeSort(int arr[]){
		if(arr.length < 2)
			return;
		int mid = (int)((arr.length)/2);
		int left[] = new int[mid];
		int right[] = new int[arr.length-mid];
		for(int i=0; i<mid; i++){
			left[i] = arr[i];
}
		for(int i=mid; i<arr.length; i++){
			right[i-mid] = arr[i];
}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
}

	static void merge(int left[], int right[], int arr[]){
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length){
			if(left[i] < right[j]){
				arr[k] = left[i];
				i++;
				k++;
}
			else{
				arr[k] = right[j];
				j++;
				k++;
}
}
		while(i<left.length){
			arr[k] = left[i];
			i++;
			k++;
}
		while(j<right.length){
			arr[j] = right[j];
			j++;
			k++;
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
		mergeSort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]+" ");
}
}
}