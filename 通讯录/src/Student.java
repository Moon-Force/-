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
    }/*������*/



    public void StudentInformation()
    {
        System.out.println("ѧ������:"+Name+" ѧ��:"+NO+" �绰��:"+PhoneNumber+" QQ:"+QQ+" ����:"+mail+" ��ַ:"+address);
    }
    public String Returnno()
    {
        return NO;
    }
@Override
public String toString()
{
    return "ѧ������:"+Name+" ѧ��:"+NO+" �绰��:"+PhoneNumber+" QQ:"+QQ+" ����:"+mail+" ��ַ:"+address;
}



}
