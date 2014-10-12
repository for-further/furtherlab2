package BOOK;
//This code is useless  QAQ
public class Book {
	String ISBN;
	String Title;
	int AuthorID;
	String Publisher;
	String PublishDate;
	String Price;
	
	public void set(String isbn, String title, int authorID, String publisher, String publishDate, String price){
		ISBN = isbn;
		Title = title;
		AuthorID = authorID;
		Publisher = publisher;
		PublishDate = publishDate;
		Price = price;
	}
	public String getISBN(){
		return ISBN;
	}
	public String getTitle(){
		return Title;
	}
	public int getAuthorID(){
		return AuthorID;
	}
	public String getPublisher(){
		return Publisher;
	}
	public String getPublishDate(){
		return PublishDate;
	}
	public String getPrice(){
		return Price;
	}
}
