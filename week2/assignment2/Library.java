package week2.assignment2;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
       void issueBook() {
    	   System.out.println("Book issued successfully");
       }    
       public static void main(String[] args) {
		Library LibraryManagement = new Library();
		LibraryManagement.addBook("Comics");
		LibraryManagement.issueBook();
	}
}
