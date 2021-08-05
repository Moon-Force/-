
public class onecup {

teamilk teamilk;
addfood addfood;
int a;
int b;
 
public onecup(teamilk getteamilk, addfood getaddfood, int a2, int b2) {
	// TODO Auto-generated constructor stub
	this.teamilk=getteamilk;
	this.addfood=getaddfood;
	this.a=a2;
	this.b=b2;
}

public String sweetdegree(int a) {
	if(a==1) {
		return "无糖";
	}else if(a==2) {
		return "半糖";
	}else  if(a==3){
		return"全糖";
	}else {
		return"请输入1~3来选择甜度";
	}
}
public String icedegree(int a) {
	if(a==1) {
		return "热";
	}else if(a==2) {
		return "常温";
	}else  if(a==3){
		return"少冰";
	}else {
		return"请输入1~3来选择热度";
	}
	
}

public teamilk getteamilk() {
	return teamilk;
}
public addfood getaddfood() {
	return addfood;
}
public int getonecup() {
	int total=teamilk.getprice()+addfood.getprice();
	return total;
}
public String tostring() {
	return this.teamilk.tostring()+"\n"+"加料："+this.addfood.tostring()+"\n"+sweetdegree(this.a)+icedegree(this.b)+"\n"+"价格："+getonecup();
}
}
