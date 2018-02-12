import java.util.*;

class IS3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
			array[i] = sc.nextInt();
		maxProduct(array, len);
}
	public static void maxProduct(int array[], int len){
		int left[] = new int[len];
		int right[] = new int[len];
		for(int i=0; i<len; i++){
			left[i] = -1;
			right[i] = -1;
}
		int max = array[0];
		for(int i=1; i<len; i++){
			left[i] = max;
			if(array[i]>max)
				max = array[i];
}
		max = array[len-1];
		for(int i = len-2; i>=0; i--){
			right[i] = max;
			if(array[i]>max)
				max = array[i];
}
		int maxpro = 0;
		int leftnum=0, currentnum=0, rightnum=0;
		for(int i=1; i<len-1; i++){
			if(left[i]<array[i] && array[i]<right[i]){
				if(left[i]*array[i]*right[i] > max){
					maxpro = left[i]*array[i]*right[i];
					leftnum = left[i];
					currentnum = array[i];
					rightnum = right[i];
}
}
}
		System.out.println(leftnum+" "+currentnum+" "+rightnum+" "+":"+maxpro);
}
}