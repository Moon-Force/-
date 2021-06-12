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
			book.bookCountless();// 书的数量减一
			borrownum++;
			System.out.println("借阅成功");
		}
		else {
			System.out.println("借阅书籍超出上限");
		}
	}

	public void restore(Book book) {
		if (list.remove(book)) {
			borrownum--;
			book.bookCountmore();// 书的数量加一
			System.out.println("还书成功");
		} else {
			System.out.println("还书失败,查不到借阅信息");
		}
	}

	public void printall() {
		Library libr1 = new Library();
		super.selectAllBook(libr1);
	}

	public void printbook() {
		Iterator<Book> iterator = list.iterator();
		int i=0;
		System.out.println("借了"+borrownum+"本书");
		while (iterator.hasNext()){
			Book a= iterator.next();
			System.out.println(i+" 书名:"+a.getName()+" 作者:"+a.getWriter()+" ISBN:"+a.getISBN());
			i++;
		}
	}

	@Override
	public String toString() {
		return "姓名:" + this.name + " 读者编号:" + this.no + " 读者专业:" + this.major + " 最大借阅数:" + this.max;
	}
}
