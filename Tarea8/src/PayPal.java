public class PayPal implements MetodoPago {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Redirigiendo a PayPal para pagar $" + monto);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Método: PayPal | Cuenta: " + email);
    }
}