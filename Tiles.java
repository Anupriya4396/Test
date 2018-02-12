import java.util.*;

class Tiles{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = findWays(n);
		System.out.println(ans);
}
	public static int findWays(int n){
		int array[] = new int[n+1];
		array[0] = 1;
		for(int i=1; i<=n; i++){
			if(i>=1 && i<=3)
				array[i] = 1;
			else if(i==4)
				array[i] = 2;
			else
				array[i] = array[i-1] + array[i-4];
}
		return array[n];
}
}