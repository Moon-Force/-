# 接口

普通类：只有具体的实现

抽象类：具体实现和规范方法

接口：只有规范，起约束作用

##  作用

1. 约束
2. 定义一些方法，让不同的人实现，十个人，十个不同方法
3. public abstract
4. public static final
5. 接口不能被实例化
6. 可以多个接口
7. 必须重写接口方法 



# 内部类

大神解析 https://www.cnblogs.com/latter/p/5665015.html

https://www.cnblogs.com/chenmingjun/p/8454518.html

## 1.成员内部类

1. 成员内部类可以无条件地访问外部类的成员

2. 也可以将内部类写为static，但无法引用非静态变量
3. 在外部类中如果要访问成员内部类的成员，必须先创建一个成员内部类的对象
4. 

```java
ackage test1;

public class ou {
    private int id=10;
    public  void out(){
        System.out.println("外部类方法");
    }
    class inner {
        public void in(){
            System.out.println("内部类"+id);
        }
    }
}
```

```java
package test1;

public class main {

    public static void main(String[] args) {
ou test =new ou();
ou.inner inner=test.new inner();
inner.in();
//输出"内部类10"
    }

}
```

## 2.局部内部类

```java
public class test {
    public static void main(String[] args) {
        outer o=new outer();
        o.method();
    }
}
class outer {
    public  void method(){
        class inner{
            public  void in(){
                System.out.println("局部内部类");
            }
        }
        inner inner=new inner();//要在方法中生成内部类对象
        inner.in();
    }

}

```



## 3.匿名内部类

不需要指明对象

```java
public class test {
    public static void main(String[] args) {
       new Apple().eat();
UserService userService=new UserService() {
    @Override
    public void hello() {
        System.out.println("hello匿名内部类");
    }
};
    }
}
class Apple {
  public void eat(){
      System.out.println("苹果");
    }
}
interface  UserService{
 public void hello();
}
```



## 4.静态内部类

~~~java
public class test {
    public static void main(String[] args) {
//因为是静态内部类，所以直接new outter.inner();
 outter.inner inner=new outter.inner();
inner.show();
    }
}
class  outter{
    int a=10;
    static int b=20;
    public outter(){

    }
    static class inner{
        public void show(){
            System.out.println(b);
        }
    }

}

~~~

