# 普通数组转稀疏数组

```java

package test1;

import java.util.Arrays;

public class araystest {
    public static void main(String[] args) {
        int [][] array1=new int[11][11];
        array1[1][2]=1;
        array1[2][3]=1;
        System.out.println("输出原有的数组");
        for (int [] ints:array1){
            for(int i:ints){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        int sum=0;
        for (int [] ints:array1){
            for(int i:ints){
               if(i!=0){
                   sum++;
               }
            }
        }
        System.out.println(sum);

        int [][] array2=new int[sum+1][3];
        array2[0][0]=11;
        array2[0][1]=11;
        array2[0][2]=sum;
        int count=0;
        for(int i=0;i<array1.length;i++){
            for (int j=0;j<array1[i].length;j++){
                if(array1[i][j]!=0){
                    count++;
                    array2[count][0]=i;
                    array2[count][1]=j;
                    array2[count][2]=array1[i][j];
                }
            }
        }
        System.out.println("稀疏数组");
        for (int i=0;i<array2.length;i++){
            System.out.println(array2[i][0]+"\t"+array2[i][1]+"\t"+array2[i][2]);
        }
        int [][] array3=new int[array2[0][0]][array2[0][1]];
        for(int i=1;i<array2.length;i++){
          array3[array2[i][0]][array2[i][1]]=array2[i][2];
        }
       for (int i=0;i<array3.length;i++){
           for (int j=0;j<array3[i].length;j++){
               System.out.print(array3[i][j]+"\t");
           }
           System.out.println();
       }


    }
}
```

稀疏型数组记录着点的坐标x，y 和值
输出原有的数组
0	0	0	0	0	0	0	0	0	0	0	
0	0	**1**	0	0	0	0	0	0	0	0	
0	0	0	**1**	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
2
稀疏数组
**11(列)	11(行)	2(有效个数)**
**1	2	1(数据)**
**2	3	1(数据)**
还原数组
0	0	0	0	0	0	0	0	0	0	0	
0	0	1	0	0	0	0	0	0	0	0	
0	0	0	1	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	0	0	

# java方法传递的方式

当一个对象被当作参数传递到一个方法后，在此方法内可以改变这个对象的属性，那么这里到底是值传递还是引用传递?

**答：是值传递。**Java 语言的参数传递只有值传递。当一个实例对象作为参数被传递到方法中时，参数的值就是该对象的引用的一个副本。指向同一个对象，对象的内容可以在被调用的方法内改变，但对象的引用(不是引用的副本) 是永远不会改变的。

```java
class Person{
    private int id;
    private String name;
    public Person(int id,String name) {
        this.id = id;
        this.name = name;
    }
}
public class Demo02 {
    public static void main(String[] args) {
        Person a = new Person(23, "a");
        Person b = new Person(22,"b");
        System.out.println("交换前\na:"+a+"\nb:"+b);
        swap(a, b);
        System.out.println("交换后\na:"+a+"\nb:"+b);
    }
    private static void swap(Person a, Person b) {
        Person temp = a;
        a = b;
        b = temp;
    }
}
```

**交换后，没有任何的改变**

~~~java
class Person{
     private int id;
     private String name;
     public Person(int id,String name) {
         this.id = id;
         this.name = name;
     }
    //省略get，set方法　　//省略toString方法 }

public void demo（）{
  Person person = new Person("张三"，1);　sout(person);　demo2(person);
　sout(person);   }

public void demo2(Person person1){
    person.setName ="李四"
    person.setId=2　　sout(person1)
}

~~~

**可以看到值被改变了，所以对象的内容可以在被调用的方法内改变，但对象的引用(不是引用的副本) 是永远不会改变**

**意思是可以在方法中直接改变传入参数的值，因为方法中的person是指向同个地址**

## 重写构造方法技巧

***alt+ins可以重写***

