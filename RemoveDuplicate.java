import java.util.*;

class RemoveDuplicate{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.next();
		String ans = remvDup(str);
		System.out.println("After removing duplicate: "+ans);
}
	public static String remvDup(String str){
		int checker = 0;
		String ans = "";
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) == 0){
				ans = ans + str.substring(i, i+1);
				checker |= (1 << val);
}			
}
		return ans;
}
}