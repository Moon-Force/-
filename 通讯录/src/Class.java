import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Class {
    public int num=0;
    public String ClassName;
    List<Student> studentList=new ArrayList<Student>();
    Scanner scanner=new Scanner(System.in);
    public Class(String name)/*������*/
    {
        this.ClassName=name;
    }
    public void AddStudent(Student student)/*����ѧ��*/
    {
        studentList.add(student);
        num++;
    }
    public void delete(String no)
    {
        Iterator<Student> iterator=studentList.iterator();
        int flag=0;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.Returnno().equals(no)) {
                flag=1;
                iterator.remove();
                System.out.println("ɾ���ɹ�");
                num--;
            }
        }
        if(flag==0)
        {
            System.out.println("δ��ѯ��ѧ����ɾ��ʧ��");
        }

    }

    public void printfall()
    {
        Iterator<Student> iterator=studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.toString());
        }
    }

    public void findStudent(String no)
    {
        Iterator<Student> iterator=studentList.iterator();
        int flag=0;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.Returnno().equals(no)) {
                flag=1;
               System.out.println(student);
            }
        }
        if(flag==0)
        {
            System.out.println("δ��ѯ��ѧ��");
        }
    }
    public  void Modifyinformation(String no)
    {
        Iterator<Student> iterator=studentList.iterator();
        int flag=0;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.Returnno().equals(no)) {
                flag=1;
              iterator.remove();
              num--;
              System.out.println("��Ϣ�޸�");
              System.out.println("����ѧ������");
              String name=scanner.next();
              System.out.println("����ѧ��");
              String No=scanner.next();
              System.out.println("�绰����");
              String PN=scanner.next();
              System.out.println("qq����");
              String qq=scanner.next();
              System.out.println("mail����");
              String mail=scanner.next();
              System.out.println("add����");
              String add=scanner.next();
              AddStudent(new Student(name,No,PN,qq,mail,add));
            }
        }
        if(flag==0)
        {
            System.out.println("δ��ѯ��ѧ��");
        }
    }


    public void printallnum()
    {
        System.out.println(ClassName+"��ѧ��������"+num);
    }
}
