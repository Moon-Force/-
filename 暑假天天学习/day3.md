# ��ͨ����תϡ������

```java

package test1;

import java.util.Arrays;

public class araystest {
    public static void main(String[] args) {
        int [][] array1=new int[11][11];
        array1[1][2]=1;
        array1[2][3]=1;
        System.out.println("���ԭ�е�����");
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
        System.out.println("ϡ������");
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

ϡ���������¼�ŵ������x��y ��ֵ
���ԭ�е�����
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
ϡ������
**11(��)	11(��)	2(��Ч����)**
**1	2	1(����)**
**2	3	1(����)**
��ԭ����
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

# java�������ݵķ�ʽ

��һ�����󱻵����������ݵ�һ���������ڴ˷����ڿ��Ըı������������ԣ���ô���ﵽ����ֵ���ݻ������ô���?

**����ֵ���ݡ�**Java ���ԵĲ�������ֻ��ֵ���ݡ���һ��ʵ��������Ϊ���������ݵ�������ʱ��������ֵ���Ǹö�������õ�һ��������ָ��ͬһ�����󣬶�������ݿ����ڱ����õķ����ڸı䣬�����������(�������õĸ���) ����Զ����ı�ġ�

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
        System.out.println("����ǰ\na:"+a+"\nb:"+b);
        swap(a, b);
        System.out.println("������\na:"+a+"\nb:"+b);
    }
    private static void swap(Person a, Person b) {
        Person temp = a;
        a = b;
        b = temp;
    }
}
```

**������û���κεĸı�**

~~~java
class Person{
     private int id;
     private String name;
     public Person(int id,String name) {
         this.id = id;
         this.name = name;
     }
    //ʡ��get��set��������//ʡ��toString���� }

public void demo����{
  Person person = new Person("����"��1);��sout(person);��demo2(person);
��sout(person);   }

public void demo2(Person person1){
    person.setName ="����"
    person.setId=2����sout(person1)
}

~~~

**���Կ���ֵ���ı��ˣ����Զ�������ݿ����ڱ����õķ����ڸı䣬�����������(�������õĸ���) ����Զ����ı�**

**��˼�ǿ����ڷ�����ֱ�Ӹı䴫�������ֵ����Ϊ�����е�person��ָ��ͬ����ַ**

## ��д���췽������

***alt+ins������д***

