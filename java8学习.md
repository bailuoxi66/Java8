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

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210131164248877.png" alt="image-20210131164248877" style="zoom:50%;" />

4、注：如果一个接口声明类一个抽象方法（父类的方法），函数式接口的抽象方法个数不增加。本质是接口的实现类也会继承java.lang.Object。

## 1.3 lambda和函数式接口

lambda针对的是函数式接口。同理：本意就是实现接口里面的哪一个抽象方法

```java
test2.myTest(() -> {
            System.out.println("myInterface");
        });
//相当于接口的实现
MyInterface myInterface = () -> {
            System.out.println("hello");
        };
```

## 1.4 为何需要lambda表达式

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210131173131270.png" alt="image-20210131173131270" style="zoom:30%;" />

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210131173331018.png" alt="image-20210131173331018" style="zoom:20%;" />

