package org.example.functional_interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer_FInterface {
//    argument alir ve tuketir, istifade edir - SET methodu kimidir
    // f.e: System.out.println(); bir Consumer-dir,
    // deyer alir uzerinde is gorur, hechne return etmir.

    // BiConsumer? 2 argument alir
    // 2 argument alan Setter kimi (2 argumentli Setter) calishir

    // Bir sey alir, geriye bir sey return etmir! Consumer

    public static void main(String[] args) {
        //Consumer
        Consumer<String> toLowerCase =
                str -> System.out.println(str.toLowerCase());

        //BiConsumer
        BiConsumer<String,String> concat =
                (str1, str2) -> System.out.println(str1 + str2);
    }
}
