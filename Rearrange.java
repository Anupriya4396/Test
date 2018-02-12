import java.util.*;

class Rearrange{
	public static void main(String s[]){
		int array[] = {1,2,3,4};
		re_ar(array, 6);
}
	public static void re_ar(int array[], int len){
		int pos = 0;
		int neg = 0;
		while(pos<len && array[pos]<0)
			pos+=1;
		neg = pos+1;
		while(neg<len && array[neg]>0)
			neg+=1;
		while(pos<len && neg<len){
			if(array[pos]<0 && array[neg]>0){
				neg+=1;
				pos+=1;
				continue;
}
			else if(array[pos]>0 && array[neg]<0){
				array = swap(array, pos, neg);
				pos+=1;
				neg+=1;
				continue;
}
			else if(array[pos]<0)
				pos+=1;
			else if(array[neg]>0)
				neg+=1;
}
		for(int j=0; j<len; j++)
			System.out.print(array[j]+" ");
}
	public static int[] swap(int array[], int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		return array;
}
}