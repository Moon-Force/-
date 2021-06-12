package P1;

public class Buyer {
	public static int count=0;
    public String username[];     // 用户名  
    public String password[];     // 密码  
	//初始化变量（初始系统有3个用户信息，最多储存10个）
	public Buyer() {
		username = new String[10];
		password = new String[10];
	}
	//用户信息
	public void initial() {
		
		username[0] = "ZhangSan";
		password[0] = "12345678";
		
		username[1] = "LiSi";
		password[1] = "77778888";
		
		username[2] = "WangWu";
		password[2] = "987654321";
		
	}
	//添加用户信息
	public void setInformation(String username,String password) {
		count++;
		this.username[count] = username;
		this.password[count] = password;
	}
}
