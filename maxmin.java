class maxmin
{
	public static void main(String s[])
	{
		int a[];
		int max, min;
		a = new int[10];
		for(int i=0; i<a.length; i++)
		{
			a[i] = (int)(Math.random()*100);
		}
		System.out.println("The array is:");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		max = a[0];
		min = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>=max)
			max = a[i];
			if(a[i]<=min)
			min = a[i];	
		}
		System.out.println("Maximum of the array is: "+max);
		System.out.println("Minimum of the array is: "+min);
	}
}