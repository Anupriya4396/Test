import java.util.*;

class LocalMinima{

	static int localMin(int array[], int start, int end){
		int mid = (int)((start+end)/2);
		if(array[mid]<array[mid-1]&&array[mid]<array[mid+1]){
			return mid;
}
		else{
			if(array[mid]>array[mid-1]){
				start = start;
				end = mid-1;
				return localMin(array, start, end);
}
			else{
				start = mid+1;
				end = end;
				return localMin(array, start, end);
}
}
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int len = sc.nextInt();
		int array[] = new int[len];
		System.out.println("Enter the array:");
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
}
		int ans=0;
		if(array[0]<array[1])
			ans = 0;
		else{
			if(array[len-1]<array[len-2]){
				ans = len-1;
}
			else{
				ans = localMin(array, 1, len-2);
}
}
		System.out.println("The index of local minima is "+ans);		
}
}