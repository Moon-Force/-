---

---

# next()��nextLine()����

## next()

1. һ��Ҫ��ȡ����Ч�ַ����ܽ���
2. ������֮ǰ�Ŀհ׻��Զ�ȥ��
3. ֻ��������Ч�ַ�����ܽ�����հ���Ϊ�ָ���
4. next()���ܵõ����пո���ַ���



## nextLine()

1. ��enterΪ������
2. ���Ի�ÿհ�



---



---

# ����������

1. ͬ����ͬ��

2. ����ѡ���ɴ�������Զ��ж�

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

���

method1
3
method2
3



#  �ɱ����

~~~java
public class test {
    public static void main(String[] args) {
      printfMax(34,3,3,2,56.5);
      printfMax(new double[]{1,2,3});/����Ҳ�ǿ��Ե�
    }
    public static void printfMax(double... numbers){
     for(double a:numbers)
     {
         System.out.println(a);
     }
    }
}
~~~

�ɱ䡤�������ʾ��Ǵ���һ�����飬������double... xxx���Դ���������



# java�ڴ����

1.������ջ��ʵ���ڶ�



# ð��

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

�Ż�

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

�����һ���жϼ��������Ѿ������ô���˳�ѭ��������100�������򣬵���50���ⲿѭ����ʱ���Ѿ�ȫ����ɣ���ô���ж�flag=flase�˳�ѭ��������49���ⲿѭ��

# ����������

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

