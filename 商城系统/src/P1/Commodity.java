package P1;

public class Commodity {
	public String   goodsName [];   // ��Ʒ������  
    public int   goodsPrice[];   // ��Ʒ�ļ۸�
    public int     goodsId[];
    // Ĭ�Ϲ��췽������ʼ������
    public Commodity() {  
        goodsName   = new String[10] ;  
        goodsPrice  = new int[10] ; 
        goodsId     = new int[10];
    }
    //��Ʒ����
    public void initial() {
    	goodsName[0]="���׳�������";
    	goodsPrice[0]=39;
    	goodsId[0]=1;
    	
    	goodsName[1]="��ɹ��";
    	goodsPrice[1]=49;
    	goodsId[1]=2;
    	
    	goodsName[2]="�п�����";
    	goodsPrice[2]=149;
    	goodsId[2]=3;
    	
    	goodsName[3]="ţ�п�";
    	goodsPrice[3]=129;
    	goodsId[3]=4;
    	
    	goodsName[4]="�˶���";
    	goodsPrice[4]=89;
    	goodsId[4]=5;
    	
    	goodsName[5]="�˶���װ";
    	goodsPrice[5]=179;
    	goodsId[5]=6;
    	
    	goodsName[6]="Ӿ��ȫ��װ��";
    	goodsPrice[6]=109;
    	goodsId[6]=7;
    	
    	goodsName[7]="Ѽ��ñ";
    	goodsPrice[7]=29;
    	goodsId[7]=8;
    	
    	goodsName[8]="ī��";
    	goodsPrice[8]=79;
    	goodsId[8]=9;
    	
    	goodsName[9]="����";
    	goodsPrice[9]=99;
    	goodsId[9]=10;
    }
    
}
