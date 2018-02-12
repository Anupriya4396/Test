import java.util.*;

class SortedTriplets{

	public static void main(String s[]){
		Scanner sc= new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
			array[i] = sc.nextInt();
		findTriples(array, len);
}
	public static void findTriples(int array[], int len){
		int min = array[0];
		int max = array[len-1];
		int small_array[] = new int[len];
		int large_array[] = new int[len];
		for(int i=0; i<len; i++){
			small_array[i] = -1;
			large_array[i] = -1;
}
		int index = 0;
		for(int i=1; i<len; i++){
			if(array[i]<min){
				min = array[i];
				index = i;
}
			else 
				small_array[i] = index;
}
		index = len-1;
		for(int i = len-2; i>=0; i--){
			if(array[i]>max){
				max = array[i];
				index = i;
}
			else
				large_array[i] = index;
}
		for(int i=0; i<len; i++){
			if(small_array[i]!=-1 && large_array[i]!=-1)
				System.out.println(array[small_array[i]] + " " + array[i] + " " + array[large_array[i]]);
}
}	
}