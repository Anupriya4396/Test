import java.util.*;

class Test{
	public static void main(String s[]){
		int n = 10;
		int ans = n & ~(n-1);
		System.out.println(ans);
}
}