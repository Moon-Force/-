# css复习回

## ==改变字体颜色==

### 内联方式改变颜色

<h2 style="color:blue">CatPhotoApp</h2>

~~~
<h2 style="color:blue">CatPhotoApp</h2>
~~~

### css方式改变颜色

#### class选择器

~~~html
<style>
 .red-text{
    color: red;
  }
</style>
<h2 class="red-text">CatPhotoApp</h2>
~~~

#### id选择器id

~~~
<style>
 #red-text{
    color: red;
  }
</style>
<h2 id="red-text">CatPhotoApp</h2>
~~~

### ==选择器的优先级==

​	==!important>内联>id>class>继承==

## ==css复合选择器==

### 后代子元素选择器(==重要==)

==用div的class+标签==

~~~
父级 子级{
属性,属性
}
~~~

~~~
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
		.nav{
			color: #0000FF;
		}
		/* 单独选择nav中的<p>标签 */
		.nav p{
			color: #FF0000;
		}
		</style>
	</head>
	<body>
		<div class="nav">
			<a>外部后代选择器</a>
			<p>段落</p>
		</div>
		<a>内部选择器</a>
	</body>
</html>
~~~

### 子元素选择器

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
		/* 子类选择器

		父类>子类
		只适用于下一层,不适用于下两层,
		如第二个div中<strong>被<p>包裹,那么就不会被选择
		因为<strong>在<div>下两层
		*/
		div>strong{
			color: #FF0000;
		}
		</style>
	</head>
	<body>
		<div >
			<strong>好日子</strong>
			<strong>好日子</strong>
			<strong>好日子</strong>
		</div>
		<div >
			<!-- 第二层 -->
			<p>
				<!-- 第三层 -->
			<strong>好日子</strong>
			<strong>好日子</strong>
			<strong>好日子</strong>
			</p>
		</div>
	</body>
### 交集选择器

类名(例如:p).class名(red)

~~~
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
	/* 交集选择器 
	   p和red的交集
	   这样可以保证
	  当只需要一段p红色时不会影响到其他的p
	*/
		p.red{
			color: red;
		}
		</style>
	</head>
	<body>
		<p class="red">红色</p>
		<p class="red">红色</p>
		<p class="red">红色</p>
		<div class="red">红色</div>
		<div class="red">红色</div>
		<div class="red">红色</div>
		<p>蓝色</p>
		<p>蓝色</p>
		<p>蓝色</p>
	</body>
</html>
~~~

### 并集选择器

希望某些元素一并都拥有某种颜色,并方便写代码

把选择器放在左边,然后每个选择器用逗号(,)隔开

~~~
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<style>
	p,
	span,
	.red{
		color: #FF0000;
	}
	</style>
	<body>
		
		<p>好日子</p>
		<span>好日子</span>
		<div id="red">
			<p>
				好日子
			</p>
		</div>
	</body>
</html>

~~~

### 多类选择器

当想选择多个类时,用多个(.)链接

但当选择器中找不到相应的的class时就会失效

~~~
<html>
<head>
<style type="text/css">
.important {font-weight:bold;}
.warning {font-style:italic;}
.important.warning {background:silver;}
</style>
</head>

<body>
<p class="important">This paragraph is very important.</p>

<p class="warning">This is a warning.</p>

<p class="important urgent warning">This paragraph is a very important warning.</p>

<p>This is a paragraph.</p>

<p>...</p>
</body>
</html>
~~~

### 属性选择器(==重要==)

```
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<!-- base 默认网页跳转方式 -->
		<base target="_blank" />
		<style>
		h2[title]{
			color: #00FFFF;
			title
		}
		a[href]{
		color: #bf9c1c;
		}
		/* 图片选择器 */
		img[title="百度"]{
			border: 1px dashed #FF0000;
		}
		/* 选择有特定属性值的元素 
		且不能相差丝毫
		如下方,多个[title="属性选择器1"]便会失效
		*/
	   a[href="https://www.w3school.com.cn/css/css_selector_attribute.asp"][title="属性选择器"][class="skyblue"]{
		   color: skyblue;
	   }
	   /* 根据部分属性值选择 */
	  p[class~=important]{
		  color: #FF0000;
	  }
	  /* 字符串匹配属性选择器 
		^="def" "def"开头的所有元素
		$="def" "def"结尾的所有元素
		*="def" 子串包含"def"的所有元素
	  */
	  h1[title^="def"]{
		  color: aqua;
	  }
	  h1[title$="def"]{
		  color: #BF9C1C;
	  }
	  [title*="def"]{
		  color: chartreuse;
	  }
		</style>
	</head>
	<body>
		<h3>简单属性选择器</h3>
		<a href="css后代选择器.html" >后代选择器</a>
		<h2 title="你好世界">你好世界</h2>
		<h3 title="你好世界">垃圾的世界</h3>
		<h3>图片属性选择器</h3>
		<img src="../../img/百度.png" title="百度">
		<h3>特定属性值</h3>
		<a href="https://www.w3school.com.cn/css/css_selector_attribute.asp" title="属性选择器" class="skyblue">属性选择器详解</a><br />
		<h3>部分选择器</h3>
		<p class="important warning">This is a paragraph.</p>
		<p class="important">This is a paragraph.</p>
		
		<h3>字符串匹配属性选择器</h3>
		<div>
			<h1 title="defstart">以def开头</h1>
			<h1 title="enddef">以def结尾</h1>
			<h1 title="includedefworld">带有def的字符串</h1>
			
		</div>
	</body>
</html>

```

### 伪类选择器(==重要==)

https://www.w3school.com.cn/css/css_pseudo_classes.asp

