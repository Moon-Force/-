# Error和Exception区别

Error通常是灾难性的致命的错误，程序无法控制和处理

Exception通常可以被捕获和处理

# 异常处理的关键字

## Ctrl+alt+t自动环绕

多个异常处理是从小到大排起来

## try

执行的主体语句

## catch

捕获的异常

## finally

就算有无异常也会执行

## throw

### 主动抛出异常

 1.一般在方法中使用

~~~
public void test(int a,int b)throws AritmeticException{
if(b==0){
throw new ArithmeticException();
}
}
~~~



## throws

1在方法外注释，向上层抛出，交给他人处理



## throw和throws区别

https://blog.csdn.net/weixin_38011265/article/details/79149313

throws：

 1.用来声明一个方法可能产生的所有异常，不做任何处理而是将异常往上传，谁调用我我就抛给谁。
  2.用在方法声明后面，跟的是异常类名
  可以跟多个异常类名，用逗号隔开
  3.表示抛出异常，由该方法的调用者来处理
  throws表示出现异常的一种可能性，并不一定会发生这些异常

throw：

  1.则是用来抛出一个具体的异常类型。
  2.用在方法体内，跟的是异常对象名
  3.只能抛出一个异常对象名
  4.表示抛出异常，由方法体内的语句处理
  throw则是抛出了异常，执行throw则一定抛出了某种异常 
