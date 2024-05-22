import java.util.*;
public class BookStore {

	private List<Book> books = new ArrayList<>() ;
	
	public void addBooks(Book book){
		this.books.add(book);
	}

	public void removeBooks(Book books){
		this.books.remove(books);
	}

	public void addAuthors(Book authors){
		this.books.add(authors);
	}

	public void removeAuthors(Book authors){
		this.books.remove(authors);
	}

	public void addIsbn(Book isbn){
		this.books.add(isbn);
	}
	
	public void removeIsbn(Books isbn){
		this.books.remove(isbn);
	}

        public String toString (){
         return  String.valueOf(books);
}
}