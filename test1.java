class test1
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
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			i = i+2;
		}
	}
}