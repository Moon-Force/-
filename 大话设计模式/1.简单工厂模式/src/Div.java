public class Div extends Operation{

    @Override
    public double getresult() throws Exception {
        if(numB==0){
            throw new Exception("����������Ϊ0");
        }else {
            return numA/numB;
        }
    }
}
