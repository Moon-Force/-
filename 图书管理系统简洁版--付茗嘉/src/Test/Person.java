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
        System.out.println("��������Ҫ���ҵ�ͼ�����֣�");
        m = input.next();
        if (Book.count == 0) {
            System.out.println("���޴��鼮��");
        } else {
            boolean flag=false;
            for (int i = 0; i < Book.count; i++) {
                if (book[i][1].equals(m)) {
                    System.out.println("ͼ���ţ�" + book[i][0]);
                    System.out.println("ͼ�����֣�" + book[i][1]);
                    System.out.println("ͼ�����ߣ�" + book[i][2]);
                    System.out.println("ͼ��������" + book[i][3]);
                    System.out.println("*******ͼ����Ϣ�������********");
                    flag=true;
                }
                if(!flag)
                {
                    System.out.println("���Ҳ�������");
                }
            }
        }
    }
}
