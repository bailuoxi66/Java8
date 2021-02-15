package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/2/14 12:08 下午
 * @description stream的创建
 */

public class StreamTest {
    public static void main(String[] args) {
        Stream stream1 = Stream.of("hello", "world", "hello, world");

        String[] myArray = new String[]{"hello", "world", "hello, world"};
        Stream stream2 = Stream.of(myArray);

        //这里是of的实现
        Stream stream3 = Arrays.stream(myArray);

        List<String> list = Arrays.asList(myArray);
        Stream stream4 = list.stream();
    }
}
