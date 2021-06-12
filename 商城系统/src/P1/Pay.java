package P1;

import java.util.Random;

public class Pay extends ShoppingCart{
    
	public Pay() {
		super();
    } 
    
	public String   goodsName2 [];   // 需购商品的名称  
    public int   goodsPrice2[];   // 需购商品的价格 
	public int   goodsId2[];     // 需购商品的编号
	public int   goodsNum[];     //需购商品的数量
	
	public int   orderNum[];     //储存订单编号
	
    public String   username[];  //用户账户
	public String   password[];  //用户密码 
	
	//初始化购物车商品信息
	public void setCommodity(String as[], int ad[], int ai[], int aj[]) {  
	    goodsName2 = as;  
	    goodsPrice2 = ad;  
	    goodsId2 = ai;
	    goodsNum = aj;
	}
		
	//初始化用户信息
	public void setInformation(String ab[],String ac[]) {
		username = ab;
		password = ac;
	}
	
	//计算总金额
	public int carPrice() {
		int all = 0;
		int a ;
		for(int i = 0; i < goodsName2.length && goodsName2[i] != null; i++) {
			a = goodsNum[i] * goodsPrice2[i];
			all = all + a ;
		}
		return all;
	}
	
	//生成一个八位数的订单号
	public void listNum() {
		StringBuilder str=new StringBuilder();//定义变长字符串
		Random random=new Random();
		//随机生成数字，并添加到字符串
		for(int i=0;i<8;i++){
		    str.append(random.nextInt(10));
		}
		//将字符串转换为数字并输出
		int num=Integer.parseInt(str.toString());
		System.out.println("订单编号："+num);
	}
	
	//展示订单及总金额
	public void showList() {
		listNum();
		showCar();
		System.out.println("总金额："+carPrice()+"RMB");
	}
	
	//展示订单（购物车情况）
	public void showCar() {
		if(goodsName2[0]==null)
		{
			System.out.println("您的购物车暂无商品！");
		}
		else {
			for (int l = 0; l < goodsName2.length && goodsName2[l] != null; l++) {  
				System.out.println((new StringBuilder()).append("商品编号").append(goodsId2[l]).
					append("  ").append(goodsName2[l]).append("  单价：").append(goodsPrice2[l]).
					append("  数量：").append(goodsNum[l]).append("\t").toString());  
			}
		}
	}
	
}
