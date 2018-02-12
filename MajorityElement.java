import java.util.*;

class MajorityElement{

	static boolean majorityEle(int arr[], int num){
		int i=0;
		int j=arr.length-1;
		while(i<=j){
			if(arr[i]!=num)
				i++;
			if(arr[j]!=num)
				j--;
			if(arr[i]==num && arr[j]==num)
				break;
}
		if((j-i)>=0){
			int count = j-i+1;
			if(count > (int)((arr.length)/2))
				return true;
}
			return false;
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of digits in the array: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the array: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
}
		System.out.println("Enter no. to be tested:");
		int num = sc.nextInt();
		if(majorityEle(arr, num)==true)
			System.out.println(num +" is the majority element.");
		else
			System.out.println(num+" is not the majority element");
}
}