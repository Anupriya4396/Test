import java.util.*;

class TestSys{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float array[][] = new float[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				array[i][j] = sc.nextFloat();
}
}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(j==0 || i==0 || j==n-1 || i==n-1){
					array[i][j] = 2*array[i][j];
}
				else{
					array[i][j] = (array[i][j]/2);
}
}
}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(array[i][j]+" ");
}
			System.out.println();
}
}
}