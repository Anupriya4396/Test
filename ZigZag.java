import java.util.*;

class ZigZag{
	public static void main(String s[]){
		int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int row = 4;
		int col = 4;
		func(array, row, col);
}
	public static void func(int array[][], int row, int col){
		int len = row+col-1;
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for(int i=0; i<len; i++){
			hm.put(i,"");
}
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				int temp = i+j;
				if(temp%2==0){
				String str = hm.get(temp);
				String add = String.valueOf(array[i][j]);
				str = add+" "+str;
				hm.put(temp, str);
}
				else{
					String str = hm.get(temp);
				String add = String.valueOf(array[i][j]);
				str = str+" "+add;
				hm.put(temp, str);
}
}
}
		for(int i=0; i<len; i++){
			System.out.println(hm.get(i));
}
}
}