import java.util.Scanner;

public class conditionals {
    public static void main(String... args) {
        int edad;

        System.out.println("Ingrese su edad: ");

        //suprimir warnings
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);

        edad = teclado.nextInt();

        if (edad > 18) {
            System.out.println("Según su edad: " + edad + " es mayor de edad.");
        } else {
            if (edad == 18) {
                System.out.println("Según su edad: " + edad + " es recientemente mayor de edad.");
            }
            else {
                System.out.println("Según su edad: " + edad + " es menor de edad.");
            }
        }

        System.out.println("Cierre del programa."); 
    }
}
