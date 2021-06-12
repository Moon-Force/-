import java.util.*;

class Run {

	public static void running0() throws InterruptedException// ����
	{

		int a;
		Scanner scan = new Scanner(System.in);
		do {
			Menu.menu1();
			a = scan.nextInt();
			switch (a) {
			case 0: {
				System.out.println("������һ��");
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
				System.out.println("����ѧ��");
				no = scan.next();
				for (int i = 0; i < Library.readers.size(); i++) {
					Reader read = (Reader) Library.readers.get(i);
					if (read.getno().equals(no)) {
						System.out.println("����Ҫ���ĵ��鼮No:");
						bookno = scan.nextInt();
						read.borrow(Library.books.get(bookno));
						flag=1;
					}
				}
				if(flag==0)
				{
				System.out.println("���޴˶���");
				}
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 3: {
				String no;
				int flag=0;
				String bookisbn;
				System.out.println("����ѧ��");
				no = scan.next();
				for (int i = 0; i < Library.readers.size(); i++) {
					Reader read = (Reader) Library.readers.get(i);
					if (read.getno().equals(no)) {
						System.out.println("����Ҫ�黹���鼮ISBN:");
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
					System.out.println("���޴˶���");
				}
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 4: {
				String isbn1;
				System.out.println("����Ҫ��ѯ���鼮isbn");
				isbn1 = scan.next();
				Library.findisbn(isbn1);
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 5: {
				String no;
				System.out.println("����ѧ��");
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
				System.out.println("������������������");
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			}
		} while (a != 0);
	}

	public static void running1() throws InterruptedException// ����Ա
	{
		int b;
		Scanner scan1 = new Scanner(System.in);
		do {
			Menu.menu2();
			b = scan1.nextInt();
			switch (b) {
			case 0: {
				System.out.println("������һ��");
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
				System.out.println("����Ҫɾ��ͼ���isbn");
				String isbn;
				isbn = scan1.next();
				Library.deleteBook(isbn);
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 4: {
				int t;
				System.out.println("������Ҫ�޸��鼮��No");
				t = scan1.nextInt();
				Library.bookupdate(t);
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			case 5: {
				String isbn1;
				System.out.println("����Ҫ��ѯ���鼮isbn");
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
				System.out.println("������������������");
				Thread.currentThread();
				Thread.sleep(1000);
				break;
			}
			}
		} while (b != 0);
	}
}
