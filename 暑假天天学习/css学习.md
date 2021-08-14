# 更改文本颜色

## 1.style内设置

~~~
<h2 style="color:red;">
    1.改变文本颜色
</h2>
~~~
## 2.使用元素选择器来设置元素的样式

```html
<h2>
    gg
</h2>
<style>
  h2 {
    color: red;
  }
</style>
```

## 3.使用class选择器设置样式

~~~
<style>
  .red-text {
    color: red;
  }
</style>
<h2 class="red-text">CatPhotoApp</h2>
~~~

# 更改文字大小

```css
h1 {
  font-size: 30px;
}
```

# 更改字体样式

```css
h2 {
  font-family: sans-serif;
}
```

# 更改图片大小

给定图片class名称

再在style里更改

```html
<style>
  .larger-image {
    width: 500px;
  }
</style>
<a href="#"><img class="smaller-image"src="https://bit.ly/fcc-relaxing-cat" alt="A cute orange cat lying on its back."></a>
```

# 给元素周围添加边框

```html
<style>
  .thin-red-border {
    border-color: red;
    border-width: 5px;
    border-style: solid;
  }
</style>
```

# **用 border-radius 添加圆角边框**

 Border-radius:10px;

# 设置id

除了 class 属性，每一个 HTML 元素都有一个 `id` 属性。

使用 `id` 有几个好处：你可以通过 `id` 选择器来改变单个元素的样式。在稍后的课程中，你还会了解到如何在 JavaScript 里面用它来选择和操作元素。

根据规范，`id` 属性应是唯一的。 尽管浏览器并非必须执行这条规范，但这是广泛认可的最佳实践。 因此，请不要给多个元素设置相同的 `id`。

设置 `h2` 元素的 id 为 `cat-photo-app` 的代码如下：

```html
<h2 id="cat-photo-app">
```

```css
#cat-photo-element {
  background-color: green;
}
```

# **调整元素的内边距(padding)**

 .red-box {

  background-color: crimson;

  color: #fff;

  padding: 20px;

 }

# **调整元素的外边距(margin)**

 .red-box {

  background-color: crimson;

  color: #fff;

  padding: 20px;

  margin: 20px;

 }

# **使用属性选择器来设置元素的样式**通过

面的代码会改变所有 `type` 为 `radio` 的元素的外边距。

```css
[type='radio'] {
  margin: 20px 0px 20px 0px;
}

```

# 样式的优先级

Class大于继承样式

ID选择器大于Class

内联样式大于ID选择器

**Important 的优先级最高**通过

```css
color: red !important;
```

# **使用 text-align 属性创建视觉平衡**

web 内容大部分都是文本。 CSS 里面的 `text-align` 属性可以控制文本的对齐方式。

`text-align: justify;` 可以让除最后一行之外的文字两端对齐，即每行的左右两端都紧贴行的边缘。

`text-align: center;` 可以让文本居中对齐。

`text-align: right;` 可以让文本右对齐。

`text-align: left;` 是默认值，它可以让文本左对齐。

# 加粗字体strong

<p>Google was founded by Larry Page and Sergey Brin while they were Ph.D. students at <strong>Stanford University.</strong></p>

# **使用 u 标签给文本添加下划线**

<p>Google was founded by Larry Page and Sergey Brin while they were Ph.D. students at <u>Stanford University</u>.</p>

# **使用 em 标签强调文本**

你可以使用 `em` 标签来强调文本。 由于浏览器会自动给元素应用 `font-style: italic;`，所以文本会显示为斜体。

  <p><em>Google was founded by Larry Page and Sergey Brin while they were <u>Ph.D. students</u> at <strong>Stanford University</strong></em>.</p>

# **使用 s 标签给文本添加删除线**

 <h4><s>Google</s>Alphabet</h4>

# rgba()

rgba 代表：
 r = red 红色
 g = green 绿色
 b = blue 蓝色
 a = alpha 透明度

background-color: rgba(45, 45, 45, 0.1)

#  **Text-Transform 属性**

| `lowercase`  | "transform me"                     |
| ------------ | ---------------------------------- |
| `uppercase`  | "TRANSFORM ME"                     |
| `capitalize` | "Transform Me"                     |
| `initial`    | 使用默认值                         |
| `inherit`    | 使用父元素的 `text-transform` 值。 |
| `none`       | **Default:**不改变文字。           |

# **更改元素的相对位置**

| absolute | 生成绝对定位的元素，相对于 static 定位以外的第一个父元素进行定位。元素的位置通过 "left", "top", "right" 以及 "bottom" 属性进行规定。 |
| -------- | ------------------------------------------------------------ |
| fixed    | 生成绝对定位的元素，相对于浏览器窗口进行定位。元素的位置通过 "left", "top", "right" 以及 "bottom" 属性进行规定。 |
| relative | 生成相对定位的元素，相对于其正常位置进行定位。因此，"left:20" 会向元素的 LEFT 位置添加 20 像素。 |

 # 文本格式

- **设置多个标题元素的 font-size**

  `font-size` 属性用来指定元素内文字的大小。

- **设置多个标题元素的 font-weight**

  `font-weight` 属性用于设置文本中字体的粗细。

- **设置段落的 line-height**

   `line-height` 属性来设置行间的距离。 行高，顾名思义，可以用来设置每行文字所占据的垂直空间。

## 1.相对定位 (relative)

CSS 里控制各个方向偏移量的属性是 `left`、`right`、`top` 和 `bottom`。 它们代表从原来位置向远离该方向*偏移*指定的像素、百分比或者 em。 下面的例子展示了段落向上偏移 10px：

```css
p {
  position: relative;
  bottom: 10px;
}
```

## 2.绝对定位(absolute)

```
position:absolute;
top:50px;
right:50px;
```

直接定位，给定x，y值

## 3.固定定位(fixed)

相对于边框的定位

```
<html>

<head>
<style type="text/css">
p.one
{
position:fixed;
left:0px
top:0px;
距离左边和顶部的距离为0px
}
p.two
{
position:fixed;
top:5x;
right:5px;
距离顶部和右边的距离都为5
}
</style>
</head>

<body>

<p class="one">一些文本。</p>
<p class="two">更多的文本。</p>

</body>
</html>
```

# **使用 z-index 属性更改重叠元素的位置**

`z-index` 的取值是整数，数值大的元素会叠放到数值小的元素上面。

# **使用 margin 属性将元素水平居中**

## 1.
