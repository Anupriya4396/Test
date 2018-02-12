class arraytest
{
	static void input(int a[])
	{
		for(int i=0; i<a.length; i++)
			a[i]=(int)(Math.random()*100);
	}
	static void output(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("--------------------------------------------------");
	}
	static void sort(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	static int search(int a[], int value)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==value)
				return i;
		}
		return(-1);
	}
	static void delete(int a[], int value)
	{
		int temp=-1;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==value)
			temp = i;
		}
		if(temp==-1)
		{
			System.out.println("Value to be deleted not found..!!");
			return;
		}
		for(int i=temp; i<a.length-1; i++)
		{
			a[i] = a[i+1];
		}
		for(int i=0; i<a.length-1; i++)
			System.out.println(a[i]);
	}
	static int[] insert(int a[], int value)
	{
		int n = a.length+1;
		int b[] = new int[n];
		for(int i=0; i<a.length; i++)
			b[i]=a[i];
		b[n-1] = value;
		return b;
	}
}
class demo
{
	public static void main(String s[])
	{
		int arr1[], arr2[], var;
		arr1 = new int[4];
		arr2 = new int[6];
		arraytest.input(arr1);
		arraytest.input(arr2);
		arraytest.output(arr1);
		arraytest.output(arr2);
		arraytest.sort(arr2);
		arraytest.output(arr2);
		var = arraytest.search(arr2, 56);
		if(var>=0)
		{
			System.out.println("56 is present at index "+ var);
		}
		else
		{
			System.out.println("56 is not present in the array");
		}
		arraytest.delete(arr2, 54);
		arr1 = arraytest.insert(arr1, 10);
		arraytest.output(arr1);
		var = arraytest.search(arr1, 10);
		if(var>=0)
		{
			System.out.println("10 is present at index "+ var);
		}
		else
		{
			System.out.println("10 is not present in the array");
		}
		arraytest.delete(arr1, 10);
	}
}