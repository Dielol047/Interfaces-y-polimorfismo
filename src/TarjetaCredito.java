class TarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " vía Tarjeta de Crédito.");
    }
}