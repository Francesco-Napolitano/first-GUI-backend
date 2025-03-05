package org.example.giorno2;


import java.awt.*;

public class Graphics2DImages {
//questa classe l'ho creata per imparare a creare immagini in 2D
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(70,70,Color.blue,150,150,Color.red);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
    //a capo c'è un metodo per creare dei gradienti con colori casuali
//    public void paintComponent(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
//        Random random = new Random();
//        int red = random.nextInt(256);
//        int green = random.nextInt(256);
//        int blue = random.nextInt(256);
//        Color startColor = new Color(red, green, blue);
//        red = random.nextInt(256);
//        green = random.nextInt(256);
//        blue = random.nextInt(256);
//        Color endColor = new Color(red, green, blue);
//        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
//        g2d.setPaint(gradient);
//        g2d.fillOval(70, 70, 100, 100);
//    }
}
