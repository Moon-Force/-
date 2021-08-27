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

# 颜色描述方式hsl(）

- ==h:色相==(Hue)

  色相用色环来代替光谱，色相值就是色环里面的颜色对应的从 0 到   360 度的角度值。

- ==s:饱和度==(Saturation)

   色彩的纯度，越高色彩越纯，低则逐渐变灰，取0-100%的数值。

- ==l:亮度==(Lightness)

  取0-100

   其中，100% 的亮度表示纯白色， 0% 的亮度则表示纯黑色；而 50% 的亮度就表示在色相中选取的颜色。

# **CSS 线性渐变**

## 1.linear-gradient()

```css
background: linear-gradient(gradient_direction, color 1, color 2, color 3, ...)
```

**gradient_direction:渐变角度**

## 2.repeating-linear-gradient()

重复渐变

![image-20210815215043212](https://gitee.com/moon-force/picgo/raw/master/img/image-20210815215043212.png)

![image-20210815215107825](https://gitee.com/moon-force/picgo/raw/master/img/image-20210815215107825.png)

# 网络背景图源

`background` 属性支持使用 `url()` 函数作为属性值

~~~
<style>
  body {
    background:url(https://cdn-media-1.freecodecamp.org/imgr/MJAkxbh.png);
  }
</style>
~~~

## **Transform scale 属性可以更改元素的大小**通过

```css
p {
  transform: scale(2);
}
```

段落元素放大到了原来的 2 倍

# **Transform skex**

**沿X轴倾斜元素**

 transform: skewY(-10deg);

# **Transform skey**

**沿Y轴倾斜元素**

 transform: skewX(24deg);

## **CSS 的关键帧和动画**

animation-name 动画的名称

animation-duration 动画的时间

### `@keyframes` 可以通过设置特定时间点的行为来创建动画。

```css
#anim {
  animation-name: colorful;
    设置动画的名称
  animation-duration: 3s;
}

@keyframes colorful {
  0% {
    background-color: blue;
  }
  100% {
    background-color: yellow;
  }
}
```
~~~
<style>
  div {
    height: 40px;
    width: 70%;
    background: black;
    margin: 50px auto;
    border-radius: 5px;
    position: relative;
  }
  #rect {
    animation-name: rainbow;
    animation-duration: 4s;
  }


  @keyframes rainbow {
    0% {
      background-color: blue;
      top: 0px;
    }
    50% {
      background-color: green;
      top: 50px;
    }
    100% {
      background-color: yellow;
      top: 0px;
    }
  }
</style>
<div id="rect"></div>
~~~

## 不透明度(opacity)

~~~
<style>

  #ball {
    width: 70px;
    height: 70px;
    margin: 50px auto;
    position: fixed;
    left: 20%;
    border-radius: 50%;
    background: linear-gradient(
      35deg,
      #ccffff,
      #ffcccc
    );
    animation-name: fade;
    animation-duration: 3s;
  }

  @keyframes fade {
    50% {
      left: 60%;
     opacity:0.1;
    }
  }

</style>

<div id="ball"></div>
~~~

## animation属性

- animation-name
- animation-duration
- animation-timing-function
- animation-delay
- animation-iteration-count
- animation-direction

| *[animation-name](https://www.w3school.com.cn/cssref/pr_animation-name.asp)* | 规定需要绑定到选择器的 keyframe 名称。。 |
| ------------------------------------------------------------ | ---------------------------------------- |
| *[animation-duration](https://www.w3school.com.cn/cssref/pr_animation-duration.asp)* | 规定完成动画所花费的时间，以秒或毫秒计。 |
| *[animation-timing-function](https://www.w3school.com.cn/cssref/pr_animation-timing-function.asp)* | 规定动画的速度曲线。                     |
| *[animation-delay](https://www.w3school.com.cn/cssref/pr_animation-delay.asp)* | 规定在动画开始之前的延迟。               |
| *[animation-iteration-count](https://www.w3school.com.cn/cssref/pr_animation-iteration-count.asp)* | 规定动画应该播放的次数。                 |
| *[animation-direction](https://www.w3school.com.cn/cssref/pr_animation-direction.asp)* | 规定是否应该轮流反向播放动画。           |

### 1.animation-fill-mode

forwards 保持高亮

### 2.animation-iteration-count

播放次数

| 值       | 描述                     |
| :------- | :----------------------- |
| *n*      | 定义动画播放次数的数值。 |
| infinite | 规定动画应该无限次播放。 |

### 2.animation-timing-function

| linear                        | 动画从头到尾的速度是相同的。                                 | [测试](https://www.w3school.com.cn/tiy/c.asp?f=css_animation-timing-function) |
| ----------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| ease                          | 默认。动画以低速开始，然后加快，在结束前变慢。               | [测试](https://www.w3school.com.cn/tiy/c.asp?f=css_animation-timing-function&p=2) |
| ease-in                       | 动画以低速开始。                                             | [测试](https://www.w3school.com.cn/tiy/c.asp?f=css_animation-timing-function&p=3) |
| ease-out                      | 动画以低速结束。                                             | [测试](https://www.w3school.com.cn/tiy/c.asp?f=css_animation-timing-function&p=4) |
| ease-in-out                   | 动画以低速开始和结束。                                       | [测试](https://www.w3school.com.cn/tiy/c.asp?f=css_animation-timing-function&p=5) |
| cubic-bezier(*n*,*n*,*n*,*n*) | 在 cubic-bezier 函数中自己的值。可能的值是从 0 到 1 的数值。 | https://www.jianshu.com/p/d999f090d333  详细解析             |

## **使用 audio 元素提高音频内容的可访问性**

```
<body>
 <header>
  <h1>Real Coding Ninjas</h1>
 </header>
 <main>
    <p>A sound clip of Zersiax's screen reader in action.</p>
<audio id="meowClip" controls>
 <source src="https://s3.amazonaws.com/freecodecamp/screen-reader.mp3" type="audio/mpeg">
</audio>
 </main>
</body>
```

## accesskey+ 属性== Alt + accessKey

用于指定激活元素或者使元素获得焦点的快捷键

```


<!DOCTYPE html>
<html>
<body>

<a href="http://www.w3school.com.cn/html/" accesskey="h">HTML 教程</a><br />
<a href="http://www.w3school.com.cn/css/" accesskey="c">CSS 教程</a>

<p><b>注释：</b>请使用Alt + <i>accessKey</i> (或者 Shift + Alt + <i>accessKey</i>) 来访问带有指定快捷键的元素。</p>

</body>
</html>


```

## tabindex   (tab 键顺序)

可以规定tab指定元素的顺序 

| 值       | 描述                                      |
| :------- | :---------------------------------------- |
| *number* | 规定元素的 tab 键控制次序（1 是第一个）。 |

## **创建一个媒体查询**

下面是一个媒体查询的例子，当设备宽度小于或等于 `100px` 时返回内容：

```css
@media (max-width: 100px) { /* CSS Rules */ }
```

以下定义的媒体查询，是当设备高度大于或等于 `350px` 时返回内容：

```css
@media (min-height: 350px) { /* CSS Rules */ }
```

## 视窗单位 **排版根据设备尺寸自如响应**

- `vw`：如 `10vw` 的意思是视窗宽度的 10%。
- `vh：` 如 `3vh` 的意思是视窗高度的 3%。
- `vmin：` 如 `70vmin` 的意思是视窗的高度和宽度中较小一个的 70%。
- `vmax：` 如 `100vmax` 的意思是视窗的高度和宽度中较大一个的 100%。



## **flex-direction 属性创建一个**行

 `display: flex` 属性可以让它变成 flex 容器， 然后可以让元素的项目排列成行或列。 

只要给父元素添加 `flex-direction` 属性，并把属性值设置为 `row `或 `column`，即可横向排列或纵向排列它的所有子元素。 

`flex-direction` 的其他可选值还有 `row-reverse` 和 `column-reverse`。

## align-items与 justify-content

`justify-content` 属性使 flex 子元素沿主轴排列。 行的主轴是水平线，列的主轴是垂直线。

Flex 容器中，与主轴垂直的叫做 **cross axis（交叉轴）**。 行的交叉轴是垂直的，列的交叉轴是水平的。

