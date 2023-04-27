package org.example.Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimerExample1 {
    public static void main(String[] args) {

        ActionListener actionListener = new TimePrinter1();
        Timer timer = new Timer(1000, actionListener);
        timer.start();

        JOptionPane.showMessageDialog
                (null, "Quit Program ?");
        timer.stop(); //or System.exit(0); for kill JVM
    }
}

class TimePrinter1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Date date = new Date();
        System.out.println("current time: " + date);
        Toolkit.getDefaultToolkit().beep();
    }
}
