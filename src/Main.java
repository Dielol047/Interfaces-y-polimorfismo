import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monto = -1;


        while (monto < 0) {
            System.out.print("Ingrese el monto a pagar: ");
            String entrada = scanner.nextLine();


            if (entrada.matches("^[0-9]+(\\.[0-9]+)?$")) {
                monto = Double.parseDouble(entrada);
            } else {
                System.out.println("Error: Ingrese solo números positivos.");
            }
        }


        MetodoPago metodo = null;
        while (metodo == null) {
            System.out.print("Elija método (1: PayPal, 2: Tarjeta): ");
            String opcion = scanner.nextLine();

            if (opcion.equals("1")) metodo = new PayPal();
            else if (opcion.equals("2")) metodo = new TarjetaCredito();
            else System.out.println("Error: Opción inválida.");
        }

        metodo.procesarPago(monto);
        scanner.close();
    }
}