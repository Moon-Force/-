package Test;

import java.util.Scanner;

public class Test {

    public void choose() {
        while (true) {
            System.out.println("------------ͼ�����ϵͳ------------\n");
            System.out.print("���¼��1����ͨ�û�   2������Ա��¼\n\n");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();
            Scanner scan = new Scanner(System.in);
            User user = null;
            AdminPerson adminPerson = null;
            switch (choose) {
                case 1:
                    System.out.print("�����룺���� \n");
                    String userName = scan.next();
                    System.out.print("�����룺�Ա� \n");
                    String userSex = scan.next();
                    System.out.print("�����룺���� \n");
                    int userAge = scan.nextInt();
                    user = new User(userName, userSex, userAge);
                    System.out.println("��ǰ�û���" + userName + " " + userSex + " " + userAge);
                    user.start();
                    break;
                case 2:
                    System.out.print("�����룺���� \n");
                    String adminName = scan.next();
                    System.out.print("�����룺�Ա� \n");
                    String adminSex = scan.next();
                    System.out.print("�����룺���� \n");
                    int adminAge = scan.nextInt();
                    System.out.println("��ǰ����Ա��" + adminName + " " + adminSex + " " + adminAge);
                    adminPerson = new AdminPerson(adminName, adminSex, adminAge);
                    adminPerson.start();
                    break;
                default:
                {
                    System.out.println("��������,����������");
                }
            }
        }
    }
    public static void main(String[] args){
        Test test = new Test();
        test.choose();
    }
}
