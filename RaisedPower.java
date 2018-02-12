import java.util.*;

class RaisedPower{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(sol(num))
			System.out.println("Yes");
		else
			System.out.println("No");
}
	public static boolean sol(int num){
		if (num==1)  return true;
 
    // Try all numbers from 2 to sqrt(n) as base
    for (int x=2; x<=Math.sqrt(num); x++)
    {
        int y = 2;
        int p = power(x, y);
 
        // Keep increasing y while power 'p' is smaller
        // than n. 
        while (p<=num && p>0)
        {
            if (p==num)
                return true;
            y++;
            p = power(x, y);
         }
    }
    return false;
}
	public static int power(int x, int y){
		if (y == 0)
        return 1;
    else if (y%2 == 0)
        return power(x, y/2)*power(x, y/2);
    else
        return x*power(x, y/2)*power(x, y/2);
}
}