import java.util.*;

class BitFlip{

	public static void main(String s[]){
		System.out.println("Enter number A: ");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		System.out.println("Enter number B: ");
		int B = sc.nextInt();
		int ans = bitFlip(A, B);
		System.out.println("Number of bits required to flip to convert A to B are "+ans);
}

	public static int bitFlip(int A, int B){
		int num = A^B;
		int ans = countBit(num);
		return ans;
}

	public static int countBit(int num){
		int count =0;
		while(num>0){
			num &= (num-1);
			count+=1;
}
		return count;
}
}