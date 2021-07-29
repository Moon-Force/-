# Html

## 基本标签

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



