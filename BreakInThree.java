import java.util.*;

class BreakInThree{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = find(num);
		System.out.println(ans);
}
	public static int find(int num){
		int array[] = new int[num+1];
		array[0] = 0;
		array[1] = 1;
		for(int i=2; i<=num; i++)
			array[i] = Math.max(array[i/2] + array[i/3] + array[i/4], i);
		return array[num];
}
}