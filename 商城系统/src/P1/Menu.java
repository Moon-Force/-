package P1;
//import java.io.InputStream;
import java.util.Scanner;

public class Menu {
	
	public String   goodsName [];   // ��Ʒ������  
    public int   goodsPrice[];   // ��Ʒ�ļ۸� 
	public int   goodsId[];     //��Ʒ�ı��
    public String   username[];  //�û��˻�
	public String   password[];  //�û�����
	
	public Menu() {


	}
	
	//���ò˵����е���Ʒ��Ϣ
	public void setCommodity(String as[], int ad[], int ai[]) {  
        goodsName   = as;  
        goodsPrice  = ad;  
        goodsId = ai;  
    }
	
	//���ò˵����е��û���Ϣ
	public void setInformation(String ab[],String ac[]) {
		username = ab;
		password = ac;
	}
	
	//��ʾ��½���棨һ���˵���
	public void firstMenu(Buyer buyer){
		
		System.out.println("*************************");
		System.out.println("*****��ӭʹ�ù���ϵͳ*****");
		System.out.println("*************************");
		System.out.println("��ѡ�� 1����¼");
		System.out.println("        2��ע��");
		System.out.println("        3���˳�");
		
		// �ñ�־�����ж��Ƿ�����ϵͳ�������󣬵�����������ʱ��flagΪ�٣��Ӷ��˳�ϵͳ��Ĭ��Ϊ�޴���
		boolean flag = true; 
		
		// ��������ϵͳ������  
        do {  
            // �������������˳�ϵͳ  
            if (!flag)  
                break;
		
        // ������֤�û���¼���˻��������Ƿ���ȷ����Ķ���
        BuyerEqual buyerequal = new BuyerEqual();      
        // ����һ���˵��е�ѡ��      
        Scanner scanner = new Scanner(System.in);  
        int n = scanner.nextInt();  
		
		 // �����û���һ���˵���ѡ��������ͬ����Ӧ  
        switch (n) {  
            case 1: // �û�ѡ��"��¼ϵͳ"  
                // �����¼ϵͳ������  
                do {  
                    if (buyerequal.equal(buyer.username,  
                                           buyer.password)) {  
                        // �û���¼�ɹ�����ʾ��������˵�
                    	System.out.println("��ӭ�û�"+buyer.username[buyerequal.count1]+"!");
                        secondMenu(buyer);  
                        break;  
                    }     
                    else {  
                    	// �û���������������������
                        System.out.println("\n�û��������벻ƥ�䣬���������룺");  
                    }  
                      
                } while (true);  
                break;  
  
            case 2: // �û�ѡ��ע��  
            	System.out.print("�������µ��û�����");  
                buyer.username[buyer.count] = scanner.next();  
                System.out.print("�������µ����룺");  
                buyer.password[buyer.count] = scanner.next();
                System.out.println("��ӭ�û�"+buyer.username[buyerequal.count1]+"!");
                secondMenu(buyer);
                break;  
  
            case 3: // �û�ѡ��"�˳�"  
                  
                System.out.println("��л����ʹ�ã�");  
                System.exit(0);  
                break;  
  
            default: // һ���˵����������Ҫ����ѡ��  
                  
                System.out.print("\n��������������ѡ����������: ");  
                break;  
        }  
       
    } while (flag);  
		
		
    }
	
	//��ʾ���˵��������˵���
	void secondMenu(Buyer buyer) {
		System.out.println("���˵�");
		System.out.println("1���̳�");
		System.out.println("2�����ﳵ");
		System.out.println("3���˳���¼");
		System.out.println("4���˳�ϵͳ");
		
		//�Ӽ��̻�ȡ�û�ѡ��ķ�����Ŀ
		System.out.println("��ѡ��,��������:"); 
	    Scanner scanner = new Scanner(System.in);
	    
	    // ���ñ�־���ڿ���ѭ��  
        boolean flag = false;  
        
        do {  
            String s = scanner.next();
            //�û�ѡ���̳�
            if (s.equals("1")) {
            	Mall mall=new Mall();
            	mall.setCommodity(goodsName,goodsPrice,goodsId);  
        		mall.setInformation(username,password);
            	mall.mallMenu(buyer);
            	break;
            }
            //�û�ѡ���� 
            if (s.equals("2")) {  
                // ���幺����Ķ��󣬲������������������  
                ShoppingCart car = new ShoppingCart();
                car.setCommodity(goodsName, goodsPrice, goodsId);
                car.setInformation(username,password);
                car.shoppingCarMenu();
                break;  
            }
            
            //�û�ѡ���˳���¼
            if(s.equals("3")) {
            	firstMenu(buyer);
            	break;
            }
            
            //�û�ѡ���˳�ϵͳ
            if(s.equals("4")) {
            	System.out.println("��л����ʹ�ã�");  
                System.exit(0);
                break;
            } 
            
        }while(!flag);
        
        System.out.print("\n�밴'n'������һ���˵�:");  
        if (scanner.next().equals("n")) {  
            // ������һ���˵��������½���һ���˵�����ֻ�����û�������ʵ����ͬ���Ĵ������̣�  
            // �������ڳ�����˵ȴ�ֿ�ʼ��һ���µĶ����˵���������  
            Menu menu = new Menu();  
            menu.setCommodity(goodsName, goodsPrice, goodsId);  
            menu.setInformation(username, password); 
            secondMenu(buyer);
        }
        
	    scanner.close();

	}
	
}