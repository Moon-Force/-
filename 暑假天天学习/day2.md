---

---

# next()和nextLine()区别

## next()

1. 一定要读取到有效字符才能结束
2. 对输入之前的空白会自动去除
3. 只有输入有效字符后才能将后面空白作为分隔符
4. next()不能得到带有空格的字符串



## nextLine()

1. 以enter为结束符
2. 可以获得空白



---



---

# 方法的重载

1. 同名不同参

2. 方法选择由传入参数自动判定

   ```java
   public class test {
       public static void main(String[] args) {
           System.out.println(max(1.0,2.5));
           System.out.println(max(1,2));
   
       }
       public static int  max(double a, double b){
           System.out.println("method1");
           return (int) (a+b);
       }
       public  static  int max(int a,int b){
           System.out.println("method2");
           return  a+b;
       }
   }
   ```

结果

method1
3
method2
3



#  可变参数

~~~java
public class test {
    public static void main(String[] args) {
      printfMax(34,3,3,2,56.5);
      printfMax(new double[]{1,2,3});/这样也是可以的
    }
    public static void printfMax(double... numbers){
     for(double a:numbers)
     {
         System.out.println(a);
     }
    }
}
~~~

可变·参数本质就是传递一个数组，方法用double... xxx可以传入多个参数



# java内存分析

1.方法在栈，实例在堆



# 冒泡

```java
    public static void main(String[] args) {
        int []a={1,2,5};
        System.out.println(Arrays.toString(sort(a)));

    }
    public  static int[] sort(int[] array){
        int temp;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j+1]>array[j]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
```

优化

```java
import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.sort;

public class test {

    public static void main(String[] args) {
        int []a={1,2,5};
        System.out.println(Arrays.toString(sort(a)));

    }
    public  static int[] sort(int[] array){
        int temp;
        boolean flag=false;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j+1]>array[j]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
                if(flag==false){
                    break;
                }
            }
        }
        return array;
    }
}

```

多加了一个判断假如排序已经完成那么将退出循环，比如100个数排序，到第50次外部循环的时候已经全部完成，那么就判断flag=flase退出循环，少了49次外部循环

# 排序器排序

```java
import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class test {

    public static void main(String[] args) {
       Integer a[]={4,5,9,8,74};
         sort(a,new mysort());
        System.out.println(Arrays.toString(a));
    }

}
class mysort implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1>o2?1:-1;
    }
}
```

