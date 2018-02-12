import java.util.*;

class StrictlyIncreasingSubarray{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int len = sc.nextInt();
		int array[] = new int[len];
		System.out.print("Enter array: ");
		for(int i=0; i<len; i++){
			array[i] = sc.nextInt();
}
		int ans = subarrayCount(array);
		System.out.println("Number of increasing subarrays: "+ans);
}

	public static int subarrayCount(int arr[]){
		int cnt = 0; 
		int len = 1;
      
      
        	for (int i=0; i < arr.length-1; ++i)
        	{
            
            		if (arr[i + 1] > arr[i])
                		len++;
            		else
            		{
                		cnt += (((len - 1) * len) / 2);
                		len = 1;
            }
        }
          
        if (len > 1)
            cnt += (((len - 1) * len) / 2);
      
        return cnt;
}
}