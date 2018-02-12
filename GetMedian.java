import java.util.*;

class GetMedian{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int array1[] = new int[len];
		int array2[] = new int[len];
		for(int i=0; i<len; i++){
			array1[i] = sc.nextInt();
}
		for(int i=0; i<len; i++){
			array2[i] = sc.nextInt();
}
		int ans = findMedian(array1, array2, 0, len-1, 0, len-1);
		System.out.println(ans + "is the median.");
}

	static int findMedian(int array1[], int array2[], int start1, int end1, int start2, int end2){
		if(array1.length <= 0 || array2.length <=0)
			return -1;
		if(array1.length == 1){
			return ((array1[0]+array2[0])/2);
}
		if(array1.length == 2){
			return (max(array1[0], array2[0]) + min(array1[1], array2[1]))/2;
}
		int median1 = getMedian(array1, start1, end1);
		int median2 = getMedian(array2, start2, end2);

		if(median1 == median2)
			return median1;
		if(median1 > median2)
			return findMedian(array1, array2, start1, (start1+end1)/2, (start2+end2)/2, end2);
		if(median1 < median2)
			return findMedian(array1, array2, (start1+end1)/2, end1, start2, (start2+end2)/2);
		return -1;
}
	static int getMedian(int array[], int start, int end){
		if(end%2 !=0){
			int value = (start+end)/2;
			return array[value] + array[value+1];
}
		else{
			return array[(start+end)/2];
}
}

	static int max(int num1, int num2){
		if(num1>=num2)
			return num1;
		else
			return num2;
}
	static int min(int num1, int num2){
		if(num1<=num2)
			return num1;
		else
			return num2;
}
}