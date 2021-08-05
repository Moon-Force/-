import java.util.Random;
import java.util.Scanner;
public class calu {
    public calu(){
        Operation operation ;
        String op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入a");
        double a=scanner.nextDouble();
//
        System.out.println("输入符号");
        op=scanner.next();
        operation=OpFactory.creatOp(op);
//
        System.out.println("输入b");
        double b=scanner.nextDouble();
        operation.setNumA(a);
        operation.setNumB(b);
        try {
            System.out.println(operation.getresult());
        } catch (Exception e) {
            System.out.println("输入有误");
        }
    }
}
