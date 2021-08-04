public class demo {
//    基本数据看左，方法看左，方法内容看右
    public static void main(String[] args) {
    //向上转型，丢失方法,子类方法覆盖父类方法
        student student0=new student();
        person person=student0;
        System.out.println(person.age+" "+person.name);
        person.eat();
//        person.study()不通过，因为向上转型会丢失方法
        person.slepp();
        person.method();

//向下转型 ,可以继承所有方法
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
