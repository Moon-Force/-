package Test;
import java.util.Scanner;
class Person {
   private String name;
   private String sex;
   private int age;
    Scanner input = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public  String getSex() {
        return sex;
    }

    public  int getAge() {
        return age;
    }

    public  void setName(String name) {
        this.name = name;
    }
    public  void setSex(String sex) {
        this.sex = sex;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void selectBook(String[][] book) {
        String m;
        System.out.println("请输入您要查找的图书名字：");
        m = input.next();
        if (Book.count == 0) {
            System.out.println("查无此书籍！");
        } else {
            boolean flag=false;
            for (int i = 0; i < Book.count; i++) {
                if (book[i][1].equals(m)) {
                    System.out.println("图书编号：" + book[i][0]);
                    System.out.println("图书名字：" + book[i][1]);
                    System.out.println("图书作者：" + book[i][2]);
                    System.out.println("图书数量：" + book[i][3]);
                    System.out.println("*******图书信息查找完毕********");
                    flag=true;
                }
                if(!flag)
                {
                    System.out.println("查找不到此书");
                }
            }
        }
    }
}
