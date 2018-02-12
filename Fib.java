import java.util.*;

class Fib{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = fibo(num);
		System.out.println(ans);
}

	public static int fibo(int num){
		int array[] = new int[num+1];
		array[0] = 0;
		array[1] = 1;
		for(int i=2; i<=num; i++){
			array[i] = array[i-1] + array[i-2];
}
		return array[num];
}
}