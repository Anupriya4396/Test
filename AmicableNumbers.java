import java.util.*;

class AmicableNumbers{

	static int totalAmicableNum(int array[]){
		int count=0;
		for(int i=0; i<array.length-1; i++){
			for(int j=i+1; j<array.length; j++){
				int numi = calcDivSum(array[i]);
				int numj = calcDivSum(array[j]);
				if(numi==array[j] && numj==array[i]){
					count = count+1;
}
}
}
		return count;
}

	static int calcDivSum(int num){
		int sum = 0;
		for(int i=1; i<num; i++){
			if(num%i==0){
				sum = sum+i;
}
}
		return sum;
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int len = sc.nextInt();
		int array[] = new int[len];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
}
		int ans = totalAmicableNum(array);
		System.out.println("There are "+ans+" pair of Amicable Numbers in the given array.");
}
}