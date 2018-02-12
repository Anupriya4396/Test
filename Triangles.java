import java.util.*;

class Triangles{
	public static void main(String s[]){
		Scanner sc= new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
			array[i] = sc.nextInt();
		int ans = noOfTri(array, len);
		System.out.println(ans);
}
	public static int noOfTri(int array[], int len){
		Arrays.sort(array);
		int count =0;
		for(int i=0; i<len-2; i++){
			int k = i+2;
			for(int j=i+1; j<len; j++){
				while(k<len && array[i]+array[j]>array[k])
					k+=1;
				count = count + k-j-1;
}
}
		return count;
}
}