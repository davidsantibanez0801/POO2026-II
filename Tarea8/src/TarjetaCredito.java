
public class TarjetaCredito implements MetodoPago {
    private String numeroTarjeta;

    public TarjetaCredito(String numero) {
        this.numeroTarjeta = numero;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito.");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Método: Tarjeta de Crédito | Terminación: " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }
}