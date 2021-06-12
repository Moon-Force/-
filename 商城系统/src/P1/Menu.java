package P1;
//import java.io.InputStream;
import java.util.Scanner;

public class Menu {
	
	public String   goodsName [];   // 商品的名称  
    public int   goodsPrice[];   // 商品的价格 
	public int   goodsId[];     //商品的编号
    public String   username[];  //用户账户
	public String   password[];  //用户密码
	
	public Menu() {


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
	
	//显示登陆界面（一级菜单）
	public void firstMenu(Buyer buyer){
		
		System.out.println("*************************");
		System.out.println("*****欢迎使用购物系统*****");
		System.out.println("*************************");
		System.out.println("请选择： 1、登录");
		System.out.println("        2、注册");
		System.out.println("        3、退出");
		
		// 该标志用来判断是否发生了系统操作错误，当操作不当的时候flag为假，从而退出系统，默认为无错误
		boolean flag = true; 
		
		// 处理整个系统的流程  
        do {  
            // 发生操作错误，退出系统  
            if (!flag)  
                break;
		
        // 创建验证用户登录的账户和密码是否正确的类的对象
        BuyerEqual buyerequal = new BuyerEqual();      
        // 输入一级菜单中的选择      
        Scanner scanner = new Scanner(System.in);  
        int n = scanner.nextInt();  
		
		 // 根据用户对一级菜单的选择做出不同的响应  
        switch (n) {  
            case 1: // 用户选择"登录系统"  
                // 处理登录系统的流程  
                do {  
                    if (buyerequal.equal(buyer.username,  
                                           buyer.password)) {  
                        // 用户登录成功，显示购物二级菜单
                    	System.out.println("欢迎用户"+buyer.username[buyerequal.count1]+"!");
                        secondMenu(buyer);  
                        break;  
                    }     
                    else {  
                    	// 用户输入有误，允许重新输入
                        System.out.println("\n用户名和密码不匹配，请重新输入：");  
                    }  
                      
                } while (true);  
                break;  
  
            case 2: // 用户选择注册  
            	System.out.print("请输入新的用户名：");  
                buyer.username[buyer.count] = scanner.next();  
                System.out.print("请输入新的密码：");  
                buyer.password[buyer.count] = scanner.next();
                System.out.println("欢迎用户"+buyer.username[buyerequal.count1]+"!");
                secondMenu(buyer);
                break;  
  
            case 3: // 用户选择"退出"  
                  
                System.out.println("感谢您的使用！");  
                System.exit(0);  
                break;  
  
            default: // 一级菜单输入错误，需要重新选择  
                  
                System.out.print("\n输入有误！请重新选择，输入数字: ");  
                break;  
        }  
       
    } while (flag);  
		
		
    }
	
	//显示主菜单（二级菜单）
	void secondMenu(Buyer buyer) {
		System.out.println("主菜单");
		System.out.println("1、商城");
		System.out.println("2、购物车");
		System.out.println("3、退出登录");
		System.out.println("4、退出系统");
		
		//从键盘获取用户选择的服务项目
		System.out.println("请选择,输入数字:"); 
	    Scanner scanner = new Scanner(System.in);
	    
	    // 设置标志用于控制循环  
        boolean flag = false;  
        
        do {  
            String s = scanner.next();
            //用户选择商城
            if (s.equals("1")) {
            	Mall mall=new Mall();
            	mall.setCommodity(goodsName,goodsPrice,goodsId);  
        		mall.setInformation(username,password);
            	mall.mallMenu(buyer);
            	break;
            }
            //用户选择购物 
            if (s.equals("2")) {  
                // 定义购物类的对象，并处理整个购物的流程  
                ShoppingCart car = new ShoppingCart();
                car.setCommodity(goodsName, goodsPrice, goodsId);
                car.setInformation(username,password);
                car.shoppingCarMenu();
                break;  
            }
            
            //用户选择退出登录
            if(s.equals("3")) {
            	firstMenu(buyer);
            	break;
            }
            
            //用户选择退出系统
            if(s.equals("4")) {
            	System.out.println("感谢您的使用！");  
                System.exit(0);
                break;
            } 
            
        }while(!flag);
        
        System.out.print("\n请按'n'返回上一级菜单:");  
        if (scanner.next().equals("n")) {  
            // 返回上一级菜单，这里新建了一个菜单对象，只是在用户看来其实还是同样的处理流程，  
            // 不过对于程序来说却又开始了一个新的二级菜单处理流程  
            Menu menu = new Menu();  
            menu.setCommodity(goodsName, goodsPrice, goodsId);  
            menu.setInformation(username, password); 
            secondMenu(buyer);
        }
        
	    scanner.close();

	}
	
}