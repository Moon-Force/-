class Book{
	private String name;
	private String ISBN;
	private String writer;
	private String public_name;
	private double price;
	private int  number;
public Book(String name,String ISBN,String writer,String public_name,double price,int number)
{
	this.name=name;
	this.ISBN=ISBN;
	this.writer=writer;
	this.public_name=public_name;
	this.price=price;
	this.number=number;
}
public String getName() {
	return name;
} 
public String getISBN() 
{
	return ISBN;
}
public String getWriter() {
	return writer;
}
public String getpublic_namer() 
{
	return public_name;
}
public  double getprice() 
{
	return price;
}
public int number()
{
	return number;
}
public void bookCountless()
	{
		this.number--;
	}
public void bookCountmore()
	{
		this.number++;
	}
public void bookinformation()
{
	System.out.println("����:"+this.name+" ����:"+this.writer+" ISBN:"+this.ISBN);
}
@Override
public String toString() {
	return "ͼ����:"+name+" isbn:"+ISBN+" ����:"+writer+" ������:"+public_name+" �۸�:"+price+" ����:"+number;
	
}
}
