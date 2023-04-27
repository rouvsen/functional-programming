package org.example.anonymous_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clazz {

    public static void main(String[] args) {
        sayHello();
    }

    public static void sayHello(){
        new ActionListener() { //Anonymous Class
            @Override
            public void actionPerformed(ActionEvent e) {
            }
            public void sayHello() {
                System.out.println("Hello");
            }
        }.sayHello();//Object-in method-unu cagiririq ele havadaca
        //ActionListener func. interface-ini (ve method-larini) implement eden Anonymous Class yaranir
        //ve hemin Anonymous Class-in Object-i yaranir, Class yaranir sonra hemin Class-in Object-i yaranir (new demishik axi hem de).
    }



}
