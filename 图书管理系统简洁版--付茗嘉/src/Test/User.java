package Test;

import java.util.Scanner;

public class User extends Person {
    private String userName;
    private String userSex;
    private int userAge;
    Book book = new Book();
    public User(){

    }
    public User(String userName,String userSex,int userAge){
this.userName=userName;
this.userSex=userSex;
this.userAge=userAge;
    }
    public void borrowBook(String[][] book1){
        System.out.println("请输入您要借阅的图书名字：");
        String m;
        int n = -1;
        m = input.next();
            for (int i = 0; i < book1.length; i++) {
                if (book1[i][1].equals(m)) {
                    n = i;
                    break;
                }
            }
            int p = Integer.parseInt(Book.book1[n][3]);
            if (p == 0) {
                System.out.println("不好意思，暂无库存");
            } else {
                Book.book1[n][3] = (p - 1) + "";
                System.out.println("借阅成功！");
            }
    }
    public void returnBook(String[][] book1){
        int BookId1,BookNum1;
        String BookName1,Author1;

        System.out.println("******开始归还图书******");
        System.out.println("请输入归还图书名字：");
        BookName1 = input.next();
        for (int i = 0; i < Book.count; i++) {
            if (book1[i][1].equals(BookName1)) {
                    int p = Integer.parseInt(book1[i][3]);
                    book1[i][3] = (p+1) + "";
                    break;
                }
            }
        System.out.println("*******归还成功******");
    }
    public void start(){
        Scanner input = new Scanner(System.in);

        boolean flag = true;
        int number;
        while(flag) {
            System.out.println("---------------------------------------------------");
            System.out.print("请选择：1：查询书籍  2：借阅书籍  3：归还书籍  4:退出\n\n");
            number = input.nextInt();
            switch (number) {
                case 1:
                    selectBook(Book.book1);
                    break;
                case 2:
                    borrowBook(Book.book1);
                    break;
                case 3:
                    returnBook(Book.book1);
                    break;
                case 4:
                    System.out.println("******您已退出系统******");
                    flag = false;
                    break;
                    default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
   
}