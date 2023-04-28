package org.example.functional_interfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class Function_FInterface {// 1 argument alir, 1 result return edir

    // T - goturduyu argument 'type', R - return etdiyi result 'type'

    public static void main(String[] args) {

        Function<Integer,String> convertor = num -> Integer.toString(num);
        System.out.println("length of 87654: " +
                convertor.apply(87654).length());

        //Predicate kimi checking de etmek olar Function ile
        //Predicate: true/false return edir, check edir..
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("7 is even? " + isEven.test(7));//false

        Function<Integer, Boolean> isEven2 = num -> num % 2 == 0;
        System.out.println(isEven2.apply(7));;//false
    }

}
