package P1;

import java.util.Scanner;

public class ShoppingCart extends Start{
	
	public static int count2 = 0;   //定义静态变量
	
	public String   goodsName [];   // 商品的名称  
    public int   goodsPrice[];   // 商品的价格 
	public int   goodsId[];     //商品的编号
    public String   username[];  //用户账户
	public String   password[];  //用户密码
	
	public String   goodsName2 [];   // 需购商品的名称  
    public int   goodsPrice2[];   // 需购商品的价格 
	public int   goodsId2[];     // 需购商品的编号
	public int   goodsNum[];     //需购商品的数量
	
	//构造方法初始化变量
	public ShoppingCart() {  
        goodsName2   = new String[10];  
        goodsPrice2  = new int[10]; 
        goodsId2     = new int[10];
        goodsNum     = new int[10];
    }
	
	//设置菜单类中的商品信息
	public void setCommodity(String as[], int ad[], int ai[]) {  
        goodsName   = as;  
        goodsPrice  = ad;  
        goodsId = ai;  
    }
		
	//设置菜单类中的用户信息
	public void setInformation(String ab[],String ac[]) {
		username = ab;
		password = ac;
	}
	
	//购物车菜单及处理流程
	public void shoppingCarMenu() {
		
		System.out.println("请选择要进行的操作：");
		System.out.println("1、添加商品到购物车");
		System.out.println("2、从购物车删除商品");
		System.out.println("3、清空购物车");
		System.out.println("4、查看购物车");
		System.out.println("5、结算");
		
		//从键盘获取用户选择的服务项目
		System.out.println("请选择,输入数字:"); 
		Scanner scanner = new Scanner(System.in);
			    
		// 设置标志用于控制循环  
        boolean flag = false;  
		String s;    
        do {  
            s = scanner.next();
	        //用户选择添加商品
            if (s.equals("1")) {
            	setCar();
	        	break;
            }
		    //用户选择删除商品 
            if (s.equals("2")) {  
            	delete();
                break;  
            }
		    //用户选择清空购物车
            if (s.equals("3")) {
            	emptyCar();
            	System.out.println("清空成功！");
		        break;
		    }
            //用户选择查看购物车
            if(s.equals("4")) {
            	showCar();
            	break;
            }
          //用户选择结算（生成订单）
            if (s.equals("5")) {
            	//定义结算类和订单类的对象，计算价格并展示订单
            	Pay pay = new Pay();  
            	pay.setCommodity(goodsName2, goodsPrice2, goodsId2,goodsNum);
                pay.setInformation(username,password);
                pay.showList();
                break;
            }
            
            System.out.print("输入错误，请重新输入数字：");  
            flag = false; 
            
        }while(!flag);
        
		System.out.print("\n请按'n'返回上一级菜单:");  
		if (scanner.next().equals("n")) {    
			shoppingCarMenu();
		}
	
	}
	
	//储存用户需要的物品
	public void setCar() {
		int p ;
		int x = 0;
		int k = 0;
		do {
			System.out.print("请输入需要加入购物车的商品编号(每次限一个编号(1-10)：");  
	        Scanner scanner = new Scanner(System.in);  
	        int n = scanner.nextInt();
	        if(n <= 10) {
	        	System.out.print("请输入数量：");    
	        	int num = scanner.nextInt();
	        
	        	for ( k = 0; k <= count2; k++) {
	        		if(n==goodsId2[k]) {
	        			x = 1;
	        			break;
	        		}
	        		else {
	        			x = 0;
	        		}
	        	}
	        
	        	if(x==1) {
	        		goodsNum[k] = goodsNum[k] + num;
	        	}
	        	else {
	        		goodsId2[count2] = n;
	        		goodsName2[count2] = goodsName[n-1];
	        		goodsPrice2[count2] = goodsPrice[n-1];
	        		goodsNum[count2] =  num;
	        		count2++;
	        	}
	        }
	        else {
	        	System.out.println("该商品编号不存在！");
	        }
	        System.out.println("是否继续添加商品：1、是   0、否");
	        int p1 = scanner.nextInt();
	        p = p1;
	        
		}while(p == 1);
	}
	
    //从购物车删除物品
    public void delete() {
    	int p ;
    	String n1;
    	int n2,n3,n4;
		int x = 0;
		int k = 0;
		do {
			System.out.print("请输入要删除的商品编号(每次限一个编号)：");  
	        Scanner scanner = new Scanner(System.in);  
	        int n = scanner.nextInt();
	        
	        System.out.print("请输入数量：");    
	        int num = scanner.nextInt();
	        
	        for ( k = 0; k < count2 ; k++) {
	        	if(n==goodsId2[k]) {
	        		x = 1;
	        		break;
	        	}
	        	else {
	        		x = 0;
	        	}
	        }
	        
	        if(x==1) {
	        	if(goodsNum[k] - num < 0) {
	        		System.out.println("超出最大数量！");
	        	}
	        	else if(goodsNum[k] - num > 0 ) {
	        		goodsNum[k] = goodsNum[k] - num;
	        		System.out.println("删除成功！");
	        	}
	        	else {
	        		for(int j = k; j < count2; j++) {
	        			goodsName2[j] = goodsName2[j+1];
	        			goodsPrice2[j] = goodsPrice2[j+1];
	        			goodsId2[j] = goodsId2[j+1];
	        			goodsNum[j] = goodsNum[j+1];
	        			if(j+1==count2) {
	        				goodsName2[j+1]=null;
	        			}
	        			System.out.println("删除成功！");
	        		}
	        	}
	        }
	        else {
	        	System.out.println("未找到该商品！");
	        }
	        
	        System.out.println("是否继续：1、是   0、否");
	        int p1 = scanner.nextInt();
	        p = p1;
	        
		}while(p == 1);
    }	
	
    //清空购物车
    public void emptyCar() {
    	for(int o = 0; o < goodsName2.length; o++) {
    		goodsName2[o] = null;
    	}
    	
    }
    
	//展示购物车情况
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
