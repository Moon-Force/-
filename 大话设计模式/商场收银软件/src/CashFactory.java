public class CashFactory {
    public static CashSuper createCashAccepter(String type)
    {
      CashSuper cs=null;
      switch(type)
      {
          case"�����շ�":
              cs=new CashNormal();
              break;
          case"��8��":
              CashRebate cr1= new CashRebate(0.8);
              cs = cr1;
              break;
          case"��300��100":
              CashReturn cr2=new CashReturn(300,100);
              cs=cr2;
              break;
          default:
              throw new IllegalStateException("Unexpected value: " + type);
      }
      return cs;
    }
}
