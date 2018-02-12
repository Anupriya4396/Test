import java.util.*;

class MaxSumPathTwoArray{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len1 = sc.nextInt();
		int array1[] = new int[len1];
		for(int i=0; i<len1; i++)
			array1[i]  = sc.nextInt();
		int len2 = sc.nextInt();
		int array2[] = new int[len2];
		for(int i=0; i<len2; i++)
			array2[i]  = sc.nextInt();
		int sum = find(array1, len1, array2, len2);
		System.out.println(sum);
}
	public static int find(int array1[], int len1, int array2[], int len2){
		int sum1=0, sum2=0, result=0;
		int i=0, j=0;
		while(i<len1 && j<len2){
			if(array1[i] < array2[j]){
				sum1 += array1[i];
				i+=1;
}
			else if(array2[j] < array1[i]){
				sum2+=array2[j];
				j+=1;
}
			else{
				result = Math.max(sum1, sum2);
				sum1 = 0;
				sum2 = 0;
				while(i<len1 && j<len2 && array1[i]==array2[j]){
					result+=array1[i];
					i+=1;
					j+=1;
}
}
}
		while(i<len1){
			sum1+=array1[i];
			i+=1;
}
		while(j<len2){
			sum2+=array2[j];
			j+=1;
}
		result += Math.max(sum1, sum2);
		return result;
}
}