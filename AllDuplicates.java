import java.util.*;

class AllDuplicates{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = find(str);
		System.out.println("Duplicates are : "+ans);
}
	public static String find(String str){
		int checker = 0;
		String ans = "";
		for(int i=0; i<str.length(); i++){
			int value = str.charAt(i) - 'a';
			if((checker & (1<<value)) > 0)
				ans = ans + str.substring(i, i+1);
			checker|=(1<<value);
}
		return ans;
}
}