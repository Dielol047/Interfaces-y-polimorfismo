class PayPal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " vía PayPal.");
    }
}