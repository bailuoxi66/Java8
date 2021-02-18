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

## 1.5 lambad表达式深入和流初步

（从java8开始接口里面可以包含方法的实现：Default Method，也可以包含静态方法static method（可以有自己的实现））

（如果一个接口只有一个抽象方法，那么该接口就是一个函数式接口）

```java
				TheInterface1 t1 = () -> {};
        TheInterface2 t2 = () -> {};
        System.out.println(t1.getClass().getInterfaces()[0]);
        System.out.println(t2.getClass().getInterfaces()[0]);

        //lambda表达式依赖于上下文，没有上下文lambda表达式的上下文无从得知的
        //函数式接口的抽象方法对lambda来说毫无意义，名字本身对于接口的实现来说还是很关键的
        () -> {};
```

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210203144643112.png" alt="image-20210203144643112" style="zoom:50%;" />

如上：stream和parallelStream面向的领域是不同的

- stream是一个串形流，整个操作上由一个单线程完成的
- parallelStream上并行流，是由多线程完成的

## 1.6 理解function

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210205001416703.png" alt="image-20210205001416703" style="zoom:50%;" />

如上：T是输入类型，R是返回类型

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210205003319977.png" alt="image-20210205003319977" style="zoom:50%;" />

如上：其实是四种方法引用当中的一种。这是一个实例方法，不是一个静态方法。说明我们在使用toUpperCase的时候一定需要一个String的对象，通过对象来调用toUpperCase；然而对于如上操作，String是一个类，相当于用类来引用了实例方法（当然不能写成String.toUpperCase，因为不是静态方法，不能使用类来进行调用）

对于「类：：实例方法，那么实例方法的第一个输入参数一定是调用了方法的对象，也就是lambda的第一个参数

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210205005043033.png" alt="image-20210205005043033" style="zoom:20%;" />

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210205005054304.png" alt="image-20210205005054304" style="zoom:30%;" />

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210205005202208.png" alt="image-20210205005202208" style="zoom:30%;" />

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210205005338262.png" alt="image-20210205005338262" style="zoom:40%;" />

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210205005357573.png" alt="image-20210205005357573" style="zoom:40%;" />

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210205005438752.png" alt="image-20210205005438752" style="zoom:40%;" />

高阶函数：如果一个函数的参数是一个函数，或者一个函数的返回值是一个函数，那么该函数就是高阶函数

## 1.7 function and biz function

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210207155627371.png" alt="image-20210207155627371" style="zoom:40%;" />

BiFunction:满足输入两个参数，得到一个返回参数的函数式接口

## 1.8  predict注意事项

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210208133403467.png" alt="image-20210208133403467" style="zoom:50%;" />

这种写法可能会造成空指针异常，不建议这样使用，建议如下方式使用！！！，如果为null的情况，也仅仅是判断为false而已

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210208133648648.png" alt="image-20210208133648648" style="zoom:50%;" />

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210208134126211.png" alt="image-20210208134126211" style="zoom:50%;" />

重点关注下上面这一条：使用return进行返回

## 1.9 理解相关函数式接口

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210208153334440.png" alt="image-20210208153334440" style="zoom:50%;" />

# 二、Optional

## 2.1 解决什么

optional存在的意义主要是为了解决：NPE（NullPointerException），以前避免空指针异常主要依赖如下代码编写：

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210208154723698.png" alt="image-20210208154723698" style="zoom:50%;" />

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210209140015640.png" alt="image-20210209140015640" style="zoom:50%;" />

如上：两种写法没有什么区别。optional的出现，里面的方法都是基于函数式风格使用的，写法风格需要进行注意

```
optional.ifPresent(item -> System.out.println(optional.get()));
```

# 三、方法引用

## 3.1 method reference

方法引用实际上是lambda表达式的语法糖（本身没有提供新的功能，但是可以通过更加简洁/方便的方式去调用，替换掉比较复杂的写法）

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210210111841951.png" alt="image-20210210111841951" style="zoom:50%;" />

如上：out本身是一个PrintStream类型的引用，同时PrintStream存在若干个println重载的方法

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210210112155036.png" alt="image-20210210112155036" style="zoom:50%;" />

