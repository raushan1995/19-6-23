import java.util.LinkedList;
import java.util.List;

public class Book {
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

 class LinedListExample{
	
	public static void main(String args[]) {
		
		List<Book> list = new LinkedList<Book>();
		
		Book b1 = new Book(101,"Let us C","yeswant","BPB",8);
		Book b2 = new Book(102,"Data communication","forouzan","Mc Graw",4);
		
		list.add(b1);
		list.add(b2);
		
		for(Book b:list) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}