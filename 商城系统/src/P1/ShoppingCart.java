package P1;

import java.util.Scanner;

public class ShoppingCart extends Start{
	
	public static int count2 = 0;   //���徲̬����
	
	public String   goodsName [];   // ��Ʒ������  
    public int   goodsPrice[];   // ��Ʒ�ļ۸� 
	public int   goodsId[];     //��Ʒ�ı��
    public String   username[];  //�û��˻�
	public String   password[];  //�û�����
	
	public String   goodsName2 [];   // �蹺��Ʒ������  
    public int   goodsPrice2[];   // �蹺��Ʒ�ļ۸� 
	public int   goodsId2[];     // �蹺��Ʒ�ı��
	public int   goodsNum[];     //�蹺��Ʒ������
	
	//���췽����ʼ������
	public ShoppingCart() {  
        goodsName2   = new String[10];  
        goodsPrice2  = new int[10]; 
        goodsId2     = new int[10];
        goodsNum     = new int[10];
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
	
	//���ﳵ�˵�����������
	public void shoppingCarMenu() {
		
		System.out.println("��ѡ��Ҫ���еĲ�����");
		System.out.println("1�������Ʒ�����ﳵ");
		System.out.println("2���ӹ��ﳵɾ����Ʒ");
		System.out.println("3����չ��ﳵ");
		System.out.println("4���鿴���ﳵ");
		System.out.println("5������");
		
		//�Ӽ��̻�ȡ�û�ѡ��ķ�����Ŀ
		System.out.println("��ѡ��,��������:"); 
		Scanner scanner = new Scanner(System.in);
			    
		// ���ñ�־���ڿ���ѭ��  
        boolean flag = false;  
		String s;    
        do {  
            s = scanner.next();
	        //�û�ѡ�������Ʒ
            if (s.equals("1")) {
            	setCar();
	        	break;
            }
		    //�û�ѡ��ɾ����Ʒ 
            if (s.equals("2")) {  
            	delete();
                break;  
            }
		    //�û�ѡ����չ��ﳵ
            if (s.equals("3")) {
            	emptyCar();
            	System.out.println("��ճɹ���");
		        break;
		    }
            //�û�ѡ��鿴���ﳵ
            if(s.equals("4")) {
            	showCar();
            	break;
            }
          //�û�ѡ����㣨���ɶ�����
            if (s.equals("5")) {
            	//���������Ͷ�����Ķ��󣬼���۸�չʾ����
            	Pay pay = new Pay();  
            	pay.setCommodity(goodsName2, goodsPrice2, goodsId2,goodsNum);
                pay.setInformation(username,password);
                pay.showList();
                break;
            }
            
            System.out.print("��������������������֣�");  
            flag = false; 
            
        }while(!flag);
        
		System.out.print("\n�밴'n'������һ���˵�:");  
		if (scanner.next().equals("n")) {    
			shoppingCarMenu();
		}
	
	}
	
	//�����û���Ҫ����Ʒ
	public void setCar() {
		int p ;
		int x = 0;
		int k = 0;
		do {
			System.out.print("��������Ҫ���빺�ﳵ����Ʒ���(ÿ����һ�����(1-10)��");  
	        Scanner scanner = new Scanner(System.in);  
	        int n = scanner.nextInt();
	        if(n <= 10) {
	        	System.out.print("������������");    
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
	        	System.out.println("����Ʒ��Ų����ڣ�");
	        }
	        System.out.println("�Ƿ���������Ʒ��1����   0����");
	        int p1 = scanner.nextInt();
	        p = p1;
	        
		}while(p == 1);
	}
	
    //�ӹ��ﳵɾ����Ʒ
    public void delete() {
    	int p ;
    	String n1;
    	int n2,n3,n4;
		int x = 0;
		int k = 0;
		do {
			System.out.print("������Ҫɾ������Ʒ���(ÿ����һ�����)��");  
	        Scanner scanner = new Scanner(System.in);  
	        int n = scanner.nextInt();
	        
	        System.out.print("������������");    
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
	        		System.out.println("�������������");
	        	}
	        	else if(goodsNum[k] - num > 0 ) {
	        		goodsNum[k] = goodsNum[k] - num;
	        		System.out.println("ɾ���ɹ���");
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
	        			System.out.println("ɾ���ɹ���");
	        		}
	        	}
	        }
	        else {
	        	System.out.println("δ�ҵ�����Ʒ��");
	        }
	        
	        System.out.println("�Ƿ������1����   0����");
	        int p1 = scanner.nextInt();
	        p = p1;
	        
		}while(p == 1);
    }	
	
    //��չ��ﳵ
    public void emptyCar() {
    	for(int o = 0; o < goodsName2.length; o++) {
    		goodsName2[o] = null;
    	}
    	
    }
    
	//չʾ���ﳵ���
	public void showCar() {
		if(goodsName2[0]==null)
		{
			System.out.println("���Ĺ��ﳵ������Ʒ��");
		}
		else {
			for (int l = 0; l < goodsName2.length && goodsName2[l] != null; l++) {  
				System.out.println((new StringBuilder()).append("��Ʒ���").append(goodsId2[l]).
					append("  ").append(goodsName2[l]).append("  ���ۣ�").append(goodsPrice2[l]).
					append("  ������").append(goodsNum[l]).append("\t").toString());  
			}
		}  
	}
		
		
	
	
}
