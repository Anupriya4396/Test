class uniontest
{
static int[] union(int a[], int b[])
	{
		int count, count1=0, n;
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(b[i]==a[j])
					count1 = count1+1;	
			}
		}
		count = a.length + (b.length-count1);
		int temp[] = new int[count];
		for(int i=0; i<a.length; i++)
		{
			temp[i]=a[i];
		}
		n = a.length;
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(b[i]==a[j])
				{ 
				var = a[i];
				i = a.length;
				break;
				}
			}
			if(var!=b[i])
			{
				temp[n] = b[i];
				n=n+1
			}
		}
	}
	return temp;
} 
class demo1
{
	int arr[] = new int[]{1,2,3,4,5};
	int arr1[] = new int[]{1,3,5,6,7,8,9,0};
	arr = uniontest.union(arr, arr1)
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
	}
}