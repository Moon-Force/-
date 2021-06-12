import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Library {
	public static final int SIZE = 5000;
	static List<Book> books = new ArrayList<Book>();
	static List<Reader> readers = new ArrayList<Reader>();
	static Scanner scan = new Scanner(System.in);
	static int count = 0;
	static int readcount = 0;

	public static void addReader() {
		String name, no, major;
		int max;
		System.out.println("输入姓名");
		name = scan.next();
		System.out.println("输入学号");
		no = scan.next();
		System.out.println("输入专业");
		major = scan.next();
		System.out.println("书籍借阅上限");
		max = scan.nextInt();
		readers.add(new Reader(name, no, major, max));
		System.out.println("成功添加一名读者信息");
		readcount++;
	}

	public static void addBook() { // 增加图书
		if (count < SIZE) {
			System.out.println("----------------------------------------------");
			System.out.print("请输入图书名：");
			String name = scan.next();
			System.out.print("请输入作者：");
			String writer = scan.next();
			System.out.print("请输入出版社：");
			String public_name = scan.next();
			System.out.print("请输入ISBN：");
			String ISBN = scan.next();
			System.out.print("请输入单价：");
			double price = scan.nextDouble();
			System.out.print("请库存数量：");
			int number = scan.nextInt();
			books.add(new Book(name, ISBN, writer, public_name, price, number));
			count++;
			System.out.println("成功增加1本图书！");
		} else {
			System.out.println("图书库已满！");
		}
	}

	public static void deleteBook(String isbn) {
		Iterator<Book> iterator = books.iterator();
		int flag=0;
		while (iterator.hasNext()) {
			Book book = iterator.next();
			if (book.getISBN().equals(isbn)) {
				flag=1;
				iterator.remove();
				System.out.println("删除成功");
			}
		}
		if(flag==0)
		{
			System.out.println("未查询到此图书，删除失败");
		}
	}

	public static void printall() {
		int count1 = 0;
		Iterator<Book> iterator = books.iterator();
		while (iterator.hasNext()) {
			System.out.print("no:");
			System.out.print(count1 + " ");
			System.out.println(iterator.next());
			count1++;
		}
	}
	public static void printreader()
	{
		Iterator<Reader> iterator=readers.iterator();
		System.out.println("图书馆中登记有"+readcount+"名读者");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

	public static boolean findisbn(String isbn1) {
		int count2 = 0;
		int flag = 0;
		Iterator<Book> iterator1 = books.iterator();
		while (iterator1.hasNext()) {
			Book book = iterator1.next();
			if (book.getISBN().equals(isbn1)) {
				System.out.println("查询到此书信息");
				System.out.print("no:");
				System.out.print(count2 + " ");
				System.out.println(book);
				count2++;
				flag = 1;
				return true;
			}
		}
		if (flag == 0) {
			System.out.println("查找不到此书信息");
		}
		return false;
	}

	public static void bookupdate(int num) {
		System.out.println(books.size());
		Scanner scan = new Scanner(System.in);
		int c;
		for (int i = 0; i < books.size(); i++) {
			if (num == i) {
				Book book2 = (Book) books.get(i);
				System.out.println("图书名:" + book2.getName() + " ISBN:" + book2.getISBN() + " 作者:" + book2.getWriter()
						+ " 出版社:" + book2.getpublic_namer() + " 价格:" + book2.getprice() + " 书籍数量:" + book2.number());
				System.out.println("是否修改此书");
				System.out.println("1.确认\n2.取消");
				c = scan.nextInt();
				if (c == 1) {
					System.out.println("请输入新的数据");
					System.out.print("请输入图书名：");
					String name = scan.next();
					System.out.print("请输入作者：");
					String writer = scan.next();
					System.out.print("请输入出版社：");
					String public_name = scan.next();
					System.out.print("请输入ISBN：");
					String ISBN = scan.next();
					System.out.print("请输入单价：");
					double price = scan.nextDouble();
					System.out.print("请库存数量：");
					int number = scan.nextInt();
					books.set(i, new Book(name, ISBN, writer, public_name, price, number));
					System.out.println("修改成功");
				}
			}
		}
	}
}
