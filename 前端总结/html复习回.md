# web标准

## 构成

主要包括结构,表现,行为三个方面



| 标准 | 说明                                   | 备注         |
| :--- | -------------------------------------- | ------------ |
| 结构 | 对网页进行整理和分类                   | html学习内容 |
| 表现 | 设置网页元素的版式,颜色,大小等外观样式 | css学习内容  |
| 行为 | 对网页模型的定义和交互                 | javascript   |



# html学习

##  ==< img >==标签网页添加图片

<img src="https://www.freecatphotoapp.com/your-image.jpg" alt="A business cat wearing a necktie."  alt="s">

用

```
img标签
<img src="xxx" alt="xxx">
```

## ==a标签==

### 网页跳转

```
<a href="xxx"> this link </a>
```

### ==网页打开方式==

### _blank

浏览器总在一个新打开、未命名的窗口中载入目标文档。

### _self

这个目标的值对所有没有指定目标的 <a> 标签是默认目标

### _parent

这个目标使得文档载入父窗口或者包含来超链接引用的框架的框架集。如果这个引用是在窗口或者在顶级框架中，那么它与目标 _self 等效。

### _top

这个目标使得文档载入包含这个超链接的窗口，用 _top 目标将会清除所有被包含的框架并将文档载入整个浏览器窗口。

### ==target="view_window"==

创建一个窗口输出接下来的==所有链接==

#### ==base标签==

~~~
<base> 标签为页面上的所有链接规定默认地址或默认目标。
~~~

### iframe窗口(==内联窗口==)

~~~
<a href="https://developer.mozilla.org/zh-CN/docs/Web/HTML" target="newwindow">点击打开百度</a>
		<iframe name="newwindow" border="1" width="500" height="500">
		</iframe>
~~~

### frameset窗口集合

~~~
<html>

<frameset cols="120,*">

  <frame src="/demo/html/content.html">
  <frame src="/example/html/frame_a.html" name="showframe">

</frameset>

</html>

~~~





### 网页内部跳转(==#id==)(锚点)

把href设置为一个为一个哈希符号# 加上内部元素的id



~~~html
<a href="h2">点击跳转h2</a>

<h2 id="h2">gg</h2>

~~~



##  邮件标签

```
<a href="mailto:862315743@qq.com">点击邮件联系</a>
```



## 给图片添加链接

```
<body>
		<p>
			<a href="https://www.baidu.com/"><img src="img/百度.png"</a>
		</p>
	</body
```

## ==创建列表==

### 1.无序列表

~~~
<ul>
    <li>
      无序列表的创建
    </li>
</ul>
~~~

### 2.有序列表的创建

~~~
<ol>
  <li>
  有序列表的创建
  </li>
 </ol>
~~~

### 3.自定义列表

~~~
<dl>
   <dt>列表标题</dt>
   <dd>列表内容</dd>
   <dd>列表内容</dd>
</dl>
~~~

## ==表格创建==

~~~
	<table bgcolor="antiquewhite" align="center" border="1" cellpadding="50" cellspacing="50" > 
			<tr>
				<th>名字</th>
				<th>电话</th>
			</tr>
			<tr>
				<td>黄永涛</td>
				<td>110</td>
			</tr>
		</table>
~~~

cellspacing代表两个格子中间的空白

cellpadding表示单元格内容和单元格边框的距离

### caption(表格标题)

~~~
<table>
  <caption>表格b
</table
~~~





## ==文本框==

## 创建文本框

~~~
<input type="text"/>
~~~

## 创建占位符(提示框)

~~~
<input type="text" placeholder="laji"/>
~~~

## 创建表单(form)

~~~
<form action="xxx">
    
</form>
~~~

### 按钮创建

<button type="submit">button</button>

<button type="submit">submit</button>

### 必填字段==(required)==

~~~<input type="text" required>
<input type="text" required>
~~~

### ==label(自动对焦输入框)==

~~~
<label for="gg">ee</label>
<input type="radio" name="indoor-outdoor" id="gg" />
~~~

### 默认选项(首选项)

~~~
<input type="radio" name="indorr-outdoot" id="gg" value="in" checked />
~~~

