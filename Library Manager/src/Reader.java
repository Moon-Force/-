import java.util.*;

class Reader extends People {
	private String name;
	private String no;
	private String major;
	private int max;
	private int borrownum = 0;
	List<Book> list = new ArrayList<Book>();

	public Reader(String name, String no, String major, int max) {
		this.name = name;
		this.no = no;
		this.major = major;
		this.max = max;
	}

	public String getName() {
		return this.name;
	}

	public String getno() {
		return this.no;
	}

	public String getmajor() {
		return this.major;
	}

	public int getmax() {
		return this.max;
	}

	public void borrow(Book book) {
		if (borrownum <=this.max) {
			list.add(book);
			book.bookCountless();// ���������һ
			borrownum++;
			System.out.println("���ĳɹ�");
		}
		else {
			System.out.println("�����鼮��������");
		}
	}

	public void restore(Book book) {
		if (list.remove(book)) {
			borrownum--;
			book.bookCountmore();// ���������һ
			System.out.println("����ɹ�");
		} else {
			System.out.println("����ʧ��,�鲻��������Ϣ");
		}
	}

	public void printall() {
		Library libr1 = new Library();
		super.selectAllBook(libr1);
	}

	public void printbook() {
		Iterator<Book> iterator = list.iterator();
		int i=0;
		System.out.println("����"+borrownum+"����");
		while (iterator.hasNext()){
			Book a= iterator.next();
			System.out.println(i+" ����:"+a.getName()+" ����:"+a.getWriter()+" ISBN:"+a.getISBN());
			i++;
		}
	}

	@Override
	public String toString() {
		return "����:" + this.name + " ���߱��:" + this.no + " ����רҵ:" + this.major + " ��������:" + this.max;
	}
}
