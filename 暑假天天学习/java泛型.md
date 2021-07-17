# 泛型

```
1 可读性，从字面上就可以判断集合中的内容类型；
2 类型检查，避免插入非法类型。
3 获取数据时不在需要强制类型转换。
```

# 泛型类

~~~
public class method<T>(){
private T field1;
}
~~~

当定义method<String>p =new method<String>();

此时类内部的 field1就是字符串类型

# 泛型方法

```
public class GenericMethod {
    public static <T> T getMiddle(T... a){
        return a[a.length/2];
    }
}
String o=GenericMethod.<String>getMiddle("213","result","12");
```

<T>声明此方法拥有一个类型T，也可理解声明此方法为泛型方法

T:指明该方法的返回值为类型T  





