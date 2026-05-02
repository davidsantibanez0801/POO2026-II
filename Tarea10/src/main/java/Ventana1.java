package main.java;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana1 extends Frame {

    Button boton1;
    TextField texto;

    public Ventana1() {

        super("Mi primer ventana");

        setSize(500,300);
        setLayout(new FlowLayout());

        boton1 = new Button("Botón 1");
        texto = new TextField(10);

        add(boton1);
        add(texto);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
}
