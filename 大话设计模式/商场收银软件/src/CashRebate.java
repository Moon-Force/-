public class CashRebate extends CashSuper{
    private double moneyRebate;
   public CashRebate(double moneyRebate) {
       this.moneyRebate = moneyRebate;
   }
    @Override
    public double acceptCash(double Money) {
        return Money*this.moneyRebate;
    }
}
