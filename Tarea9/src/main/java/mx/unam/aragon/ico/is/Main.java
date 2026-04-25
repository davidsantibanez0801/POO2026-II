package mx.unam.aragon.ico.is;

import java.util.Scanner;

public class Main {
    static void main() {

        CalculadoraIMC calc = new CalculadoraIMC();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa tu Peso");
            calc.setPeso(sc.nextDouble());
            System.out.println("Ingresa tu Altura");
            calc.setAltura(sc.nextDouble());
        } catch (Exception e) {
            System.out.println("Error, revisa tu entrada");

        }

            calc.CalculadoraIMC();

        System.out.println("Su IMC es: " + calc.getImc());
    }
}