import java.util.Scanner;
/**
 * @author yongtao
 */
public class LibraryManager {
	public static void main(String[] args) throws InterruptedException {
		//
    int num;
	do {
    	Menu.mainmenu();
		Scanner scanner = new Scanner(System.in);
		num= scanner.nextInt();
		switch (num) {
			case 0 -> {
				Run.running0();
				Menu.mainmenu();
			}
			case 1 -> {
				Run.running1();
				Menu.mainmenu();
			}
			case 2 -> {
				System.out.println("�˳��ɹ�����ӭ�´�ʹ��");
			}
			default -> {
				System.out.println("�������,����������");
			}
		}
    }while(num!=2);
}
}
