package P1;

import java.util.Scanner;

public class Mall {
	public Mall() {
		
	}
	
	public String   goodsName [];   // 商品的名称  
    public int   goodsPrice[];   // 商品的价格 
	public int   goodsId[];     //商品的编号
    public String   username[];  //用户账户
	public String   password[];  //用户密码 
    int    l  = 0;  
    
	//初始化商品信息
	public void setCommodity(String as[], int ad[], int ai[]) {  
        goodsName   = as;  
        goodsPrice  = ad;  
        goodsId = ai;  
    }
	
	//初始化用户信息
	public void setInformation(String ab[],String ac[]) {
		username = ab;
		password = ac;
	}
	
	//展示商城菜单处理在搜索商品时的所有流程
	public void mallMenu(Buyer buyer) {
		System.out.println("请选择：");
		System.out.println("1、展示全部商品");
		System.out.println("2、按商品编号查找");
		System.out.println("3、按分类查找");
		System.out.println("4、返回主菜单");
		
		//从键盘获取用户选择的服务项目
		System.out.println("请选择,输入数字:"); 
	    Scanner scanner = new Scanner(System.in);
	    
	    // 设置标志用于控制循环  
        boolean flag = false;  
        
        do {  
            String s = scanner.next();
            //用户选择商城
            if (s.equals("1")) {
            	showCommodity(0,10);
            	break;
            }
            //选择搜索商品编号
            if (s.equals("2")) {
            	findId();
            	break;
            }
            //选择按分类查找
            if (s.equals("3")) {
            	findShape();
            	break;
            }
            
            if (s.equals("4")) {
            	System.out.print("\n\n请按'n'返回上一级菜单:");  
                Scanner sc = new Scanner(System.in);  
                  
                boolean f = true;  
                do  
                    if (sc.next().equals("n")) {  
                        // 返回上一级菜单，这里新建了一个菜单对象，只是在用户看来其实还是同样的处理流程，  
                        // 不过对于程序来说却又开始了一个新的二级菜单处理流程  
                        Menu menu = new Menu();  
                        menu.setCommodity(goodsName, goodsPrice, goodsId);  
                        menu.setInformation(username,password);
                        menu.secondMenu(buyer);  
                    } else {  
                        System.out.print("输入错误, 请重新'n'返回上一级菜单：");  
                        f = false;  
                    }  
                while (!f);  
            }
            
            System.out.print("输入错误，请重新输入数字：");  
            flag = false;
        }while(!flag);
        
        System.out.print("\n请按'n'返回上一级菜单:");  
		if (scanner.next().equals("n")) {    
			mallMenu(buyer);
		}
	}
	
	//展示所有商品信息
	public void showCommodity(int chu,int mo) {
		for (l = chu; l < mo; l++) {  
			System.out.println((new StringBuilder()).append("商品编号").append(goodsId[l]).append("  ")  
					.append(goodsName[l]).append("  价格：").append(goodsPrice[l]).append("\t").toString());  
		}  
	}
	
	//根据商品编号Id查找
	public void findId() {
		int k,x;
		//从键盘获取用户输入的商品编号
		System.out.println("请输入商品编号:"); 
	    Scanner scanner = new Scanner(System.in);
	    int s = scanner.nextInt();
	    for ( k = 0; k < 10; k++) {
        	if(s==goodsId[k]) {
        		x = 1;
        		break;
        	}
        	else {
        		x = 0;
        	}
        }
	    System.out.println((new StringBuilder()).append("商品编号").append(goodsId[k]).append("  ")  
					.append(goodsName[k]).append("  价格：").append(goodsPrice[k]).append("\t").toString());
	}
	
	//根据商品分类查找
	public void findShape() {
		System.out.println("请选择：");
		System.out.println("1、上衣/外套");
		System.out.println("2、下装");
		System.out.println("3、套装");
		System.out.println("4、运动装备");
		System.out.println("5、配饰");
		//从键盘获取用户选择
	    Scanner scanner = new Scanner(System.in);
	    boolean flag = false;          
        do {  
            String s = scanner.next();
            if (s.equals("1")) {
            	showCommodity(0,3);
            	break;
            }
           
            else if (s.equals("2")) {
            	showCommodity(3,5);
            	break;
            }
           
            else if (s.equals("3")) {
            	showCommodity(5,7);
            	break;
            }
            
            else if (s.equals("4")) {
            	showCommodity(4,7);
            	break;
            }
            
            else if (s.equals("5")) {
            	showCommodity(7,10);
            	break;
            }
            else {
            	System.out.println("输入有误！请重新输入：");
            }
        }while(!flag);
        
        System.out.println("是否继续：按1继续  或 按任意键返回上级");
        String p = scanner.next();
        if(p.equals("1")) {
        	findShape();
        }
      
	}
}
