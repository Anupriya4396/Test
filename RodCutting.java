import java.util.*;

class RodCutting{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int cost[] = new int[length];
		for(int i=0; i<length; i++){
			cost[i] = sc.nextInt(); 
}
		int ans = maxCost(cost, length);
		System.out.println(ans);
}
	public static int maxCost(int cost[], int length){
		int value[] = new int[length+1];
		value[0] = 0;
		for(int i=1; i<=length; i++){
			int max_value = Integer.MIN_VALUE;
			for(int j=0; j<i; j++){
				max_value = Math.max(max_value, cost[j]+value[i-j-1]);
}
			value[i] = max_value;
}
		return value[length];
}
}