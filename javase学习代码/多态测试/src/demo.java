public class demo {
//    �������ݿ��󣬷������󣬷������ݿ���
    public static void main(String[] args) {
    //����ת�ͣ���ʧ����,���෽�����Ǹ��෽��
        student student0=new student();
        person person=student0;
        System.out.println(person.age+" "+person.name);
        person.eat();
//        person.study()��ͨ������Ϊ����ת�ͻᶪʧ����
        person.slepp();
        person.method();

//����ת�� ,���Լ̳����з���
        person person1=new person();
        student student= (student) person;
        System.out.println(student.age);
        System.out.println(student.name);
        student.study();
        student.eat();
        student.slepp();
        student.method();
    }
}
