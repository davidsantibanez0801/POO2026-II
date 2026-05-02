package main.java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana2 extends Frame {

    Button btn1 = new Button("Norte");
    Button btn2 = new Button("Sur");
    Button btn3 = new Button("Este");
    Button btn4 = new Button("Oeste");

    public Ventana2() {

        super("Ventana con eventos");

        setSize(400,300);
        setResizable(false);
        setLayout(new BorderLayout());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);
        add(btn3, BorderLayout.EAST);
        add(btn4, BorderLayout.WEST);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
}