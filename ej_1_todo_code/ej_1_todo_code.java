package ej_1_todo_code;
import java.util.Scanner;

public class ej_1_todo_code {
    public static void main(String... args) {
        String nombres [] = new String[8];
        System.out.println("A continuación, ingrese los nombres...");

        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++){
            System.out.print("Ingrese un nombre: ");
            nombres[i] = teclado.nextLine();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("El nombre en la posición " + i + " es: " + nombres[i]);
        }
        teclado.close();
    }
}
