public interface MetodoPago {
    // Las interfaces definen "qué" debe hacer un objeto, pero no "cómo"
    void procesarPago(double monto);
    void mostrarDetalles();
}