import java.util.*;

class CatalanNumber{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = catalan(num);
		System.out.println(ans);
}
	public static int catalan(int num){
		int array[] = new int[num+1];
		array[0] = 1;
		array[1] = 1;
		if(num==0 || num==1)
			return 1;
		for(int i=2; i<=num; i++){
			for(int j=0; j<i; j++){
				array[i]+= array[j]*array[i-j-1];
}
}
		return array[num];
}
}