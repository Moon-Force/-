package P1;
import java.util.Scanner;  
public class BuyerEqual {
	public static int count1 = 0;
	//�����޲η���
	public BuyerEqual() {  
    
	}
	
	//��֤��¼��Ϣ�ķ���
	public boolean equal(String[] username, String[] password) {  
        
        // ���û������û���  
        System.out.println("�������û�����");  
        Scanner scanner = new Scanner(System.in);  
        String s2 = scanner.next();  
        
        // ���û���������  
        System.out.println("���������룺");  
        //scanner = new Scanner(System.in);  
        String s3 = scanner.next(); 
        
        // �ж��û��������Ϣ�Ƿ�����е���Ϣһ��  
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
