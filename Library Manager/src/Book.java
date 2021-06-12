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
	System.out.println("书名:"+this.name+" 作者:"+this.writer+" ISBN:"+this.ISBN);
}
@Override
public String toString() {
	return "图书名:"+name+" isbn:"+ISBN+" 作者:"+writer+" 出版社:"+public_name+" 价格:"+price+" 数量:"+number;
	
}
}
