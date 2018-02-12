/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int array[] = new int[len];
		for(int i=0; i<len; i++)
			array[i] = sc.nextInt();
		int ans = find(array, len);
		System.out.println(ans);
	}
	public static int find(int array[], int len){
		int zero_count = 0;
		int curr_itr = 0;
		int res = 0;
		boolean one_occur = false;
		for(int i=0; i<len;){
			if(array[i] == 1){
				one_occur = true;
			}
			while(i<len && array[i]==1)
				i++;
			while(i<len && array[i]==0){
				zero_count+=1;
				i+=1;
			}
			if(i==len && one_occur==false)
				return -1;
			if(i<len && one_occur!=false){
				if(zero_count%2==0)
					curr_itr = zero_count/2;
				else
					curr_itr = (zero_count+1)/2;
				zero_count = 0;
			}
			else{
				curr_itr = zero_count;
				zero_count = 0;
			}
			
			res = Math.max(res, curr_itr);
		}
		return res;
	}
}