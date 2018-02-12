import java.util.*;

class Minimum{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
			array[i] = sc.nextInt();
		int ans = min(array, 0, len-1);
		System.out.println(ans);
}
	public static int min(int array[], int start, int end){
		while(start < end){
			if(start == end)
				return array[start];
			if(end == start+1){
				if(array[start]<array[end])
					return array[start];
				else
					return  array[end];
}
			int mid = (int)((start+end)/2);
			if(array[mid]<array[mid+1] && array[mid]<array[mid-1])
				return array[mid];
			if(array[mid] < array[end])
				return min(array, start, mid-1);
			return min(array, mid+1, end);
}
		return -1;
}
}