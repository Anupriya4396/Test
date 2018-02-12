import java.util.*;

class FindMedian{

	static int FindMedian(int arr1[], int arr2[]){
		int num = arr1.length;
		if(num<=0)
			return 4;
		if(arr1.length==1 && arr2.length==1)
			return arr1[0];
		if(arr1.length==2 && arr2.length==2){
			if(arr1[1]<=arr2[1])
				return arr1[1];
			else
				return arr2[1];
}
		int arr1mid =(int)(arr1.length-1)/2;
		int arr2mid =(int)(arr2.length-1)/2;

		if(arr1[arr1mid] == arr2[arr2mid]){
			return arr1[arr1mid];
}
		if(arr1[arr1mid] > arr2[arr2mid]){
			//if(arr1.length == 2 && arr2.length==3){
				//return arr2[2];
//}
			int temp1[] = Arrays.copyOfRange(arr1, 0, arr1mid);
			int temp2[] = Arrays.copyOfRange(arr2, arr2mid, arr2.length-1);
			return FindMedian(temp1 , temp2);
}
		if(arr1[arr1mid] < arr2[arr2mid]){
			//if(arr1.length==3 && arr2.length==2){
				//return arr2[1];}
			int temp3[] = Arrays.copyOfRange(arr1, arr1mid, arr1.length-1);
			int temp4[] = Arrays.copyOfRange(arr2, 0, arr2mid);
			return FindMedian(temp3, temp4);
}
		return 5;
}

	public static void main(String s[]){
		System.out.println("Enter no. of digits");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr1[] = new int[num];
		int arr2[] = new int[num];
		System.out.println("Enter array 1 in sorted order");
		for(int i=0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
}
		System.out.println("Enter array 2 in sorted order");
		for(int i=0; i<arr2.length; i++){
			arr2[i] = sc.nextInt();
}
		int median = FindMedian(arr1 , arr2);
		System.out.println("Median is "+median);
}
}