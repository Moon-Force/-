package P1;
//import java.io.InputStream;
import java.util.Scanner;  

public class Start {
	public Menu menu;
	//�չ��췽��
	public Start() {
	}
	//ϵͳ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �������е�������Ķ��󣬲���ʼ�����е���Ʒ��Ϣ�͹˿���Ϣ 
		Commodity commodity=new Commodity();
		commodity.initial();
		Buyer buyer=new Buyer();
		buyer.initial();
		//�����˵�����
		Menu menu = new Menu();
		//����ʼ��������������Ϣ�͸��˲˵�����  
		menu.setCommodity(  
                commodity.goodsName,   
                commodity.goodsPrice,   
                commodity.goodsId);  
		menu.setInformation(buyer.username,
							buyer.password);
		//��ʾ��½���漰��������
		menu.firstMenu(buyer);
		
		
//		// �ñ�־�����ж��Ƿ�����ϵͳ�������󣬵�����������ʱ��flagΪ�٣��Ӷ��˳�ϵͳ��Ĭ��Ϊ�޴���
//		boolean flag = true; 
//		
//		// ��������ϵͳ������  
//        do {  
//            // �������������˳�ϵͳ  
//            if (!flag)  
//                break;
//		
//        // ������֤�û���¼���˻��������Ƿ���ȷ����Ķ���
//        BuyerEqual buyerequal = new BuyerEqual();      
//        // ����һ���˵��е�ѡ��      
//        Scanner scanner = new Scanner(System.in);  
//        int n = scanner.nextInt();  
//		
//		 // �����û���һ���˵���ѡ��������ͬ����Ӧ  
//        switch (n) {  
//            case 1: // �û�ѡ��"��¼ϵͳ"  
//                // �����¼ϵͳ������  
//                do {  
//                    if (buyerequal.equal(buyer.username,  
//                                           buyer.password)) {  
//                        // �û���¼�ɹ�����ʾ��������˵�
//                    	System.out.println("��ӭ�û�"+buyer.username[buyerequal.count1]+"!");
//                        menu.secondMenu();  
//                        break;  
//                    }     
//                    else {  
//                    	// �û���������������������
//                        System.out.println("\n�û��������벻ƥ�䣬���������룺");  
//                    }  
//                      
//                } while (true);  
//                break;  
//  
//            case 2: // �û�ѡ��ע��  
//            	System.out.print("�������µ��û�����");  
//                buyer.username[buyer.count] = scanner.next();  
//                System.out.print("�������µ����룺");  
//                buyer.password[buyer.count] = scanner.next();
//                System.out.println("��ӭ�û�"+buyer.username[buyerequal.count1]+"!");
//                menu.secondMenu();
//                break;  
//  
//            case 3: // �û�ѡ��"�˳�"  
//                  
//                System.out.println("��л����ʹ�ã�");  
//                System.exit(0);  
//                break;  
//  
//            default: // һ���˵����������Ҫ����ѡ��  
//                  
//                System.out.print("\n��������������ѡ����������: ");  
//                break;  
//        }  
//       
//    } while (flag);  
     
}  		
	
	}