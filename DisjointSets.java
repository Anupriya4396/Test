import java.util.*;
import java.util.Arrays;

class DisjointSets{

	static int findCount(int array1[], int array2[]){
		int count = 0;
		int i = 0;
		int j = 0;
		while(i<array1.length && j<array2.length){
			if(array1[i]==array2[j]){
				count = count + 1;
				i = i+1;
				j = j+1;
}
			else{
				if(array1[i]>array2[j]){
					j++;
}
				else{
					i++;
}
}
}
		return count;
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of first array:");
		int len1 = sc.nextInt();
		int array1[] = new int[len1];
		System.out.println("Enter the array");
		for(int i=0; i<array1.length; i++){
			array1[i] = sc.nextInt();
}
		System.out.println("Enter the number of elements in the second array:");
		int len2 = sc.nextInt();
		int array2[] = new int[len2];
		System.out.println("Enter the array:");
		for(int i=0; i<array2.length; i++){
			array2[i] = sc.nextInt();
}
		Arrays.sort(array1);
		Arrays.sort(array2);
		int ans = findCount(array1, array2);
		System.out.println(ans+" elements must be deleted to make the set disjoint.");
}
}