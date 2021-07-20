# java常用类

大神解析:https://blog.csdn.net/sugar_no1/article/details/88016599

##  1.Object
###          Object.clone()

大神解析:https://blog.csdn.net/qq_33314107/article/details/80271963

大神解析:https://www.cnblogs.com/xinruyi/p/11537963.html

#### **为什么要用来clone来创造一个新的副本？**

1. java赋值是复制对象引用，如果我们想要得到一个对象的副本，使用赋值操作是无法达到目的的
2. 如果创建一个对象的新的副本，也就是说他们的初始状态完全一样，但以后可以改变各自的状态，而互不影响，就需要用到java中对象的复制，如原生的clone()方法。

#### **如何进行对象克隆**

Object对象有个clone()方法，实现了对象中各个属性的复制，但它的可见范围是protected的，所以实体类使用克隆的前提是：

① 实现Cloneable接口，这是一个标记接口，自身没有方法。 
② 覆盖clone()方法，可见性提升为public。

##### >>浅克隆

![image-20210718184337314](https://gitee.com/moon-force/picgo/raw/master/img/image-20210718184337314.png)

##### >>深克隆

![image-20210718210205087](https://gitee.com/moon-force/picgo/raw/master/img/image-20210718210205087.png)

super.clone()其实是浅拷贝，所以在重写User类的clone()方法时，address对象需要调用address.clone()重新赋值。

##### >>序列化

![image-20210718211002136](https://gitee.com/moon-force/picgo/raw/master/img/image-20210718211002136.png)

推荐序列化来克隆

## 2.String类

https://blog.csdn.net/weixin_44881854/article/details/114108061

https://blog.csdn.net/qq_38452037/article/details/103541185

## 3.时间类

https://www.cnblogs.com/gu-bin/p/10022703.html

### SimpleDateFormat类



#### 1.  date--->String

```java
public class main {
    public static void main(String[] args) throws ParseException {
     Date date=new Date();
SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
       System.out.println(DateFormat.format(date));
    }
    }
```

#### 2.String--->date

```java
public class main {
    public static void main(String[] args) throws ParseException {
     String time ="2021-07-19";
    SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
 System.out.println(SimpleDateFormat.parse(time));
    }
    }
```

 	### Calendar类

http://www.itcdns.cn/skill/detail/material_1574331638145

