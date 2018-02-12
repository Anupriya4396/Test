import java.util.*;

class subsetSum1{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int j=0; j<len; j++)
			array[j] = sc.nextInt();
		if(find(array, len, num))
			System.out.println("Sum Found.");
		else
			System.out.println("Sum not found");
}
	public static Boolean find(int array[], int len, int num){
		for(int i=0; i<len; i++){
			int sum = 0;
			int k = 0;
			while(k<=i){
				sum+=array[i];
				k++;
}
			if(sum == num)
				return true;
			for(int j=0; j<i; j++){
				sum  = sum-array[j];
				if(sum == num)
					return true;
}
}
		return false;
}
}