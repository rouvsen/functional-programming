package org.example.functional_interfaces;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_FInterface {
    //    argument almir, return edir <T> - GET methodu kimidir
    //    bir sey yaradir, uretir - like a factory method

    // Consumer-in tersidir, Consumer 1 sey alir amma hechne return etmir
    // Supplier - bir argument almaz, amma geriye bir <T> return edir
    // Getter methodu kimi ishleyir, bir deyer uretib,yaradib return edir
    // Factory - yaradan(ureten), yaradilan(uretilen) yer kimi calishir

    public static void main(String[] args) {
        //sadece geriye String return edecek, <String> demishem
        Supplier<String> str = () -> "rouvsen github";
        System.out.println(str.get()); //Supplier - Like GETTER

        Supplier<Date> now = () -> new Date();
        System.out.println(now.get()); //Supplier - Like GETTER
    }
}
