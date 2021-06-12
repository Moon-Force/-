package P1;
//import java.io.InputStream;
import java.util.Scanner;  

public class Start {
	public Menu menu;
	//空构造方法
	public Start() {
	}
	//系统主方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 创建已有的数据类的对象，并初始化已有的商品信息和顾客信息 
		Commodity commodity=new Commodity();
		commodity.initial();
		Buyer buyer=new Buyer();
		buyer.initial();
		//创建菜单对象
		Menu menu = new Menu();
		//将初始化的已有数据信息送给了菜单对象  
		menu.setCommodity(  
                commodity.goodsName,   
                commodity.goodsPrice,   
                commodity.goodsId);  
		menu.setInformation(buyer.username,
							buyer.password);
		//显示登陆界面及处理流程
		menu.firstMenu(buyer);
		
		
//		// 该标志用来判断是否发生了系统操作错误，当操作不当的时候flag为假，从而退出系统，默认为无错误
//		boolean flag = true; 
//		
//		// 处理整个系统的流程  
//        do {  
//            // 发生操作错误，退出系统  
//            if (!flag)  
//                break;
//		
//        // 创建验证用户登录的账户和密码是否正确的类的对象
//        BuyerEqual buyerequal = new BuyerEqual();      
//        // 输入一级菜单中的选择      
//        Scanner scanner = new Scanner(System.in);  
//        int n = scanner.nextInt();  
//		
//		 // 根据用户对一级菜单的选择做出不同的响应  
//        switch (n) {  
//            case 1: // 用户选择"登录系统"  
//                // 处理登录系统的流程  
//                do {  
//                    if (buyerequal.equal(buyer.username,  
//                                           buyer.password)) {  
//                        // 用户登录成功，显示购物二级菜单
//                    	System.out.println("欢迎用户"+buyer.username[buyerequal.count1]+"!");
//                        menu.secondMenu();  
//                        break;  
//                    }     
//                    else {  
//                    	// 用户输入有误，允许重新输入
//                        System.out.println("\n用户名和密码不匹配，请重新输入：");  
//                    }  
//                      
//                } while (true);  
//                break;  
//  
//            case 2: // 用户选择注册  
//            	System.out.print("请输入新的用户名：");  
//                buyer.username[buyer.count] = scanner.next();  
//                System.out.print("请输入新的密码：");  
//                buyer.password[buyer.count] = scanner.next();
//                System.out.println("欢迎用户"+buyer.username[buyerequal.count1]+"!");
//                menu.secondMenu();
//                break;  
//  
//            case 3: // 用户选择"退出"  
//                  
//                System.out.println("感谢您的使用！");  
//                System.exit(0);  
//                break;  
//  
//            default: // 一级菜单输入错误，需要重新选择  
//                  
//                System.out.print("\n输入有误！请重新选择，输入数字: ");  
//                break;  
//        }  
//       
//    } while (flag);  
     
}  		
	
	}