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
				System.out.println("退出成功，欢迎下次使用");
			}
			default -> {
				System.out.println("输入错误,请重新输入");
			}
		}
    }while(num!=2);
}
}
