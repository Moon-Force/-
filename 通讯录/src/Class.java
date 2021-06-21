import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Class {
    public int num=0;
    public String ClassName;
    List<Student> studentList=new ArrayList<Student>();
    Scanner scanner=new Scanner(System.in);
    public Class(String name)/*构造类*/
    {
        this.ClassName=name;
    }
    public void AddStudent(Student student)/*插入学生*/
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
                System.out.println("删除成功");
                num--;
            }
        }
        if(flag==0)
        {
            System.out.println("未查询到学生，删除失败");
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
            System.out.println("未查询到学生");
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
              System.out.println("信息修改");
              System.out.println("输入学生姓名");
              String name=scanner.next();
              System.out.println("输入学号");
              String No=scanner.next();
              System.out.println("电话号码");
              String PN=scanner.next();
              System.out.println("qq号码");
              String qq=scanner.next();
              System.out.println("mail号码");
              String mail=scanner.next();
              System.out.println("add号码");
              String add=scanner.next();
              AddStudent(new Student(name,No,PN,qq,mail,add));
            }
        }
        if(flag==0)
        {
            System.out.println("未查询到学生");
        }
    }


    public void printallnum()
    {
        System.out.println(ClassName+"班学生人数："+num);
    }
}
