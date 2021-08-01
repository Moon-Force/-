import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Operation operation;
        String op;
        Scanner scanner=new Scanner(System.in);
//
        System.out.println("输入a");
        double a=scanner.nextDouble();
//
        System.out.println("输入符号");
        op=scanner.next();
//
        System.out.println("输入b");
        double b=scanner.nextDouble();
//

        operation= OpFactory.creatOp(op);
        //子类可以调用父类方法，所以当 operation= OpFactory.creatOp(op)后，还能使用operation的setNUMA方法
        operation.setNumA(a);
        operation.setNumB(b);

        System.out.println(operation.getresult());
    }
}
