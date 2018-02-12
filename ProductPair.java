import java.util.*;
import java.util.HashSet;

class ProductPair{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
			array[i] = sc.nextInt();
		int pro = sc.nextInt();
		if(find(array, len, pro))
			System.out.println("yes");
		else
			System.out.println("No");
}
	public static boolean find(int array[], int len, int pro){
		HashSet<Integer> inthash = new HashSet<Integer>();
		for(Integer num:array)
			inthash.add(num);
		if(pro==0 && inthash.contains(0))
			return true;
		else{
			for(int i=0; i<len; i++){
				if(array[i] == 0)
					continue;
				inthash.remove(array[i]);
				if(pro%array[i] == 0 && inthash.contains(pro/array[i]))
					return true;
				inthash.add(array[i]);
}
}
		return false;
}
}