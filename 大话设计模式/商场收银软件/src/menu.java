import java.awt.*;
import java.util.Scanner;

public class menu {
    public menu(){
        new Myframe();
        int num;   double price;   double result;
        String type ;
        CashSuper c1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入数量");
        num=scanner.nextInt();
        System.out.println("输入价格");
        price=scanner.nextDouble();
        result=num*price;
        System.out.println("价格计算方式");
        type=scanner.next();
       c1=CashFactory.createCashAccepter(type);
        System.out.println( c1.acceptCash(result));
    }
}
