
public class addfood {
	private final String code;
	private final String teamilkname;
	protected int price;
	public String getcode() {
		return code;
	}
	public String getteamilkname(){
		return teamilkname;
	}
	public int getprice() {
	return price;	
	}
	
	public addfood(String incode,String inteamilkname,int inprice) {
		this.code=incode;
		this.teamilkname=inteamilkname;
		this.price=inprice;
	}
	public String tostring() {
		return getcode() +"--"+ getteamilkname() +"--"+ getprice()+"Ԫ";
}
	public boolean equals(Object object) {
		if(object instanceof addfood ) {
			addfood af=(addfood)object;
			if(af.getcode().equals(getcode())) {
				return true;
			}
		}
		return false;
	}
}