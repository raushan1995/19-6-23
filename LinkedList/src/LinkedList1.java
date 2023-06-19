import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String args[]) {
		
		LinkedList<String> al = new LinkedList<String>();
		
		System.out.println("initial list"+ al);
		
		al.add("ajay");
		al.add("vijay");
		al.add("ravi");
		
		System.out.println("after add"+ al);
		
		al.add(1,"Gaurav");
		
		System.out.println("after add intiger list"+ al);
		
		LinkedList<String> al1 = new LinkedList<String>();
		
		al1.add("sonoo");
		al1.add("hanumat");
		
		al.addAll(al1);
		
		System.out.println("after invoking addAll"+ al);
		
		al.addFirst("lokesh");
		System.out.println("add first"+ al);
		
		al.addLast("harsh");
		System.out.println("add last"+ al);
	}

}
