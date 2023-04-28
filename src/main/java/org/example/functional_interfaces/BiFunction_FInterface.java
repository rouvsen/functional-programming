package org.example.functional_interfaces;

import java.util.function.BiFunction;

public class BiFunction_FInterface {

    // Bi - varsa demeli 2 argument goturur
    // BiPredicate, BiFunction ..

    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> sumAndConvertToSpring =
                (num1, num2) -> String.valueOf(num1+num2);
        String result = sumAndConvertToSpring.apply(3, 5);
        System.out.println("3 + 5 to String: " + result);
    }

}
