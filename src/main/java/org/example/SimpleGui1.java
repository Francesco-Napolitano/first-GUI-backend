package org.example;

import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //serve solo a spegnere il programma quando si vuole chiudere la finestra

        frame.getContentPane().add(button);
        //add button (also called widget) to frame

        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
