import java.util.Optional;
public class OpFactory {
    public static Operation creatOp(String op){
        Operation oper=null;
        switch (op)
        {
            case "+":
                oper=new Add();
                break;
            case "-":
                oper=new Sub();
                break;
            case "*":
                oper=new Mul();
                break;
            case "/":
                oper=new Div();
                break;
        }
        return oper;
    }
}
