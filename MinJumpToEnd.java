import java.util.*;

class MinJumpToEnd{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int array[] = new int[length];
		for(int i=0; i<length; i++)
			array[i] = sc.nextInt();
		int ans = minJumps(array, length);
		System.out.println(ans);
}
	public static int minJumps(int array[], int length){
		int jumps[] = new int[length];
		if(array[0] == 0 || length == 0)
			return -1;
		jumps[0] = 0;
		for(int i=1; i<length; i++){
			jumps[i] = Integer.MAX_VALUE;
			for(int j=0; j<i; j++){
				if(i<=array[j]+j && jumps[j]!=Integer.MAX_VALUE)
					jumps[i] = Math.min(jumps[i], jumps[j]+1);
}
}
		return jumps[length-1];
}
}