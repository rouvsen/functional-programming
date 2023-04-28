package org.example;

import java.util.Arrays;
import java.util.List;

public class Reduce_Example {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        Integer sum = numbers.stream()
                .reduce(0, (a,b) -> a + b);//or Integer::sum
        System.out.println("sum: "+sum);

        // reduce() - ?
        // İlk parametre olarak 0 başlangıç değeri verildi
        // ve ikinci parametre olarak bir lambda ifadesi
        // (a, b) -> a + b kullanıldı.
        // Bu lambda ifadesi, iki sayıyı toplayarak bir sonuç döndürür.
    }
}