所以：如上是调用了PrintStream的方法

- 方法引用：我们可以将方法引用看作是函数指针：function pointer
- 方法引用总共分为4类
  - 类名：：静态方法名
  - 引用名（对象名）：：实例方法名
  - 类名：：实例方法名
  - 构造方法引用  类名：：new

## 3.2 类名::静态方法名

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210210115337703.png" alt="image-20210210115337703" style="zoom:50%;" />

如上：两种没有任何关系

第一种是：静态方法调用的形式（Student.CompareByScore）本身不能作为表达式存在，需要在后面加上一个（），同时根据是否有参数进行传递，真正表示的方法调用的这么一种概念

第二种是：方法引用的形式，是一种叫方法引用的表达式形式，是一种函数指针，指向另外一个函数，使用的时候不能给传递参数的，是运行的时候自动传递进来的

## 3.3 引用名（对象名）::实例方法名

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210210121539509.png" alt="image-20210210121539509" style="zoom:50%;" />

## 3.4 类名::实例方法名

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210211105556752.png" alt="image-20210211105556752" style="zoom:50%;" />

第一个参数是实例方法的调用者。后续所有的参数都是实例方法的参数

## 3.5 默认方法出现的原因？

jdk8有了新特性后，需要保证向后兼容，为了避免对既有代码产生破坏

例如：List原生接口，MyList继承了原生接口，想在List新增一个sort方法。对于以前的代码而言，MyList势必需要实现该接口。为了向下兼容所以产生了默认方法，因为MyList可以直接使用该方法，而不需要重新实现

# 四、Stream

stream以及lambda更方便的处理集合，搭配使用

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210214115125450.png" alt="image-20210214115125450" style="zoom:50%;" />

Stream里面的peek是一个高阶函数，也就是说函数的参数是一个lambda表达式<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210214115217234.png" alt="image-20210214115217234" style="zoom:50%;" />

Stream是一个接口，也是一个泛型，T表示流的类型

## 4.1 流的组成

- 源
- 零个或多个中间操作
- 终止操作

## 4.2 流的分类

- 惰性求值
  - stream.xxx.yyy.zzz.count()       有了count终止操作后，xxx/yyy/zzz才会被终止操作，如果没有count是不会计算xxx/yyy/zzz的
- 及早求值
  - 对于如上的count，是立刻就要把结果拿到

## 4.3 stream的创建

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210214120940833.png" alt="image-20210214120940833" style="zoom:50%;" />

如上可知：of的参数是可变参数。

## 4.4 区别？

问题？lambda和stream到底是什么呢？相比于传统的面向对象编程两者的根本区别是什么呢？

以前面向对象传递的是数据，现在函数式编程通过方法传递的是一种行为

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210215121319839.png" alt="image-20210215121319839" style="zoom:50%;" />

## 4.5 stream的使用注意点

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210217120027775.png" alt="image-20210217120027775" style="zoom:50%;" />

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210217115955803.png" alt="image-20210217115955803" style="zoom:50%;" />

如上的区别是什么？map的Function的泛型是T/R，它们都是对象，使用中会返回Integer，而ToIntFunction返回的是int，可以避免自动装箱/自动拆箱的转化，会涉及到一点点的性能损耗，所以对于jdk而言，极力的避免性能损耗问题，所以提供了原生类型的方法

## 4.6 内部迭代与外部迭代本质剖析

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210217191807989.png" alt="image-20210217191807989" style="zoom:40%;" />

<img src="/Users/luoyu/Library/Application Support/typora-user-images/image-20210217191941723.png" alt="image-20210217191941723" style="zoom:40%;" />

![image-20210217212603628](/Users/luoyu/Library/Application Support/typora-user-images/image-20210217212603628.png)

stream本身就是一个描述性的语言。

集合关注的是数据与数据存储本身。

流关注的是对数据的计算。

流与迭代器类似的一点是：流是无法重复使用或者消费的。

中间操作都会返回一个stream对象，Stream<Student>、Stream<Integer>等

终止操作不会返回stream类型，可能不返回值，也有可能返回其他类型的单个值

- 并发的本质是fork join，将很多的大任务分成小任务的行为