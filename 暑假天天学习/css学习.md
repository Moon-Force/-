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

