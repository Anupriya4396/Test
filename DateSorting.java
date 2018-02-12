import java.util.*;

class Date implements Comparable<Date>{
	private int date;
	private int month;
	private int year;
	public int getDate(){
		return date;
}
	public int getMonth(){
		return month;
}
	public int getYear(){
		return year;
}
	Date(int date, int month, int year){
		this.date = date;
		this.month = month;
		this.year = year;
}
	public int compareTo(Date d){
		if(this.date == d.date && this.month == d.month && this.year == d.year)
			return 0;
		if(this.year == d.year){
			if(this.month == d.month){
				return this.date - d.date;
}
			else{
				return this.month - d.month;
}
}
		else{
			return this.year - d.year;
}
}
}

class DateSorting{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array: ");
		int n = sc.nextInt();
		Date arr[] = new Date[n];
		System.out.println("Enter month, date and year:");
		for(int i=0; i<n; i++){
			int d = sc.nextInt();
			int m = sc.nextInt();
			int y = sc.nextInt();
			arr[i] = new Date(d, m, y);
}
		Arrays.sort(arr);
		System.out.println("Sorted Result:");
		for(int i=0; i<n; i++){
			System.out.println(arr[i].getDate()+"-"+arr[i].getMonth()+"-"+arr[i].getYear());
}
}
}