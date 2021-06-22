package Test;

import java.util.Scanner;

public class Test {

    public void choose() {
        while (true) {
            System.out.println("------------图书管理系统------------\n");
            System.out.print("请登录：1：普通用户   2：管理员登录\n\n");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();
            Scanner scan = new Scanner(System.in);
            User user = null;
            AdminPerson adminPerson = null;
            switch (choose) {
                case 1:
                    System.out.print("请输入：姓名 \n");
                    String userName = scan.next();
                    System.out.print("请输入：性别 \n");
                    String userSex = scan.next();
                    System.out.print("请输入：年龄 \n");
                    int userAge = scan.nextInt();
                    user = new User(userName, userSex, userAge);
                    System.out.println("当前用户：" + userName + " " + userSex + " " + userAge);
                    user.start();
                    break;
                case 2:
                    System.out.print("请输入：姓名 \n");
                    String adminName = scan.next();
                    System.out.print("请输入：性别 \n");
                    String adminSex = scan.next();
                    System.out.print("请输入：年龄 \n");
                    int adminAge = scan.nextInt();
                    System.out.println("当前管理员：" + adminName + " " + adminSex + " " + adminAge);
                    adminPerson = new AdminPerson(adminName, adminSex, adminAge);
                    adminPerson.start();
                    break;
                default:
                {
                    System.out.println("输入有误,请重新输入");
                }
            }
        }
    }
    public static void main(String[] args){
        Test test = new Test();
        test.choose();
    }
}
