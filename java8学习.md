# 一、新特性

介绍：Java8可谓是Java语言历史上变化最大的一个版本，其承诺要调整java编程想着函数式风格迈进，这有助于编写出更为简洁、表达力更强，并且在很多情况下能够利用并行硬件的代码。

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210129002426258.png" style="zoom:33%;" />

## 1.1 lambda的基本表达式

```java
(param1, param2, param3) -> {
}
```

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210129144321280.png" alt="image-20210129144321280" style="zoom:50%;" />

forEach有个参数Consumer<? super Integer>表示泛型，表示Consumer当前这个参数要么是Integer，要么是Integer的父类

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210129144724511.png" alt="image-20210129144724511" style="zoom:40%;" />

## 1.2 函数式接口

1、如果一个接口只有一个抽象方法，那么该接口就是一个函数式接口

2、如果我们在某个接口上声明了FunctionalInterface，那么编译器就会按照函数式接口要求该接口，不满足条件的话，编译器会给报错

3、如果某个几口只有一个抽象方法，但是我们没有给该接口声明FunctionalInterface，那么依旧将该接口当作函数式接口

