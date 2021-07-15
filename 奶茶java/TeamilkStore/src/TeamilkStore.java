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
		Catalog.addaddfood(new addfood("A000", "������", 0));
		Catalog.addaddfood(new addfood("A001", "����", 1));
		Catalog.addaddfood(new addfood("A002", "����", 1));
		Catalog.addaddfood(new addfood("A003", "��Բ", 3));
		Catalog.addaddfood(new addfood("A004", "����", 2));
		Catalog.addaddfood(new addfood("A005", "Ҭ��", 1));
		Catalog.addaddfood(new addfood("A006", "�䲨Ҭ", 1));
		Catalog.addaddfood(new addfood("A007", "��ƴ�����ԣ�������Ҭ����", 2));

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
				System.out.println("��ӭ����������̲��");
				System.out.println("------------------");
				System.out.println("[0]�˳��̲��");
				System.out.println("[1]���̲�");
				System.out.println("[2]����Աģʽ");
				System.out.println("------------------");
				in = new Scanner(System.in);
				choice = Integer.parseInt(in.nextLine());
			} catch (final NumberFormatException nfe) {

				System.out.println(nfe);
			}
			switch (choice) {
			case 0:
				System.out.println("лл���٣���ӭ�����´ι���");
				break;
			case 1: {
				int select = 1;
				String code1;
				String code2;
				while (select != 2) {
					tm.displaytea(tm.Catalogteamilk);
					System.out.println("��ѡ������Ҫ���̲�");
					in = new Scanner(System.in);
					code1 = in.nextLine();
					tm.display(tm.Cataloaddfood);
					System.out.println("��ѡ������Ҫ������");
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
							"------------------\n" + "�Ƿ�ʼ����һ��\n" + "1.��          2.����\n" + "------------------\n");
					in = new Scanner(System.in);
					select = in.nextInt();
					System.out.println("------------------\n");
				}

				
				tm.currentOrder.display();
				System.out.println("һ������" + tm.currentOrder.getnumberofonecup() + "��\n" + "�ܼƣ�"
						+ tm.currentOrder.gettotal() + "Ԫ");
				System.out.println("------------------");
				break;
			}
			case 2: {
				int select;

				System.out.println("------------------\n" + "�����Ʒ\n" + "1.�̲���Ʒ        2.�޸ļ۸�\n" + "------------------\n");
				in = new Scanner(System.in);
				select = in.nextInt();
				String s;
				if (select == 1) {
					System.out
							.println("------------------\n" + "�밴��ʽ������Ʒ\n" + "���-��Ʒ����-�۸�-����\n" + "------------------\n");
					in = new Scanner(System.in);
					s = in.nextLine();
					String[] ss = s.split("-");

					tm.Catalogteamilk.addteamilk(new teamilk(ss[0], ss[1], Integer.parseInt(ss[2]), ss[3]));
                 tm.printcatalog();
             	
                 System.out.println("��ӳɹ�");
				} else {
					System.out.println("------------------\n" + "�����������޸ĵ���Ʒ���\n" + "------------------\n");
					in = new Scanner(System.in);
					s = in.nextLine();
					System.out.println(tm.Catalogteamilk.getteamilk(s).tostring()+"\n"+"�������޸ĵļ۸�");
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
