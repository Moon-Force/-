# js学习

## ==实用函数==

### 1.push()函数 添加数到末尾

一个将数据添加到数组末尾的方法是 `push()` 函数。

```
var myArray = [["John", 23], ["cat", 2]];

myArray.push(["dog", 3]);
```

### 2.pop()函数 (弹出最后一个数)

`.pop()` 函数用来弹出一个数组末尾的值

```
var myArray = [["John", 23], ["cat", 2]];
// 只修改这一行下面的代码
var removedFromMyArray=myArray.pop(myArray);
```

### 3.shift()函数 (弹出第一个数)

移出第一个元素

```
var myArray = [["John", 23], ["dog", 3]];

var removedFromMyArray=myArray.shift();
```
### 4.unshift()函数(移入一个数到头部)

`unshift`（移入）一个元素到数组的头部。

```
var myArray = [["John", 23], ["dog", 3]];

myArray.shift();

myArray.unshift( ["Paul",35]);
```

##  创建函数

```js
function functionName() {
  console.log("Hello World");
}
```

## ==作用域==

### 全局作用域

- 在==函数外定义==的变量具有全局作用域.
- ==没有用var关键字==定义的变量,会自动创建在全局作用域

### 局部作用域

- 在==函数内用==var关键字==定义 ==一定要用var定义==,不然会变为全局变量
- 在函数外使用也默认为全局变量

**局部变量优先于全局变量**

# == (**相等运算符**) 和 === (**严格相等运算符**)

js中 == 来比较两者时 ==会自动转换数据==类型,例如

```
3 == '3' true
```

而===(严格等运算符)不会

**而!=也会==自动转换类型比较==**

**!==反之**

