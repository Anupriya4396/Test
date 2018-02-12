import java.util.*;

class TurboSort{

	static long input_array[];
	static long helper_array[];

	public static void merge(long start, long mid, long end){
		for(long x = start; x<=end; x++){
			helper_array[(int)x] = input_array[(int)x];
}
		long i = start;
		long j = mid+1;
		long k = start;
		while(i<=mid && j<=end){
			if(helper_array[(int)i]<helper_array[(int)j]){
				input_array[(int)k] = helper_array[(int)i];
				i++;
				k++;
}
			else{
				input_array[(int)k] = helper_array[(int)j];
				j++;
				k++;
}
}
		while(i<=mid){
			input_array[(int)k] = helper_array[(int)i];
			i++;
			k++;
}
		while(j<=end){
			input_array[(int)k] = helper_array[(int)j];
			j++;
			k++;
}		
}

	public static void mergeSort(long input[], long start, long end){
		if(input.length == 1)
			return;
		else{
			if(start<end){
			long mid = (long)(start + end)/2;
			mergeSort(input, start, mid);
			mergeSort(input, mid+1, end);
			merge(start, mid, end);
}
}
} 

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		long input_length = sc.nextLong();
		input_array = new long[(int)input_length];
		helper_array = new long[(int)input_length];
		for(long i=0; i<input_array.length; i++){
			input_array[(int)i] = sc.nextLong();
}
		mergeSort(input_array, 0, input_array.length-1);
		System.out.println("_____________________");
		for(long i=0; i<input_array.length; i++){
			System.out.println(input_array[(int)i]);
}
}
}