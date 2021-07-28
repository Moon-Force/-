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

```

```

### 2.有序列表

<ol>
    <li>java</li>
    <li>cpp</li>
    <li>运维</li>
    <li>前端</li>
    <li>py</li>
</ol>





### 3.自定义列表

