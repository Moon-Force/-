package P1;

import java.util.Random;

public class Pay extends ShoppingCart{
    
	public Pay() {
		super();
    } 
    
	public String   goodsName2 [];   // �蹺��Ʒ������  
    public int   goodsPrice2[];   // �蹺��Ʒ�ļ۸� 
	public int   goodsId2[];     // �蹺��Ʒ�ı��
	public int   goodsNum[];     //�蹺��Ʒ������
	
	public int   orderNum[];     //���涩�����
	
    public String   username[];  //�û��˻�
	public String   password[];  //�û����� 
	
	//��ʼ�����ﳵ��Ʒ��Ϣ
	public void setCommodity(String as[], int ad[], int ai[], int aj[]) {  
	    goodsName2 = as;  
	    goodsPrice2 = ad;  
	    goodsId2 = ai;
	    goodsNum = aj;
	}
		
	//��ʼ���û���Ϣ
	public void setInformation(String ab[],String ac[]) {
		username = ab;
		password = ac;
	}
	
	//�����ܽ��
	public int carPrice() {
		int all = 0;
		int a ;
		for(int i = 0; i < goodsName2.length && goodsName2[i] != null; i++) {
			a = goodsNum[i] * goodsPrice2[i];
			all = all + a ;
		}
		return all;
	}
	
	//����һ����λ���Ķ�����
	public void listNum() {
		StringBuilder str=new StringBuilder();//����䳤�ַ���
		Random random=new Random();
		//����������֣�����ӵ��ַ���
		for(int i=0;i<8;i++){
		    str.append(random.nextInt(10));
		}
		//���ַ���ת��Ϊ���ֲ����
		int num=Integer.parseInt(str.toString());
		System.out.println("������ţ�"+num);
	}
	
	//չʾ�������ܽ��
	public void showList() {
		listNum();
		showCar();
		System.out.println("�ܽ�"+carPrice()+"RMB");
	}
	
	//չʾ���������ﳵ�����
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
