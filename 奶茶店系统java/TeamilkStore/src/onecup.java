
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
		return "����";
	}else if(a==2) {
		return "����";
	}else  if(a==3){
		return"ȫ��";
	}else {
		return"������1~3��ѡ�����";
	}
}
public String icedegree(int a) {
	if(a==1) {
		return "��";
	}else if(a==2) {
		return "����";
	}else  if(a==3){
		return"�ٱ�";
	}else {
		return"������1~3��ѡ���ȶ�";
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
	return this.teamilk.tostring()+"\n"+"���ϣ�"+this.addfood.tostring()+"\n"+sweetdegree(this.a)+icedegree(this.b)+"\n"+"�۸�"+getonecup();
}
}
