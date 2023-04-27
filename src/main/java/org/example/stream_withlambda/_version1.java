package org.example.stream_withlambda;

import java.util.Arrays;

public class _version1 {

    public static void method(){

        Arrays.stream(new int[]{1,2,3,4,5,6,7})
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .average()
                .ifPresent(System.out::println);

        System.out.println("+++++++++++");
    }
}
