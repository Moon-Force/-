# Html

## 基本标签

1. ` <body bgcolor="yellow">背景为黄色`
2. `        <h1 align="center">这是一个一级标题</h1>` align文字居中
3. `        <p>这是第1个段落。</p>`
4. `        <p>这是第2个段落。</p>`

### 自闭合标签

| 标签      | 说明                             |
| :-------- | :------------------------------- |
| <meta />  | 定义网页的信息（供搜索引擎查看） |
| <link />  | 引入“外部CSS文件”                |
| <br />    | 换行标签                         |
| <hr />    | 水平线标签                       |
| <img />   | 图片标签                         |
| <input /> | 表单标签                         |

<body> ,</body>等成对的标签，分别叫开放标签和闭合标签

单独呈现的标签(空元素)如<hr/>意为用/来关闭空元素

### 注释

<!--Html注释方法 --> 

***idea可以ctrl+/快速注释***

![image-20210727235826134](https://gitee.com/moon-force/picgo/raw/master/img/image-20210727235826134.png)

```html
<!DOCTYPE html>
<!-- 告诉浏览器网页格式 -->
<html lang="en">
<!-- head标签代表网页头部-->
<head>
<!--    meta描述性标签，来描述网站的一些信息-->
    <meta charset="UTF-8">
    <meta name="keyword" content="狂神说">
    <meta name="description" content="来这个地方可以学习">
    <title>第一个网页标题</title>
<!--网页标头-->
</head>
<body>
hello world!
</body>
</html>
```

![image-20210728001007087](https://gitee.com/moon-force/picgo/raw/master/img/image-20210728001007087.png)

### 标题标签

```
<h1>一级标签</h1>
<h2>二级标签</h2>
<h3>三级标签</h3>
```

### 段落标签

```
<!--段落标签-->
<p>两只老虎</p>
<p>跑的快</p>
```

### 水平线

```
== <!--水平线标签--> == 
<hr>
```

### 换行

<br>

### 字体样式标签

#### HTML 样式实例 - 字体、颜色和尺寸

```html
<html>
  <body>
    <p style="font-family:arial;color:green;font-size:50px;">实验楼</p>
  </body>
</html>
```

注：通过对 `font-family` 属性值的设置来设置字体，通过对 `color` 属性值的设置来设置颜色，通过对 `font-size` 属性值的设计来设计字体大小。

![img](https://doc.shiyanlou.com/courses/1552/1226977/1a328adb0ea3c657455bf2a03b601720-0)

#### HTML 样式实例 - 文本对齐

```html
<html>
  <body>
    <h1 style="text-align:center">实验楼</h1>
  </body>
</html>
```

| <strong>我爱你</strong> 粗体 | 看源代码 |
| ---- | ------------------ |
| <em>我爱你</em> 斜体 |                    |

### 特殊符号

&nbsp 空格

## 图像标签

**必填**

**src 资源地址**

**alt 图片名字**

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<!--
img 学习
相对路径，绝对地址
../ --上一级目录
alt -- 图像显示不出来就显示alt的名字
-->
<img src="../rec/img/1.PNG" alt="花花图" title="悬停文字" width="835" height="651" >
<body>

</body>
</html>
```

## 超链接标签

<a> 标签定义超链接，用于从一张页面链接到另一张页面。

<a> 元素最重要的属性是 href 属性，它指示链接的目标。

```html
<a href="目标网页">文字</a>
```

### 锚链接



<!--
锚链接
1.添加一个锚头
2.跳转到标记
#
-->



```
1.添加锚头
<a id="top">顶部</a>
回到锚头
<a href="#top">回到顶部</a>
```

### 邮件链接

<!--
邮件链接: mail to;

-->

```
<a href="mailto:1493346172@qq.com">点击联系我</a>
```

## 列表标签



### 1.无序列表

<!--无序列表-->Unordered List

<ul>
    <li>java</li>
    <li>cpp</li>
    <li>运维</li>
    <li>前端</li>
    <li>py</li>
</ul>
### 2.有序列表

<ol>
    <li>java</li>
    <li>cpp</li>
    <li>运维</li>
    <li>前端</li>
    <li>py</li>
</ol>
**无序列表和有序列表的 type 属性：**

type 属性定义了列表项前项目符号的类型。

`<ul>` 标签的 type 属性：

| 值           | 备注   |
| ------------ | ------ |
| disc（默认） | 实心圆 |
| circle       | 空心圆 |
| square       | 小方块 |

`<ol>` 标签的 type 属性：

| 值        | 备注                        |
| --------- | --------------------------- |
| 1（默认） | 数字表示（1，2，3...)       |
| A         | 大写字母表示（A,B,C...)     |
| a         | 小写字母表示（a,b,c...)     |
| I         | 大写罗马数字表示(I,II,III…) |
| i         | 小写罗马数字表示(i,ii,iii…) |

我们来看其中一两个 type 属性：

```html
<p>无序列表</p>
<ul type="circle">
  <li>空心圆列表项1</li>
  <li>空心圆列表项2</li>
</ul>

<p>有序列表</p>
<ol type="A">
  <li>列表项1</li>
  <li>列表项2</li>
</ol>
```

![img](https://doc.shiyanlou.com/courses/1552/1226977/1feaa73cb508751fc4f8744d63144266-0)



### 3.自定义列表

```
<!--
自定义列表
dl:标签
dt:列表名称
dd:列表内容
一般用在网页底部

-->
<dl>
    <dt>学科</dt>
    <dd>java</dd>
    <dd>cpp</dd>
    <hr>
    <dt>位置</dt>
    <dd>中山</dd>
</dl>
```

## 表格

<table>
    <tr>
     <td>1.1</td>
     <td>1.2</td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>2.2</td>
    </tr>
</table>
![1](https://doc.shiyanlou.com/document-uid897174labid9222timestamp1545370661694.png)




## 媒体元素

### 音频文件

```
<audio src="../rec/audio/陈小春%20-%20我不是伟人.mp3" controls  autoplay></audio>
```

### 视频文件

```
<!--<video src="../rec/video/《我不是伟人》%20陈小春(超清).mp4" controls autoplay></video>-->
```

controls 打开控制台，供人拖动进度

autoplay 自动播放

## 页面结构

![image-20210729210741096](https://gitee.com/moon-force/picgo/raw/master/img/image-20210729210741096.png)

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<header>
  <h2>网页头部</h2>
</header>
<section>
    网页主体
</section>
<footer>
    <h2>网页底部</h2>
</footer>
</body>
</html>
```



## iframe内联框架

```
<iframe src="https://www.bilibili.com/video/BV1x4411V75C?p=11" frameborder="0" width="1000px" height="800px"></iframe>
```

在网页中镶嵌一个新网页

![image-20210729164727683](C:\Users\tao\AppData\Roaming\Typora\typora-user-images\image-20210729164727683.png)

id 要改成name

name 代表框架名

在name框架中打开一个新网页

## 表单语法 <form>标签

```
<!--表单form
action : 表单提交的位置，可以是网站，也可以是一个地址
method:post get方法
-->
scanner
<form action="1.helloworld.html" method="get">
```

### 文本框

**<input type="text" name="username">**

### 密码框

<input type="password" name="pwd">

### 单选框

```
    <!--
type=radio 单选框
value 提交的值
name 组别
-->
```

单选框最好放进label中

 <label for="1">

   <input id="1" type="radio" name="indoor-outdoor">indoor

  </label>

  <label for="2">

   <input id="2" type="radio" name="indoor-outdoor">outdoor

  </label>



------



<input type="radio"  value="boy" name="sex"> 男

<input type="radio" value="girl" name="sex">女

name是组别，如果组别不同则可以多选![image-20210730020717945](https://gitee.com/moon-force/picgo/raw/master/img/image-20210730020717945.png)

**所以单选框必须保持name一致**

### 多选框

爱好
    <input type="checkbox" value="sleep" name="hobby">睡觉
    <input type="checkbox" value="game" name="hobby">游戏
    <input type="checkbox" value="eat" name="hobby">吃饭

### 按钮

input type="button"普通按钮

input type="image" 图像按钮

input type="submit" 提交按钮

input type="reset" 重置按钮

```
<!-- 按钮   -->
<p>
        <input type="button" name="but1" value="点击"/>
</p>
<!--  图片按钮-->
<p>
        <input type="image" src="../rec/img/1.PNG" height="651" width="835"/>
</p>
```

### 下拉框

```
<!--下拉框
列表框
selected 默认选中
-->
```

<select name="国家">
    <option value="usa">美国</option>
    <option value="china" selected>中国</option>
</select>
### 文本域

<textarea name="textarea" row="10" cols="50"></textarea>

### 文件域

<input type="file" name="照片属性">

### 邮箱验证

<input type="email" name="email" >

### url 

<input type="url" name="url">

### 数字

<input type="number" name="number" max="100" min="0" step="10">

step进位

### 滑块

<input type="range" name="voice" min="0" max="100" step="2">

### 搜索框

<input type="search" name="search">

### 表单的应用

```
disabled 禁用
```

```
readonly 只读
```

```
hidden隐藏
```

## 表单的初级验证

### 1.placeholder

==提示词==

![image-20210730151633468](https://gitee.com/moon-force/picgo/raw/master/img/image-20210730151633468.png)

### 2.required

==不能为空==

![image-20210730151822917](https://gitee.com/moon-force/picgo/raw/master/img/image-20210730151822917.png)

### 3.pattern

正则表达式

```
<p>邮箱:
    <input type="text" name="diymail" pattern="\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*">

</p>
```

## HTML5 Canvas API

### 直线绘制



~~~<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<canvas id="MyCanvas" width="1314px" height="1314px" style="background-color: black">
</canvas>
<script type="text/javascript">
    var Mycanvas=document.getElementById("MyCanvas");
    var pen=Mycanvas.getContext("2d");
    pen.beginPath();
    pen.moveTo(20,20);
    pen.lineTo(200,700);
    pen.moveTo(20,20);
    pen.lineTo(200,20);
    pen.lineWidth=3.0;
    pen.strokeStyle="blue";
    pen.stroke();
</script>
</body>
~~~</html>
~~~

### 矩形绘制

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<canvas id="MyCanvas" width="520px" height="1314px">

</canvas>
<script type="text/javascript">
    var canvas=document.getElementById("MyCanvas");
    var pen=canvas.getContext("2d");
    pen.rect(10,10,100,100);
    pen.strokeStyle="blue";
    // pen.strokeRect(10, 10, 100, 200);一样效果
    pen.stroke();
    //实心
    pen.fillRect(100,100,100,100);


</script>
</body>
</html>
```

### 圆的绘制

使用 arc() 方法绘制圆或者椭圆。语法为：

**ctx.arc(x, y, r, sAngle, eAngle, counterclockwise);**
**copy**
参数说明：

x 表示圆的中心的 x 坐标。

y 表示圆的中心的 y 坐标。

r 表示圆的半径。

sAngle 表示起始角，以弧度计（特别需要注意的是弧的圆形的三点钟位置是 0 度而不是常规以为的 90 度）。

eAngle 表示结束角，以弧度计。

counterclockwise 表示绘制圆的方向，值为 false 表示顺时针，为 true 表示逆时针。是一个可选值，默认值是 false。

~~~<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>圆的绘制</title>
</head>
<body>
<canvas id="MyCanvas" height="1000px" width="1000px">
</canvas>
<script type="text/javascript">
    var myCanvas=document.getElementById("MyCanvas");
    var pen=myCanvas.getContext("2d");
    pen.beginPath();

    //PI=3.14=180°
    //所以PI*2=360°
    pen.arc(100,75,50,0,Math.PI*2);
    pen.stroke();
</script>
</body>
~~~</html>
~~~

### 渐变色

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>渐变色</title>
</head>
<body>
<canvas id="mycanvas" width="1314px" height="1314px">
</canvas>
<script type="text/javascript">
    var MyCanvas=document.getElementById("mycanvas");
    var pen=MyCanvas.getContext("2d");
    var gradient =pen.createLinearGradient(0,0,170,0);
    gradient.addColorStop(0,"red");
    gradient.addColorStop("0.25","black");
    gradient.addColorStop("0.5","green");
    gradient.addColorStop(1,"black");
    pen.fillStyle=gradient;
    pen.fillRect(10,10,100,200);
</script>
</body>
</html>
```

