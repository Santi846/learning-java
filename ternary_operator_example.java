import java.util.Scanner;

public class ternary_operator_example {
    public static void main(String[] args) {
        // programa que dependiendo de la cantidad de productos de una merceria,
        // determina la compra a realizar

        boolean continuar = true;

        int cantidadProductos;
        int minimoCompra = 5;
        int maximoCompra = 15;

        while (continuar) {

            System.out.println("Ingrese la cantidad de productos a llevar (0 para salir): ");

            // suprimir warnings
            @SuppressWarnings("resource")
            Scanner teclado = new Scanner(System.in);

            cantidadProductos = teclado.nextInt();

            if (cantidadProductos == 0) {
                continuar = false;
            }

            String evaluacion = (cantidadProductos < minimoCompra) ? "No se permiten compras inferiores a 5 productos"
                    : (minimoCompra <= cantidadProductos && maximoCompra >= cantidadProductos)
                            ? "El costo de envio es de 10USD"
                            : (cantidadProductos > maximoCompra) ? "El envio es gratuito" : "Error de envio";

            System.out.println("Envio de productos de la merceria: " + evaluacion);

        }

    }
}
