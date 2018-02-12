import java.util.*;

class LongTest{
	public static void main(String s[]){
	Scanner sc = new Scanner(System.in);
	int bus = sc.nextInt();
	/*HashMap<String, Integer> hsArray[] = new HashMap[bus];
	
	for(int i=0; i<bus; i++){
		hsArray[i] = new HashMap<String,Integer>();
		int n = sc.nextInt();
		for(int j=0; j<n; j++){
			String str = sc.next();
			hsArray[i].put(str, j+1);
}
}
	System.out.println("From: ");
	String from = sc.next();
	System.out.println("To: ");
	String to = sc.next();
	for(int i=0; i<bus; i++){
		if(hsArray[i].containsKey(from) && hsArray[i].containsKey(to)){
			int fromPos = hsArray[i].get(from);
			int toPos = hsArray[i].get(to);
			if(fromPos < toPos){
				int out = i+1;
				System.out.print("Bus "+out+", ");
}
}
}
*/
	HashMap<String , HashMap<String , Integer>> hm = new HashMap<>();
	for(int i=0 ;i<bus; i++){
		System.out.print("Enter bus name: ");
		String name = sc.next();
		System.out.println("Enter no. of stops");
		int n = sc.nextInt();
		hm.put(name, new HashMap<String,Integer>());
		HashMap<String , Integer> curr = hm.get(name);
		for(int j=0; j<n; j++){
			int pos = j+1;
			String stop = sc.next();
			curr.put(stop, pos);
			
}
}
	System.out.println("From: ");
	String from = sc.next();
	System.out.println("To: ");
	String to = sc.next();
	for(Map.Entry entry: hm.entrySet()){
		String busName = (String)entry.getKey();
		HashMap<String , Integer> curr = (HashMap)entry.getValue();
		if(curr.containsKey(from) && curr.containsKey(to)){
			int fromPos = curr.get(from);
			int toPos = curr.get(to);
			if(fromPos < toPos){
				System.out.print(busName+" ");
}
}
}
}
}