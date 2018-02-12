import java.util.*;
import java.lang.*;

class Encrypt{

	public static void encp(String str, int shift){
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		char ch[] = str.toCharArray();
		
		System.out.println("Encrypted string is:");
		for(int i=0; i<ch.length; i++){
			int num = (alpha.indexOf(ch[i])+shift)%26;
			char ch1 = alpha.charAt(num);
			System.out.print(ch1);
}
		
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str;
		str = sc.next();
		System.out.println("Enter shift number:");
		int shift = sc.nextInt();
		encp(str, shift);
}
}