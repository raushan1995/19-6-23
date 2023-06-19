import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(1);
		al.add(2);
		
		Collections.sort(al);
		
		for(Integer number:al) {
			System.out.println(number);
		}
	}

}

