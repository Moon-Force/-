import java.io.*;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import javax.xml.catalog.CatalogManager;

import java.util.ArrayList;

public class TeamilkStore {
	private catalog Cataloaddfood = new catalog();
	private catalogteamilk Catalogteamilk = new catalogteamilk();
	private order currentOrder = new order();
	
	private BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
	private PrintWriter stdOut = new PrintWriter(System.out);
	private NumberFormatException nfe = new NumberFormatException();
    private catalogload catlt=new catalogload();
	void Teamilk() throws FileNotFoundException, IOException, DataFormatException {
		
		this.Cataloaddfood = loadcatalogaddfood();
		this.Catalogteamilk = loadcatalogteamilk();
		this.currentOrder = new order();
		
		}
	
	public void printcatalog() throws IOException {
		File f = new File("teamilk.txt");
	    FileOutputStream fop = new FileOutputStream(f);
	    OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
		for(teamilk team:Catalogteamilk) {
			writer.append(team.getcode()
					+"_"+team.getteamilkname()
					+"_"+team.getprice()+"_"
					+team.getmatial()+"\n");
			writer.flush();
		}	
		
	fop.close();
		}

	private catalog loadcatalogaddfood() {
		catalog Catalog = new catalog();
		Catalog.addaddfood(new addfood("A000", "不加料", 0));
		Catalog.addaddfood(new addfood("A001", "珍珠", 1));
		Catalog.addaddfood(new addfood("A002", "波霸", 1));
		Catalog.addaddfood(new addfood("A003", "芋圆", 3));
		Catalog.addaddfood(new addfood("A004", "布丁", 2));
		Catalog.addaddfood(new addfood("A005", "椰果", 1));
		Catalog.addaddfood(new addfood("A006", "珍波椰", 1));
		Catalog.addaddfood(new addfood("A007", "三拼（波霸，布丁，椰果）", 2));

		return Catalog;
	}

	private catalogteamilk loadcatalogteamilk() throws FileNotFoundException, IOException, DataFormatException {
		
		
		return catlt.loadcatalog("teamilk.txt");
	}

	public void displaysweet() {
		
		System.out.println(sweetdegree.sweetd());
		
	}

	public void displayice() {
		System.out.println(icedegree.iced());
		
	}

	void display(catalog Catalog) {
		for (addfood Addfood : Catalog) {
			System.out.println(Addfood.tostring());

		}
	}

	void displaytea(catalogteamilk Catalogteamilk) {
		for (teamilk Teamilk : Catalogteamilk) {
			System.out.println(Teamilk.tostring());

		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, DataFormatException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		TeamilkStore tm = new TeamilkStore();
		tm.loadcatalogaddfood();
		tm.loadcatalogteamilk();
		tm.Teamilk();
		int choice = 1;

		while (choice != 0) {

			try {

				tm.currentOrder = new order();
				System.out.println("欢迎光临两点点奶茶店");
				System.out.println("------------------");
				System.out.println("[0]退出奶茶店");
				System.out.println("[1]点奶茶");
				System.out.println("[2]管理员模式");
				System.out.println("------------------");
				in = new Scanner(System.in);
				choice = Integer.parseInt(in.nextLine());
			} catch (final NumberFormatException nfe) {

				System.out.println(nfe);
			}
			switch (choice) {
			case 0:
				System.out.println("谢谢光临，欢迎您的下次光临");
				break;
			case 1: {
				int select = 1;
				String code1;
				String code2;
				while (select != 2) {
					tm.displaytea(tm.Catalogteamilk);
					System.out.println("请选择你想要的奶茶");
					in = new Scanner(System.in);
					code1 = in.nextLine();
					tm.display(tm.Cataloaddfood);
					System.out.println("请选择你想要的配料");
					in = new Scanner(System.in);
					code2 = in.nextLine();
					tm.displayice();
					in = new Scanner(System.in);
					int a = in.nextInt();
					tm.displaysweet();
					int b = in.nextInt();
					onecup oc = new onecup(tm.Catalogteamilk.getteamilk(code1), tm.Cataloaddfood.getaddfood(code2), a,
							b);
					System.out.println(oc.tostring());
					tm.currentOrder.addonecup(oc);
					System.out.println(
							"------------------\n" + "是否开始点下一杯\n" + "1.是          2.结账\n" + "------------------\n");
					in = new Scanner(System.in);
					select = in.nextInt();
					System.out.println("------------------\n");
				}

				
				tm.currentOrder.display();
				System.out.println("一共点了" + tm.currentOrder.getnumberofonecup() + "杯\n" + "总计："
						+ tm.currentOrder.gettotal() + "元");
				System.out.println("------------------");
				break;
			}
			case 2: {
				int select;

				System.out.println("------------------\n" + "添加新品\n" + "1.奶茶新品        2.修改价格\n" + "------------------\n");
				in = new Scanner(System.in);
				select = in.nextInt();
				String s;
				if (select == 1) {
					System.out
							.println("------------------\n" + "请按格式输入新品\n" + "编号-新品名字-价格-材料\n" + "------------------\n");
					in = new Scanner(System.in);
					s = in.nextLine();
					String[] ss = s.split("-");

					tm.Catalogteamilk.addteamilk(new teamilk(ss[0], ss[1], Integer.parseInt(ss[2]), ss[3]));
                 tm.printcatalog();
             	
                 System.out.println("添加成功");
				} else {
					System.out.println("------------------\n" + "请输入您想修改的商品编号\n" + "------------------\n");
					in = new Scanner(System.in);
					s = in.nextLine();
					System.out.println(tm.Catalogteamilk.getteamilk(s).tostring()+"\n"+"请输入修改的价格");
					in = new Scanner(System.in);
					int newprice= in.nextInt();
					tm.Catalogteamilk.getteamilk(s).setprice(newprice);
					tm.printcatalog();
				}
				
				break;
				
			}
			}
		}
	}

}
