import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Operation operation;
        String op;
        Scanner scanner=new Scanner(System.in);
//
        System.out.println("����a");
        double a=scanner.nextDouble();
//
        System.out.println("�������");
        op=scanner.next();
//
        System.out.println("����b");
        double b=scanner.nextDouble();
//

        operation= OpFactory.creatOp(op);
        //������Ե��ø��෽�������Ե� operation= OpFactory.creatOp(op)�󣬻���ʹ��operation��setNUMA����
        operation.setNumA(a);
        operation.setNumB(b);

        System.out.println(operation.getresult());
    }
}
