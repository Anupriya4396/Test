import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
		    array[i] = sc.nextInt();
		array = find(array, len);
		for(int i=0; i<len; i++)
		    System.out.println(array[i]);
	}
	public static int[] find(int array[], int len){
	    for(int i=0; i<len; i+=2){
	        if(i>0 && array[i-1]>array[i])
	            array = swap(array, i-1, i);
	        if(i<len-1 && array[i] < array[i+1])
	            array = swap(array, i, i+1);
	    }
	    return array;
	}
	public static int[] swap(int array[], int a, int b){
	    int temp;
	    temp = array[a];
	    array[a] = array[b];
	    array[b] = temp;
	    return array
;	}
}