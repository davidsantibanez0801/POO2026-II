package main.java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana3 extends Frame {

    Button btn1 = new Button("Presióname");
    Button btn2 = new Button("En segundo lugar a este");
    Button btn3 = new Button("Después a este");
    Button btn4 = new Button("Por último a este");

    public Ventana3() {

        super("Ventana con eventos");

        setSize(400,300);
        setResizable(false);
        setLayout(new GridLayout(3,2));

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
}