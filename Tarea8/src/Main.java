public class Main {
    public static void main(String[] args) {
        MetodoPago pago1 = new TarjetaCredito("1234567890123456");
        MetodoPago pago2 = new PayPal("davidsantibanez51@aragon.unam.mx");

        pago1.procesarPago(1500.50);
        pago1.mostrarDetalles();

        System.out.println("---------------------------");

        pago2.procesarPago(850.00);
        pago2.mostrarDetalles();
    }
}