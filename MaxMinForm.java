import java.util.*;

class MaxMinForm{

	static void maxMin(int array[]){
		int x1 = array.length;
		int x2 = 1;
		for(int i=0; i<array.length; i++){
			if(i%2==0){
				array[i] = x1;
				x1 = x1-1;
				i = i+1;
}
}
		for(int j=1; j<array.length; j++){
			if(j%2==1){
				array[j] = x2;
				x2 = x2+1;
				j = j+1;
}
}
		System.out.println("MaxMin array is as follows");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+" ");
}
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the arrray: ");
		int length = sc.nextInt();
		int array[] = new int[length];
		System.out.println("Enter the array:");
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
}
		maxMin(array);
}
}