package P1;

import java.util.Scanner;

public class Mall {
	public Mall() {
		
	}
	
	public String   goodsName [];   // ��Ʒ������  
    public int   goodsPrice[];   // ��Ʒ�ļ۸� 
	public int   goodsId[];     //��Ʒ�ı��
    public String   username[];  //�û��˻�
	public String   password[];  //�û����� 
    int    l  = 0;  
    
	//��ʼ����Ʒ��Ϣ
	public void setCommodity(String as[], int ad[], int ai[]) {  
        goodsName   = as;  
        goodsPrice  = ad;  
        goodsId = ai;  
    }
	
	//��ʼ���û���Ϣ
	public void setInformation(String ab[],String ac[]) {
		username = ab;
		password = ac;
	}
	
	//չʾ�̳ǲ˵�������������Ʒʱ����������
	public void mallMenu(Buyer buyer) {
		System.out.println("��ѡ��");
		System.out.println("1��չʾȫ����Ʒ");
		System.out.println("2������Ʒ��Ų���");
		System.out.println("3�����������");
		System.out.println("4���������˵�");
		
		//�Ӽ��̻�ȡ�û�ѡ��ķ�����Ŀ
		System.out.println("��ѡ��,��������:"); 
	    Scanner scanner = new Scanner(System.in);
	    
	    // ���ñ�־���ڿ���ѭ��  
        boolean flag = false;  
        
        do {  
            String s = scanner.next();
            //�û�ѡ���̳�
            if (s.equals("1")) {
            	showCommodity(0,10);
            	break;
            }
            //ѡ��������Ʒ���
            if (s.equals("2")) {
            	findId();
            	break;
            }
            //ѡ�񰴷������
            if (s.equals("3")) {
            	findShape();
            	break;
            }
            
            if (s.equals("4")) {
            	System.out.print("\n\n�밴'n'������һ���˵�:");  
                Scanner sc = new Scanner(System.in);  
                  
                boolean f = true;  
                do  
                    if (sc.next().equals("n")) {  
                        // ������һ���˵��������½���һ���˵�����ֻ�����û�������ʵ����ͬ���Ĵ������̣�  
                        // �������ڳ�����˵ȴ�ֿ�ʼ��һ���µĶ����˵���������  
                        Menu menu = new Menu();  
                        menu.setCommodity(goodsName, goodsPrice, goodsId);  
                        menu.setInformation(username,password);
                        menu.secondMenu(buyer);  
                    } else {  
                        System.out.print("�������, ������'n'������һ���˵���");  
                        f = false;  
                    }  
                while (!f);  
            }
            
            System.out.print("��������������������֣�");  
            flag = false;
        }while(!flag);
        
        System.out.print("\n�밴'n'������һ���˵�:");  
		if (scanner.next().equals("n")) {    
			mallMenu(buyer);
		}
	}
	
	//չʾ������Ʒ��Ϣ
	public void showCommodity(int chu,int mo) {
		for (l = chu; l < mo; l++) {  
			System.out.println((new StringBuilder()).append("��Ʒ���").append(goodsId[l]).append("  ")  
					.append(goodsName[l]).append("  �۸�").append(goodsPrice[l]).append("\t").toString());  
		}  
	}
	
	//������Ʒ���Id����
	public void findId() {
		int k,x;
		//�Ӽ��̻�ȡ�û��������Ʒ���
		System.out.println("��������Ʒ���:"); 
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
	    System.out.println((new StringBuilder()).append("��Ʒ���").append(goodsId[k]).append("  ")  
					.append(goodsName[k]).append("  �۸�").append(goodsPrice[k]).append("\t").toString());
	}
	
	//������Ʒ�������
	public void findShape() {
		System.out.println("��ѡ��");
		System.out.println("1������/����");
		System.out.println("2����װ");
		System.out.println("3����װ");
		System.out.println("4���˶�װ��");
		System.out.println("5������");
		//�Ӽ��̻�ȡ�û�ѡ��
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
            	System.out.println("�����������������룺");
            }
        }while(!flag);
        
        System.out.println("�Ƿ��������1����  �� ������������ϼ�");
        String p = scanner.next();
        if(p.equals("1")) {
        	findShape();
        }
      
	}
}
