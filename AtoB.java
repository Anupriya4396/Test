import java.util.*;

class AtoB{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int num  = a^b;
		int count = 0;
		int checker = 1;
		for(int i=0;i<31; i++){
			if((checker & num)>0)
				count+=1;
			num = num>>1;
}
		System.out.println(count);
}
}