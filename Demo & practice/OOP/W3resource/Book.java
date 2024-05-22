public class Book {

	private String title;
	private String author;
	private String isbn;
	
	public  Book(String title, String author, String isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle(){
		return title;
	}
	
	public String getauthor(){
		return author;
	}
	
	public String getisbn(){
		return isbn;
	}
       public String toString(){
       return String.format("The title of the book is %s%n and the author of the book is %s%n. ISBN: %s%n ",this.getTitle(), this.getauthor(), this.getisbn());
}
	
}