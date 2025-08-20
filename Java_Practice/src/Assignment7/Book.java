package Assignment7;

public class Book {
	 
	int bookId,price;
	String title,author; 
	

	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public static void main(String[] args) {
		
		  Book b1=new Book();
		  
		  b1.setBookId(101);
		  b1.setPrice(500);
		  b1.setTitle("Core Java");
		  b1.setAuthor("Anshuman Sharma");
		  
		  System.out.println(b1.getBookId());
		  System.out.println(b1.getAuthor());
		  



	}

}
