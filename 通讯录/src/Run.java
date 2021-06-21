import java.util.Scanner;
import java.util.List;
class Run {
    static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int C;
        int i;
        Menu.printfmenu();
        System.out.println("输入选项");
        C = scanner.nextInt();
        switch (C) {
            case 1: {
                while( school.classes.)

                break;
            }
            case 2: {
                System.out.println("1.在一班学生中查找");
                System.out.println("2.在二班学生中查找");
                i=scanner.nextInt();
                String no;
                switch (i) {
                    case 1: {
                        System.out.println("输入学号");
                        no=scanner.next();
                        Test.Classone.findStudent(no);
                        break;
                    }
                    case 2: {
                        System.out.println("输入学号");
                        no=scanner.next();
                        Test.Classtwo.findStudent(no);
                        break;
                    }
                    default: {
                        System.out.println("无效输入");
                    }
                }
            }
            default:
            {
                System.out.println("输入错误,请重新输入");
            }
        }
    }
}
