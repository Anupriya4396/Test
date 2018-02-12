class highoddeven
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
		int highodd = a[0];
		int higheven = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0 && a[i]>higheven)
			higheven = a[i];
			if(a[i]%2!=0 && a[i]>highodd)
			highodd = a[i];
		}
		System.out.println("Highest even number is: "+higheven);
		System.out.println("Highest odd number is: "+highodd);
	}
}