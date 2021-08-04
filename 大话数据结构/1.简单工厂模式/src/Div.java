public class Div extends Operation{

    @Override
    public double getresult() throws Exception {
        if(numB==0){
            throw new Exception("被除数不能为0");
        }else {
            return numA/numB;
        }
    }
}
