package org.example.functional_interfaces;

import java.util.function.Predicate;

public class Predicate_FInterface {
    // Predicate for 'Checking', 'Yoxlamaq'
    // Gecilen argument ile ilgili bir onermeyi test eder.

    //BiPredicate?
    // Gecilen 2 argument ile ilgili bir onermeyi test eder

    public static void main(String[] args) {
        //Example-1
        Predicate<String> checkLength = str -> str.length() < 10;
        System.out.println(checkLength.test("Rouvsen"));
        //Example-2
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(7));//false, cause 7 is Odd
    }
}
