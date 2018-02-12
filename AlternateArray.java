import java.util.*;

class AlternateArray{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arrayques[] = new int[len];
		int arrayans[] = new int[len];
		for(int i=0; i<len; i++){
			arrayques[i] = sc.nextInt();
}
		findAlter(arrayques, arrayans);
		for(int i=0; i<len; i++){
			System.out.print(arrayans[i]+" ");
}
}

	public static void findAlter(int arrayques[], int arrayans[]){
		int start = 0;
		int end = arrayques.length - 1;
		int k = 0;
		while(start < end){
			arrayans[k] = arrayques[end];
			k+=1;
			arrayans[k] = arrayques[start];
			k+=1;
			start+=1;
			end-=1;
}
		if(start==end){
			arrayans[k] = arrayques[start];
}
}
}