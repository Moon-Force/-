import java.lang.Math;
public class CashReturn extends CashSuper {
    private  double MoneyCondition=0;
    private  double moneyReturn=0;

    public CashReturn(double MoneyCondition, double moneyReturn){
       this.MoneyCondition=MoneyCondition;
       this.moneyReturn=moneyReturn;
   }
    @Override
    public double acceptCash(double Money) {
       double result=Money;
       if(Money>=MoneyCondition){
           result=Money-Math.floor(Money/this.MoneyCondition)*this.moneyReturn;
       }
       return result;
    }
}
