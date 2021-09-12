# css布局

## display

每个元素都有一个默认的display,这与元素的类型相关.

通常的默认值为block,inline

| block  | 此元素将显示为块级元素，此元素前后会带有换行符。   |
| ------ | -------------------------------------------------- |
| inline | 默认。此元素会被显示为内联元素，元素前后没有换行符 |

block的和inline的区别

https://blog.csdn.net/qq_37162090/article/details/86029743

## ==position==

position属性指定一个元素（静态的，相对的，绝对或固定）的定位方法的类型。

### relative

相对定位,相对于正常位置进行定位

```
.relative1 {
  position: relative;
}
.relative2 {
  position: relative; 
  top: -20px; //上方减去20px距离
  left: 20px; //左边增加20px距离
  background-color: white;
  width: 500px;
}
```

### fixed

 一个固定定位（position属性的值为fixed）元素会相对于视窗来定位，这意味着即便页面滚动，它还是会停留在相同的位置。和 `relative` 一样， `top` 、 `right` 、 `bottom` 和 `left` 属性都可用。

### absolute

相对于*最近的“positioned”祖先元素*

~~~css
.relative {
  position: relative;
  width: 600px;
  height: 400px;
}
.absolute {
  position: absolute;
  top: 120px;
  right: 0;
  width: 300px;
  height: 200px;
}
~~~

