import java.util.*;

class FindLeaders{

	static void findLeader(int arr[]){
		int leader = arr[arr.length-1];
		System.out.println(leader+" is leader.");
		for(int i = arr.length-2; i>=0; i--){
			if(arr[i]>leader){
				leader = arr[i];
				System.out.println(arr[i]+" is leader.");
}
}
}

	public static void main(String s[]){
		System.out.print("Enter the no of elements in the array: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.print("Enter array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
}
		findLeader(arr);
}
}