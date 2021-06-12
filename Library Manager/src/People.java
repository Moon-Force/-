import java.util.Scanner;

class People {
	Scanner scan=new Scanner(System.in);
	public void selectAllBook(Library library){
		Library.printall();
	}
	public void findbyISBN(Library library) {
		String isbn;
		isbn=scan.next();
	    Library.findisbn(isbn);
	}
}
