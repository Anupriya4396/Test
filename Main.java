import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int array[] = new int[length];
		for(int i=0; i<length; i++)
		{
			array[i] = sc.nextInt();
		}
		for(int i=0; i<array.length; i++){
			if(array[i]!=42)
				System.out.println(array[i]);
			else
				break;
		}
		
	}
}