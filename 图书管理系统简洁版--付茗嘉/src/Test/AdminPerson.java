package Test;

import java.util.Scanner;

public class AdminPerson extends Person {
    private String adminName;
    private String adminSex;
    private int adminAge;
    Scanner input = new Scanner(System.in);
    Book book = new Book();
    public AdminPerson(){
    }
public AdminPerson(String adminName,String adminSex,int adminAge){
this.adminName=adminName;
this.adminSex=adminSex;
this.adminAge=adminAge;
    }

    public void arrangeBooks(String[][] book1) {
        String[] temp;
        for(int i = 0;i < Book.count-1;i++){
            for(int j=0;j < Book.count-1-i;j++) {
                if (book1[j][0].compareTo(book1[j + 1][0]) > 0) {
                    temp = book1[j];
                    book1[j] = book1[j + 1];
                    book1[j + 1] = temp;
                }
            }
        }
        System.out.println("整理完毕！");
    }

    public void printBooksList(String[][] book) {
        if(Book.count == 0){
            System.out.println("未存此书！");
        }else {
            System.out.println("所有图书信息如下：");
            for (int i = 0; i < Book.count; i++) {
                System.out.print("图书编号：" + book[i][0] + "\t\t");
                System.out.print("图书名字：" + book[i][1] + "\t\t");
                System.out.print("图书作者：" + book[i][2] + "\t\t");
                System.out.print("图书数量：" + book[i][3] + "\n");
            }
        }
    }

    public void alter_s(String[][] book1) {
        String m;
        int o;
        int n = -1;
        System.out.println("请输入您要修改的图书名字：");
        m = input.next();
        for(int  i = 0;i < Book.count;i++){
            if(book1[i][1].equals(m)){
                n = i;
                break;
            }
        }
        System.out.println("请选择您要修改的内容：1. 图书编号  2. 图书名字  3. 图书作者  4.图书数量");
        o = input.nextInt();
        System.out.println("请输入您要修改的内容：");
        book1[n][o-1] = input.next()+"";
        System.out.println("*******图书信息已修改********");
    }
    public void start(){
        boolean flag = true;
        int number;
        while(flag){
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("请选择：1：增加书籍  2：查询书籍  3：修改书籍  4：删除书籍  5：打印书籍列表 6：整理书籍  7: 退出\n\n");
            number = input.nextInt();
            switch (number) {
                case 1:
                    book.add(book);
                    break;
                case 2:
                    selectBook(Book.book1);
                    break;
                case 3:
                    alter_s(Book.book1);
                    break;
                case 4:
                    book.delete();
                    break;
                case 5:
                    printBooksList(Book.book1);
                    break;
                case 6:
                    arrangeBooks(Book.book1);
                    break;
                case 7:
                    System.out.println("*******您已退出系统*******");
                    flag = false;
                    break;
                default :
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    public int compareTo(Book o) {
        return book.getBookId()-o.getBookId();
    }
}