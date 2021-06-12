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
		System.out.println("��������");
		name = scan.next();
		System.out.println("����ѧ��");
		no = scan.next();
		System.out.println("����רҵ");
		major = scan.next();
		System.out.println("�鼮��������");
		max = scan.nextInt();
		readers.add(new Reader(name, no, major, max));
		System.out.println("�ɹ����һ��������Ϣ");
		readcount++;
	}

	public static void addBook() { // ����ͼ��
		if (count < SIZE) {
			System.out.println("----------------------------------------------");
			System.out.print("������ͼ������");
			String name = scan.next();
			System.out.print("���������ߣ�");
			String writer = scan.next();
			System.out.print("����������磺");
			String public_name = scan.next();
			System.out.print("������ISBN��");
			String ISBN = scan.next();
			System.out.print("�����뵥�ۣ�");
			double price = scan.nextDouble();
			System.out.print("����������");
			int number = scan.nextInt();
			books.add(new Book(name, ISBN, writer, public_name, price, number));
			count++;
			System.out.println("�ɹ�����1��ͼ�飡");
		} else {
			System.out.println("ͼ���������");
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
				System.out.println("ɾ���ɹ�");
			}
		}
		if(flag==0)
		{
			System.out.println("δ��ѯ����ͼ�飬ɾ��ʧ��");
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
		System.out.println("ͼ����еǼ���"+readcount+"������");
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
				System.out.println("��ѯ��������Ϣ");
				System.out.print("no:");
				System.out.print(count2 + " ");
				System.out.println(book);
				count2++;
				flag = 1;
				return true;
			}
		}
		if (flag == 0) {
			System.out.println("���Ҳ���������Ϣ");
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
				System.out.println("ͼ����:" + book2.getName() + " ISBN:" + book2.getISBN() + " ����:" + book2.getWriter()
						+ " ������:" + book2.getpublic_namer() + " �۸�:" + book2.getprice() + " �鼮����:" + book2.number());
				System.out.println("�Ƿ��޸Ĵ���");
				System.out.println("1.ȷ��\n2.ȡ��");
				c = scan.nextInt();
				if (c == 1) {
					System.out.println("�������µ�����");
					System.out.print("������ͼ������");
					String name = scan.next();
					System.out.print("���������ߣ�");
					String writer = scan.next();
					System.out.print("����������磺");
					String public_name = scan.next();
					System.out.print("������ISBN��");
					String ISBN = scan.next();
					System.out.print("�����뵥�ۣ�");
					double price = scan.nextDouble();
					System.out.print("����������");
					int number = scan.nextInt();
					books.set(i, new Book(name, ISBN, writer, public_name, price, number));
					System.out.println("�޸ĳɹ�");
				}
			}
		}
	}
}
