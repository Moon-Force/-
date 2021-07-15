
public class teamilk extends addfood {
	private final String matial;

	public teamilk(String incode, String inteamilkname, int inprice, String inmatial) {
		super(incode, inteamilkname, inprice);
		this.matial = inmatial;
	}

	public String getmatial() {
		return matial;
	}

	public void setprice(int a) {
		super.price = a;
	}

	public String tostring() {
	return	super.tostring() + "--Ô­²ÄÁÏ:" + this.getmatial();
	
	 

}
}
