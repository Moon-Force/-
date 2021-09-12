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

### 网页内部跳转

把href设置为一个为一个哈希符号# 加上内部元素的id

## 给图片添加链接

```
<body>
		<p>
			<a href="https://www.baidu.com/"><img src="img/百度.png"</a>
		</p>
	</body
```

## 创建列表

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

