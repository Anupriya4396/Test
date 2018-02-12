import java.util.*;

class WaysToReachScore{
	public static void main(String s[]){
		Scanner sc= new Scanner(System.in);
		int score = sc.nextInt();
		int ans = wtrs(score);
		System.out.println(ans);
}
	public static int wtrs(int score){
		int array[] = new int[score+1];
		array[0] = 1;
		for(int i=3; i<=score; i++)
			array[i]+=array[i-3];
		for(int i=5; i<=score; i++)
			array[i]+=array[i-5];
		for(int i=10; i<=score; i++)
			array[i]+=array[i-10];
		return array[score];
}
}