package org.example.lambda;

public class _Lambda_Ex {

    public static void main(String[] args) {

        //version1
        doMath((a,b) -> a + b, 2, 3);

        //version2
        Math math = (a, b) -> a + b;
        double calculated = math.calculate(2, 3);
        System.out.println(calculated);
    }

    public static void doMath(Math math, double a, double b){

        double calculated = math.calculate(a, b);
        System.out.println(calculated + "\n" + "+++++++");

    }
}
