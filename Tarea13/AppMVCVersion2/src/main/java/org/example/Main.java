package org.example;

import controller.ControladorPrincipal;
import view.VentanaPrincipal;

public class Main {
    static void main() {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal(ventanaPrincipal);


    }
}
