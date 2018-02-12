import java.util.*;

class StepsToReturn{

	public static void swap(int i, int j){
		int temp;
		temp = i;
		i = j;
		j = temp;
}

	public static boolean sorted(int arr[]){
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]>arr[i+1])
				return false;
}
		return true;
}

	public static int[] swappingFunc(int arr[], int moves[]){
		for(int i=0; i<arr.length; i++){
			int j = moves[i];
			System.out.println(j);
			swap(arr[i], arr[j-1]);
}
		return arr;
}

	public static int noOfSteps(int arr[], int moves[]){
		int count = 0;
		System.out.println("hello");
		int arr1[] = new int[arr.length];
		arr1 = swappingFunc(arr, moves);
		while(sorted(arr1)==false){
			arr1 = swappingFunc(arr1, moves);
			System.out.println("hello1");
			count = count+1;
}
		System.out.println("hello2");
		return count;
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements int the moves array:");
		int n = sc.nextInt();
		int moves[] = new int[n];
		System.out.println("Enter the moves array:");
		for(int i=0; i<moves.length; i++){
			moves[i] = sc.nextInt();
}
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++){
			arr[i] = i+1;
}
		int ans = noOfSteps(arr, moves);
		System.out.println(ans + " moves are required");
}
}