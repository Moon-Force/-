package P1;

public class Commodity {
	public String   goodsName [];   // 商品的名称  
    public int   goodsPrice[];   // 商品的价格
    public int     goodsId[];
    // 默认构造方法，初始化变量
    public Commodity() {  
        goodsName   = new String[10] ;  
        goodsPrice  = new int[10] ; 
        goodsId     = new int[10];
    }
    //商品数据
    public void initial() {
    	goodsName[0]="纯白长袖上衣";
    	goodsPrice[0]=39;
    	goodsId[0]=1;
    	
    	goodsName[1]="防晒衣";
    	goodsPrice[1]=49;
    	goodsId[1]=2;
    	
    	goodsName[2]="夹克外套";
    	goodsPrice[2]=149;
    	goodsId[2]=3;
    	
    	goodsName[3]="牛仔裤";
    	goodsPrice[3]=129;
    	goodsId[3]=4;
    	
    	goodsName[4]="运动裤";
    	goodsPrice[4]=89;
    	goodsId[4]=5;
    	
    	goodsName[5]="运动套装";
    	goodsPrice[5]=179;
    	goodsId[5]=6;
    	
    	goodsName[6]="泳衣全套装备";
    	goodsPrice[6]=109;
    	goodsId[6]=7;
    	
    	goodsName[7]="鸭舌帽";
    	goodsPrice[7]=29;
    	goodsId[7]=8;
    	
    	goodsName[8]="墨镜";
    	goodsPrice[8]=79;
    	goodsId[8]=9;
    	
    	goodsName[9]="背包";
    	goodsPrice[9]=99;
    	goodsId[9]=10;
    }
    
}
