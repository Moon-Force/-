package Test;
import java.util.Scanner;

public class Book {
    Scanner input = new Scanner(System.in);
    protected int BookId;
    protected String BookName;
    protected String Author;
    protected int BookNum;
    protected static int count;

    static String[][] book1 = new String[5][4];

    public Book(){


    }

    public Book(int BookId,String BookName,String Author,int BookNum){
        this.BookId = BookId;
        this.BookName = BookName;
        this.Author = Author;
        this.BookNum = BookNum;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) { this.BookId = bookId; }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        this.BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public int getBookNum() {
        return BookNum;
    }

    public void setBookNum(int bookNum) {
        this.BookNum = bookNum;
    }

    public void add(Book book){
        int BookId1,BookNum1;
        String BookName1,Author1;
        System.out.println("******��ʼ���ͼ����Ϣ******");
        System.out.println("ͼ��ID:");
        BookId1 = input.nextInt();
        book.setBookId(BookId1);
        System.out.println("ͼ�����֣�");
        BookName1 = input.next();
        book.setBookName(BookName1);
        System.out.println("ͼ�����ߣ�");
        Author1 = input.next();
        book.setAuthor(Author1);
        System.out.println("ͼ��������");
        BookNum1 = input.nextInt();
        book.setBookNum(BookNum1);
        System.out.println("********��ӳɹ�******");

        book1[count][0] = book.BookId+"";
        book1[count][1] = book.BookName;
        book1[count][2] = book.Author;
        book1[count][3] = book.BookNum+"";
        System.out.println("ͼ���ţ�"+book1[count][0]);
        System.out.println("ͼ�����֣�"+book1[count][1]);
        System.out.println("ͼ�����ߣ�"+book1[count][2]);
        System.out.println("ͼ��������"+book1[count][3]);

        count++;
    }
    public void delete(){
        System.out.println("������Ҫɾ����ͼ�����֣�");
        String m;
        m = input.next();
        for(int i = 0; i < count;i++) {
            if(book1[i][1].equals(m)) {
                book1[i] = null;
                book1[i] = book1[i + 1];
                break;
            }
        }
        System.out.println("*******ͼ����Ϣ�ѱ�ɾ��******");
        count--;
    }
}