import java.util.Random;
import java.util.Scanner;
public class calu {
    public calu(){
        Operation operation ;
        String op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("����a");
        double a=scanner.nextDouble();
//
        System.out.println("�������");
        op=scanner.next();
        operation=OpFactory.creatOp(op);
//
        System.out.println("����b");
        double b=scanner.nextDouble();
        operation.setNumA(a);
        operation.setNumB(b);
        try {
            System.out.println(operation.getresult());
        } catch (Exception e) {
            System.out.println("��������");
        }
    }
}
