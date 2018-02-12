import java.util.*;

class UncommonChar{

	static ArrayList<Character> array = new ArrayList<Character>();

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		findDiff(str1, str2);
		findDiff(str2, str1);
		Collections.sort(array);
		Iterator itr = array.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
}
}
	public static void findDiff(String str1, String str2){
		int checker=0;
		for(int i=0; i<str1.length(); i++){
			int value = str1.charAt(i) - 'a';
			if((checker & (1<<value)) > 0)
				continue;
			else
				checker |= (1<<value);
}
		for(int i=0; i<str2.length(); i++){
			int value = str2.charAt(i) - 'a';
			if((checker & (1 << value)) > 0)
				continue;
			else
				array.add(str2.charAt(i));
}
}
}