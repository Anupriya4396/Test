import java.util.*;

class TwoSmall{

	static void findSmall(int array[]){
		int small1, small2;
		if(array.length>=2){
			if(array[0]<array[1]){
			 small1=array[0];
			small2=array[1];}
			else {
				small1=array[1];
				small2=array[0];}
			
			for(int i=2; i<array.length; i++){
				if(array[i]<small1){
					small2 = small1;
					small1 = array[i];
}
				if(array[i]>small1 && array[i]<small2 && array[i]!=small1){
					small2 = array[i];
}
}
			System.out.println("First smallest is "+small1+". Second smallest is "+small2);
}
		if(array.length == 1){
			System.out.println("Smallest is "+array[0]+". Second smallest does not exist.");
}
}

	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements in the array: ");
		int len = sc.nextInt();
		int array[] = new int[len];
		System.out.println("Enetr the elements");
		for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
}
		findSmall(array);
}
}