import java.util.*;

class DiffPair{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
			array[i] = sc.nextInt();
		if(diff(array, len, num))
			System.out.println("Pair exist");
		else
			System.out.println("Pair does not exist");
}
	public static boolean diff(int array[], int len, int num){
		Arrays.sort(array);
		int i=0;
		int j=1;
		while(j<len && i<len){
			if(array[j]-array[i]==num)
				return true;
			else if(array[j]-array[i]<num)
				j+=1;
			else
				i+=1;
}
		return false;
}
}