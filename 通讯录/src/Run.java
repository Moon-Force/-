import java.util.Scanner;
import java.util.List;
class Run {
    static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int C;
        int i;
        Menu.printfmenu();
        System.out.println("����ѡ��");
        C = scanner.nextInt();
        switch (C) {
            case 1: {
                while( school.classes.)

                break;
            }
            case 2: {
                System.out.println("1.��һ��ѧ���в���");
                System.out.println("2.�ڶ���ѧ���в���");
                i=scanner.nextInt();
                String no;
                switch (i) {
                    case 1: {
                        System.out.println("����ѧ��");
                        no=scanner.next();
                        Test.Classone.findStudent(no);
                        break;
                    }
                    case 2: {
                        System.out.println("����ѧ��");
                        no=scanner.next();
                        Test.Classtwo.findStudent(no);
                        break;
                    }
                    default: {
                        System.out.println("��Ч����");
                    }
                }
            }
            default:
            {
                System.out.println("�������,����������");
            }
        }
    }
}
