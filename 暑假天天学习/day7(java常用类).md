# java常用类

大神解析:https://blog.csdn.net/sugar_no1/article/details/88016599

##  1.Object
###          Object.clone()

大神解析:https://blog.csdn.net/qq_33314107/article/details/80271963

#### **为什么要用来clone来创造一个新的副本？**

1. java赋值是复制对象引用，如果我们想要得到一个对象的副本，使用赋值操作是无法达到目的的
2. 如果创建一个对象的新的副本，也就是说他们的初始状态完全一样，但以后可以改变各自的状态，而互不影响，就需要用到java中对象的复制，如原生的clone()方法。

 #### **如何进行对象克隆**

Object对象有个clone()方法，实现了对象中各个属性的复制，但它的可见范围是protected的，所以实体类使用克隆的前提是：

① 实现Cloneable接口，这是一个标记接口，自身没有方法。 
② 覆盖clone()方法，可见性提升为public。

