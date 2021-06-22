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
        System.out.println("������ϣ�");
    }

    public void printBooksList(String[][] book) {
        if(Book.count == 0){
            System.out.println("δ����飡");
        }else {
            System.out.println("����ͼ����Ϣ���£�");
            for (int i = 0; i < Book.count; i++) {
                System.out.print("ͼ���ţ�" + book[i][0] + "\t\t");
                System.out.print("ͼ�����֣�" + book[i][1] + "\t\t");
                System.out.print("ͼ�����ߣ�" + book[i][2] + "\t\t");
                System.out.print("ͼ��������" + book[i][3] + "\n");
            }
        }
    }

    public void alter_s(String[][] book1) {
        String m;
        int o;
        int n = -1;
        System.out.println("��������Ҫ�޸ĵ�ͼ�����֣�");
        m = input.next();
        for(int  i = 0;i < Book.count;i++){
            if(book1[i][1].equals(m)){
                n = i;
                break;
            }
        }
        System.out.println("��ѡ����Ҫ�޸ĵ����ݣ�1. ͼ����  2. ͼ������  3. ͼ������  4.ͼ������");
        o = input.nextInt();
        System.out.println("��������Ҫ�޸ĵ����ݣ�");
        book1[n][o-1] = input.next()+"";
        System.out.println("*******ͼ����Ϣ���޸�********");
    }
    public void start(){
        boolean flag = true;
        int number;
        while(flag){
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("��ѡ��1�������鼮  2����ѯ�鼮  3���޸��鼮  4��ɾ���鼮  5����ӡ�鼮�б� 6�������鼮  7: �˳�\n\n");
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
                    System.out.println("*******�����˳�ϵͳ*******");
                    flag = false;
                    break;
                default :
                    System.out.println("�������");
                    break;
            }
        }
    }

    public int compareTo(Book o) {
        return book.getBookId()-o.getBookId();
    }
}