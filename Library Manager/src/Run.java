import java.util.*;

class Run {

	public static void running0() throws InterruptedException// 读者
	{

		int a;
		Scanner scan = new Scanner(System.in);
		do {
			Menu.menu1();
			a = scan.nextInt();
			switch (a) {
			case 0: {
				System.out.println("返回上一级");
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 1: {
				Library.printall();
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 2: {
				String no;
				int flag=0;
				int bookno;
				System.out.println("输入学号");
				no = scan.next();
				for (int i = 0; i < Library.readers.size(); i++) {
					Reader read = (Reader) Library.readers.get(i);
					if (read.getno().equals(no)) {
						System.out.println("输入要借阅的书籍No:");
						bookno = scan.nextInt();
						read.borrow(Library.books.get(bookno));
						flag=1;
					}
				}
				if(flag==0)
				{
				System.out.println("查无此读者");
				}
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 3: {
				String no;
				int flag=0;
				String bookisbn;
				System.out.println("输入学号");
				no = scan.next();
				for (int i = 0; i < Library.readers.size(); i++) {
					Reader read = (Reader) Library.readers.get(i);
					if (read.getno().equals(no)) {
						System.out.println("输入要归还的书籍ISBN:");
						bookisbn = scan.next();
						for (int j=0;j<read.list.size();j++)
						{
							Book book=read.list.get(j);
							if(book.getISBN().equals(bookisbn))
							{
								read.restore(book);
							}
						}
						flag=1;
					}
				}
				if(flag==0)
				{
					System.out.println("查无此读者");
				}
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 4: {
				String isbn1;
				System.out.println("输入要查询的书籍isbn");
				isbn1 = scan.next();
				Library.findisbn(isbn1);
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 5: {
				String no;
				System.out.println("输入学号");
				no = scan.next();
				for (int i = 0; i < Library.readers.size(); i++) {
					Reader read = (Reader) Library.readers.get(i);
					if (read.getno().equals(no)) {
					read.printbook();
					}
				}
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			default: {
				System.out.println("输入有误，请重新输入");
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			}
		} while (a != 0);
	}

	public static void running1() throws InterruptedException// 管理员
	{
		int b;
		Scanner scan1 = new Scanner(System.in);
		do {
			Menu.menu2();
			b = scan1.nextInt();
			switch (b) {
			case 0: {
				System.out.println("返回上一级");
				break;
			}
			case 1: {
				Library.printall();
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 2: {
				Library.addBook();
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}

			case 3: {
				System.out.println("输入要删除图书的isbn");
				String isbn;
				isbn = scan1.next();
				Library.deleteBook(isbn);
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 4: {
				int t;
				System.out.println("请输入要修改书籍的No");
				t = scan1.nextInt();
				Library.bookupdate(t);
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 5: {
				String isbn1;
				System.out.println("输入要查询的书籍isbn");
				isbn1 = scan1.next();
				Library.findisbn(isbn1);
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 6: {
				Library.printreader();
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 7: {
				Library.addReader();
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			default: {
				System.out.println("输入有误，请重新输入");
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			}
		} while (b != 0);
	}
}
