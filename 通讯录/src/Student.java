public class Student {
    private String Name;
    private String NO;
    private String PhoneNumber;
    private String QQ;
    private String mail;
    private String address;
    public Student(String Name, String NO,String PhoneNumber,String QQ,String mail,String address) {
        this.Name=Name;
        this.NO=NO;
        this.PhoneNumber=PhoneNumber;
        this.QQ=QQ;
        this.mail=mail;
        this.address=address;
    }/*构造类*/



    public void StudentInformation()
    {
        System.out.println("学生姓名:"+Name+" 学号:"+NO+" 电话号:"+PhoneNumber+" QQ:"+QQ+" 邮箱:"+mail+" 地址:"+address);
    }
    public String Returnno()
    {
        return NO;
    }
@Override
public String toString()
{
    return "学生姓名:"+Name+" 学号:"+NO+" 电话号:"+PhoneNumber+" QQ:"+QQ+" 邮箱:"+mail+" 地址:"+address;
}



}
