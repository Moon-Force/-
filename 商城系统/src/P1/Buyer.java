package P1;

public class Buyer {
	public static int count=0;
    public String username[];     // �û���  
    public String password[];     // ����  
	//��ʼ����������ʼϵͳ��3���û���Ϣ����ഢ��10����
	public Buyer() {
		username = new String[10];
		password = new String[10];
	}
	//�û���Ϣ
	public void initial() {
		
		username[0] = "ZhangSan";
		password[0] = "12345678";
		
		username[1] = "LiSi";
		password[1] = "77778888";
		
		username[2] = "WangWu";
		password[2] = "987654321";
		
	}
	//����û���Ϣ
	public void setInformation(String username,String password) {
		count++;
		this.username[count] = username;
		this.password[count] = password;
	}
}
