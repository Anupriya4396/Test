import java.util.*;

class CheckLessOrEqual{

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int length1 = sc.nextInt();
		int array1[] = new int[length1];
		int length2 = sc.nextInt();
		int array2[] = new int[length2];
		for(int i=0; i<length1; i++){
			array1[i] = sc.nextInt();
}
		for(int i=0; i<length2; i++){
			array2[i] = sc.nextInt();
}
		int ans[] = new int[length1];
		ans = func(array1, array2, ans);
		for(int i=0; i<ans.length; i++){
			System.out.print(ans[i]+" ");
}
}

	static int[] func(int[] array1, int[] array2, int[] ans){
		Arrays.sort(array1);
		Arrays.sort(array2);
		int i=0;
		int j=0;
		while(i<array1.length && j<array2.length){
			while(array2[j]<=array1[i]){
				if(j<array2.length)
					j+=1;
}
		ans[i] = j+1;
		i+=1;
}
		while(i<ans.length){
			ans[i] = j+1;
}
		return ans;		
}
}