package com.example.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics;
import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
import static java.util.stream.Collector.Characteristics.UNORDERED;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/4/6 4:24 下午
 * @description
 */

public class MySetCollector<T> implements Collector<T, Set<T>, Set<T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked!");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        return Set<T>::add;
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked");
        return (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
        System.out.println("finisher invoked");
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked");
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH, UNORDERED));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome", "hello");
        Set<String> collect = list.stream().collect(new MySetCollector<>());
        System.out.println(collect);
    }
}
