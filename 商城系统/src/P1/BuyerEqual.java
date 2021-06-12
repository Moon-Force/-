package P1;
import java.util.Scanner;  
public class BuyerEqual {
	public static int count1 = 0;
	//构造无参方法
	public BuyerEqual() {  
    
	}
	
	//验证登录信息的方法
	public boolean equal(String[] username, String[] password) {  
        
        // 由用户输入用户名  
        System.out.println("请输入用户名：");  
        Scanner scanner = new Scanner(System.in);  
        String s2 = scanner.next();  
        
        // 由用户输入密码  
        System.out.println("请输入密码：");  
        //scanner = new Scanner(System.in);  
        String s3 = scanner.next(); 
        
        // 判断用户输入的信息是否和已有的信息一致  
        for(; count1 < 3+Buyer.count ; count1++) {
        	boolean x=s2.equals(username[count1]) && password[count1].equals(s3);
        	if(x==true) {
        		return x;
        	}
        }
        count1=0;
        return false;
        
        
	}  
	
	
}
