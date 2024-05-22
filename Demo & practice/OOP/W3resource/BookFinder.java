import java.util.Scanner;
import java.util.ArrayList;
public class BookFinder {
  private static BookStore books = new BookStore(); 
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
		BookStore bookStore = new BookStore();

		System.out.print("Enter a book");
		String userInputBooks = input.next();
	
		System.out.print("Enter an author");
		String author = input.next();

		System.out.print("Enter the ISBN");
		String isbn = input.next();

		Book book = new Book(userInputBooks, author, isbn);
		books.addBooks(book);

      		System.out.print(books);
	}
}