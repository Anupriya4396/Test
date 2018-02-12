import java.util.*;

class Segregate012{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
			array[i] = sc.nextInt();
		seg(array, len);
}
	public static void seg(int array[], int len){
		int i=0;
		int j=0;
		int k=len-1;
		int temp = 0;
		while(j<k){
			if(array[j] == 0){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i+=1;
				j+=1;
}
			if(array[j] == 1)
				j+=1;
			if(array[j] == 2){
				temp = array[k];
				array[k] = array[j];
				array[j] = temp;
				j+=1;
				k-=1;
}
}
		for(int l=0; l<len; l++)
			System.out.print(array[l]+" ");
}
}