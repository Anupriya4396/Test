class sorting
{
	public static void main(String s[])
	{
		int a[];
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
		for(int i=0; i<a.length-1; i++)
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
		System.out.println("The sorted array is:");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}