~~~
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
		/* 未访问的链接 */
		.one:link{
			color: #0000FF;
			text-decoration: none;
		}
		/* 已访问的链接 */
		.one:visited{
			color: #FF0000;
		}
		/*鼠标移动到链接上时*/
		.one:hover{
			color: #7FFF00;
		}
		/* 选定不松手时的链接 */
		.one:active{
			color: aquamarine;
			background-color: cyan;
			border: 2px solid #0000FF;
		}
		/* 未访问的链接 */
		a:link{
			color: #aa0000;
			text-decoration: none;
		}
		/* 已访问的链接 */
		a:visited{
			color: #55aaff;
		}
		/*鼠标移动到链接上时*/
		a:hover{
			color: #ffaaff;
		}
		/* 选定不松手时的链接 */
		a:active{
			color: aquamarine;
			background-color: cyan;
			border: 2px solid #0000FF;
		}
		</style>
	</head>
	<body>
		<h3>用类名加伪类选择</h3>
		<a href="https://www.w3school.com.cn/css/css_pseudo_classes.asp" class="one">伪类选择详情</a>
		<h3>标签名加伪类选择</h3>
		<a href="https://www.cnblogs.com/qianguyihao/p/8280814.html" class="two">伪类选择详情2</a>
	</body>
</html>


~~~

## 块级元素和行内元素（==重点==)

https://blog.csdn.net/qq_34821198/article/details/91359274

### 块级元素

常见的块级元素(自动换行， 可设置高宽 )有：

```
   div,h1-h6,p,pre,ul,ol,li,form,table,label等
```

### 行内元素

常见的行内元素（无法自动换行，无法设置宽高）有：

```
   a,img,span，i（斜体）,em（强调）,sub(下标)，sup（上标）等。
```

### 块级元素和行内元素==嵌套规则==

　　1、块元素可以嵌套行元素；

　　2、行元素可以嵌套行元素；

　　3、行元素不可以嵌套块元素；

　　4、文字类块元素不可以嵌套块元素；

　　5、容器类块元素可以嵌套块元素。

### 块级元素和行内元素的相互转换：

块级元素(比如div)和行内元素进行相互转换。

#### ==display：inline;==块级元素转化为行内元素

　　那么这个标签将变为行内元素，即：

　　　　1，此时这个div将不能设置宽度和高度了。

　　　　2，此时这个div可以和其他行内元素并排了。

#### ==display：block;==行内元素转行成块级元素

　　那么这个span标签将变为块级标签，即：

　　　　1，此时这个span能够设置宽度，高度。

　　　　2，此时这个span必须独占一行，其他元素无法与之并排。

　　　　3，如果不设置宽度，将占满父级。

#### ==display：inline-block==

块,行内元素转换成行内块.,display：inline-block

### 行块级元素

常见的行块级元素(拥有内在尺寸，可设置高宽，不会自动换行 )有：

```
 (button,input，textarea,select), img等
```

## 行高(line-height)

- 行高等于容器高度时,文字会垂直居中

- 如果行高大于高度 文字会偏下

- 如果行高小于高度 文字会偏上

## css背景

### 背景颜色

background-color 

```
body {
  background-color: lightblue;
}
```

####  RGBA 的透明度

A:*alpha*

```
div {
  background: rgba(0, 128, 0, 0.3) /* 30% 不透明度的绿色背景 */
}
```

###   背景图片

background-img

~~~
body {
  background-image: url("paper.gif");
}
~~~

#### 背景图片的大小

https://www.w3school.com.cn/cssref/pr_background-size.asp

```
div
{
background:url(img_flwr.gif);
background-size:80px 60px;
background-repeat:no-repeat;
}
```


#### 背景图片重复

| 铺满               | 默认                          |
| ------------------ | ----------------------------- |
| 水平方向重复       | background-repeat: repeat-x   |
| 垂直方向重复       | background-repeat: repeat-y   |
| 只显示一次背景图像 | background-repeat: no-repeat; |

#### 背景图片的位置

https://www.w3school.com.cn/cssref/pr_background-position.asp

 background-position

| top left (左上)(顺序无关) | 如果您仅规定了一个关键词，那么第二个值将是"center"。默认值：0% 0%。 |
| ------------------------- | ------------------------------------------------------------ |
| x% y%(有顺序)             | 第一个值是水平位置，第二个值是垂直位置。左上角是 0% 0%。右下角是 100% 100%。如果您仅规定了一个值，另一个值将是 50%。 |
| xpos ypos                 | 第一个值是水平位置，第二个值是垂直位置。左上角是 0 0。单位是像素 (0px 0px) 或任何其他的 CSS 单位。如果您仅规定了一个值，另一个值将是50%。您可以混合使用 % 和 position 值。 |

#### 背景附着

https://www.cnblogs.com/Renyi-Fan/p/12300232.html

| 值      | 描述                                                    |
| :------ | :------------------------------------------------------ |
| scroll  | 默认值。背景图像会随着页面其余部分的滚动而移动。        |
| fixed   | 当页面的其余部分滚动时，背景图像不会移动。              |
| inherit | 规定应该从父元素继承 background-attachment 属性的设置。 |

## 权重(优先级)

https://www.cnblogs.com/cnblogs-jcy/p/8574177.html

| 标签选择器         | 计算权重公式 |
| ------------------ | ------------ |
| 继承或者*          | 0,0,0,0      |
| 标签选择器         | 0,0,0,1      |
| 每个类,伪类(class) | 0,0,1,0      |
| 每个id             | 0,1,0,0      |
| 每个行内样式       | 1,0,0,0      |
| 每个!important     | 无穷大       |

1. 权重高的优先
2. 相同权重下,采取后者优先的原则
3. css属性后面加 !important 时，无条件绝对优先

